package Studentdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.data.jdbcC;
import com.entity.Student;

public class StudentData {
public static  boolean insertStudent(Student st) {
	boolean f =false;
	
	try {
		
	Connection con =jdbcC.jdbcC1();
	String q= "Insert into students(sid,sname ,sphone, scity) values(?,?,?,?)";
	PreparedStatement p = con.prepareStatement(q);
	p.setInt(1, st.getStudentId());
	p.setString(2,st.getStudentName());
	p.setString(3, st.getStudentPhone());
	p.setString(4, st.getStudentCity());
	
	p.executeUpdate();
	f= true;
	}
	catch(Exception e) {
		
		e.printStackTrace();
	}
	return f;
}

public static boolean deleteStudent(int userId) {
	// TODO Auto-generated method 
	boolean f=false;
	try
	{
	Connection con = jdbcC.jdbcC1();
	String q="delete from students where id=?";
	PreparedStatement p = con.prepareStatement(q);
	
	p.setInt(1, userId);
	p.executeUpdate();
	f=true;
	
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return f;
}

public static void showAllStudent() {
	// TODO Auto-generated method stub
	boolean f=false;
	try
	{
	Connection con = jdbcC.jdbcC1();
	String q="select * from students";
	Statement s= con.createStatement();
	
	ResultSet set=s.executeQuery(q);
	
	while(set.next())
	{
		int id=set.getInt(1);
		String name=set.getString(2);
		String phone=set.getString(3);
		String city=set.getString(4);
		System.out.println("ID:"+ id);
		System.out.println("Name:"+name);
		System.out.println("Phone:"+phone);
		System.out.println("City:"+city);
		
		System.out.println("----------------------------");
		
	}
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

public static boolean updateStudent(Student st2, int userId2) {
	// TODO Auto-generated method stub
	boolean f=false;
	try
	{
 
	Connection con = jdbcC.jdbcC1();
	String q="update students set id=?, sname=?,sphone=? ,scity=? where id=?";
	PreparedStatement p = con.prepareStatement(q);
	p.setInt(1, st2.getStudentId());
	p.setString(2, st2.getStudentName());
	
	
	p.setString(3, st2.getStudentPhone());
	p.setString(4, st2.getStudentCity());
	p.setInt(5, userId2);
	
	
	//execute
	
	p.executeUpdate();
	f=true;
	
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return f;
}

}
