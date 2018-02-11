package serveletDemo;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dao.impl.StudentDaoImp;
import po.Student;

public class StudentServlet extends HttpServlet{
	
   @Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	   request.setCharacterEncoding("UTF-8");
	   response.setCharacterEncoding("UTF-8");
	
	/*String method=request.getParameter("method");
	if(method.equals("print")){
		print(request,response);
	}*/
	   StudentDao dao=new StudentDaoImp();
		List<Student> lists=dao.printAll();
		System.out.println(lists.get(0));
		request.setAttribute("stu",lists);
		request.getRequestDispatcher("list.jsp").forward(request,response);
}
   
	public void print(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentDao dao=new StudentDaoImp();
		List<Student> lists=dao.printAll();
		System.out.println(lists.get(0));
		request.setAttribute("stu",lists);
		request.getRequestDispatcher("list.jsp").forward(request,response);
		
	}
	
}
