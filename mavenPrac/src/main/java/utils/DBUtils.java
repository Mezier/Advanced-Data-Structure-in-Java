package utils;

import java.sql.*;

public class DBUtils {
    private static String url = "jdbc:mysql://localhost/test?useSSL=false";
    private static String user = "root";
    private static String passw = "19960318";
    private static String className = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(className);
            con = DriverManager.getConnection(url, user, passw);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }
    public static void close(ResultSet rs, PreparedStatement ps, Connection con){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
