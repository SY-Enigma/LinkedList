package com.sy.wwek7;

import javax.swing.*;

/**
 * @ClassName LoginFrame
 * @Description TODO
 * @Author SY
 * @Date 2020/11/9
 **/
public class LoginFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel centerPanel;
    private JPanel topPanel;
    private JPanel buttomPanel;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel loginPanel;
    private JPanel logoPanel;
    private JLabel logoLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton loginBtn;
    private JLabel loginLabel;
    private JLabel tipLabel;

    public  LoginFrame(){
        //调用初始化方法
        init();
        loginBtn.addActionListener(e ->{
            LoginService ll = new LoginService();
            String account = accountField.getText();
            char[] password = passwordField.getPassword();
            String passString = new String(password);
            boolean result = false;
            try {
                result = ll.login(account, passString);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            if(result){
                JOptionPane.showMessageDialog(null,"登陆成功");
                LoginFrame.this.dispose();
            } else {
                JOptionPane.showMessageDialog(null,"登陆失败");
                LoginFrame.this.dispose();
            }
        });
    }

    public  void  init(){
        setTitle("LoginFrame");
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);

    }


    public static void main(String[] args) {
        new  LoginFrame();

//        JFrame frame = new JFrame("LoginFrame");
        //获取屏幕分辨率
//        System.out.println(Toolkit.getDefaultToolkit().getScreenSize().height);
//        System.out.println(Toolkit.getDefaultToolkit().getScreenSize().width);

//        frame.setContentPane(new LoginFrame().mainPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        //frame.pack();
//        frame.setVisible(true);
    }


}
