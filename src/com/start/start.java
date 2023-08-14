package com.start;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.entity.Student;

import Studentdata.StudentData;
public class start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean  go = true;
		while(go) {
			System.out.println("Press 1 to add new student");
			System.out.println("Press 2 to delete  student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to update application");
			System.out.println("Press 5 to exit application");
			 int c =Integer.parseInt(br.readLine());
			 switch(c) {
			 case 1:
				 System.out.println("Enter your id ");
				 int id= Integer.parseInt(br.readLine());
				 System.out.println("Enter User Name ");
				 String name = br.readLine();
				 System.out.println("Enter phonenumber ");
				 String phone = br.readLine();
				 System.out.println("Enter User city ");
				 String city = br.readLine();
				 
				 Student st = new Student(id,name, phone, city);
				 boolean ans = StudentData.insertStudent(st);
				 if(ans) {
					 System.out.println("added successfully");
				 }
				 else {
					 System.out.println("alert");
				 }
				 System.out.println(st);
				 break;
				 
			 case 2:
				 System.out.println("enter student id which you want to delete");
					int userId=Integer.parseInt(br.readLine());
					
					boolean f=StudentData.deleteStudent(userId);
					if(f)
					{
						System.out.println("Student deleted successfully");
					}
					else
					{
						System.out.println("Something went wrong...!");
					}
				 break;
			 case 3:
				 StudentData.showAllStudent();
				 break;
			 case 4:
				 System.out.println("enter student id whose data you want to update");
					int userId2 = Integer.parseInt(br.readLine());
					
					System.out.println("enter Student id :");
					int id2 = Integer.parseInt(br.readLine());
					
					System.out.println("Enter Student name :");
					String name2= br.readLine();
					
					System.out.println("Enter Student phone no :");
					String phone2= br.readLine();
					
					System.out.println("Enter Student city :");
					String city2= br.readLine();
					
					//create student object to store the data 
					Student st2 = new Student(id2,name2, phone2,city2);
					
					boolean ans2 =StudentData.updateStudent(st2,userId2);
					
					if(ans2)
					{
						System.out.println("student is updated successfully");
					}
					else
					{
						System.out.println("Something went wrong");
					}
					System.out.println(st2);
				 break;
			 case 5:
				 go= false;
				 break;
				 
				 default:
					 System.out.println("Wrong choice");
			 }
		}
		System.out.println("THANK YOU");

	}

}

