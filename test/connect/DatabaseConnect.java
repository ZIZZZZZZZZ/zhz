package test.connect;

import java.sql.*;

/**
 * @author 龙
 */

public class DatabaseConnect {

    public static Connection getConnection() {
        // 驱动信息
        String driverName = "com.mysql.cj.jdbc.Driver";
        // 数据库连接参数
        String url = "jdbc:mysql://localhost:3306/zi?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=GMT";
        // 用户名
        String userName = "root";
        // 密码
        String password = "root";

        Connection collection = null;
        System.out.println("开始加载驱动......");
        // 注册驱动
        try {
            Class.forName(driverName);
            System.out.println("驱动加载成功！\n开始连接！");
            // 建立连接
            collection = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return collection;
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}
