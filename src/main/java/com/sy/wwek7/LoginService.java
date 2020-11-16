package com.sy.wwek7;

/**
 * @ClassName LoginService
 * @Description TODO
 * @Author SY
 * @Date 2020/11/9
 **/
public class LoginService {

    public boolean login(String account, String password) throws  Exception {
        if ("username".equals(account) && "password".equals(password)) {
            return true;
        } else {
            return false;
        }

//        String sql ="select * from admin where userName =? and password=?";
//        PreparedStatement ps = account.preparedStatement(sql);
//        ps.setString(1, password);
//        ResultSet rs = ps.executeQuery();
//        return  rs.next();
    }
}
