package dao.imp;

import dao.StudentDao;
import po.Student;
import utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao {
    public List<Student> printAll() {
        Connection con=null;
        PreparedStatement pr=null;
        ResultSet rs=null;
        List<Student> lists=new ArrayList<Student>();
        String sql="select * from student";
        con= DBUtils.getConnection();
        try {
            System.out.println(con+"------------");
            pr=con.prepareStatement(sql);
            rs=pr.executeQuery();
            while(rs.next()){
                Student u=new Student();
                u.setAge(rs.getInt(3));
                u.setId(rs.getInt(1));
                u.setStuName(rs.getString(2));
                lists.add(u);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            DBUtils.close(rs, pr, con);
        }
        return lists;
    }
}
