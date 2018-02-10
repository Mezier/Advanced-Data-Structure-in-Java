package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
	private Connection connect=null;
	private Statement stat=null;
	private ResultSet result=null;
	private String url="jdbc:mysql://localhost/test";
	private String user="root";
	private String passw="19960318";
    public void readDB() throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect=DriverManager.getConnection(url,user,passw);
			stat=connect.createStatement();
			result=stat.executeQuery("select * from test1");
			while(result.next()){
				System.out.println("id:"+result.getInt("id")+" stuName"+result.getString("stuname")+"  age"+result.getInt("age"));				
			}			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close();
		}
	}
     private void close(){
    	 try{
    		 if(result!=null){
    			 result.close();
    		 }
    		 if(stat!=null){
    			 stat.close();
    		 }
    		 if(connect!=null){
    			 connect.close();
    		 }
    	 }catch(Exception e){
    		 e.getMessage();
    	 }
     }
     public static void main(String[] args) throws Exception {
		JDBCTest j=new JDBCTest();
		j.readDB();
	}
}
