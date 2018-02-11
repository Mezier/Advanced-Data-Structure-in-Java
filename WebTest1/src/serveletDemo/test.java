package serveletDemo;

import java.util.List;

import dao.StudentDao;
import dao.impl.StudentDaoImp;
import po.Student;

public class test {
	public static void main(String[] args) {
		StudentDao dao=new StudentDaoImp();
		List<Student> lists=dao.printAll();
		System.out.println(lists.get(2).toString());
	}
}
