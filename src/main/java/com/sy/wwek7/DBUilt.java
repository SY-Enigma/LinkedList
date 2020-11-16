package com.sy.wwek7;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName DBUilt
 * @Description TODO
 * @Author SY
 * @Date 2020/11/9
 **/
public class DBUilt {

    private  static  String dbUrl = "jdbc:mysql://localhost:3306/db-gui";
    private static String dbUserName = "root";
    private static String dbPassword = "123";
    private static  String jdbcName = "com.mysql.jdbc.Driver";
    /**
     * 连接数据库
     *
     * @return
     * @throws Exception
     */
    public static Connection getCon() throws Exception {
        Class.forName(jdbcName);
        Connection con = DriverManager.getConnection(dbUrl, dbUserName,
                dbPassword);
        return con;
    }

    /**
     * 关闭数据库
     *
     * @param con
     * @throws Exception
     */
    public void closeCon(Connection con) throws Exception {
        if (con != null) {
            con.close();
        }
    }

    public static void main(String[] args) {
        DBUilt dbUilt = new DBUilt();
        try {
            DBUilt.getCon();
            System.out.println("数据库连接成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
