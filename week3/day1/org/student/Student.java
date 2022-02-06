package week3.day1.org.student;

import week3.day1.org.department.Department;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Name of the Student --> Rekha");
	}
	public void studentDept()
	{
		System.out.print("Student Department --> ");
		deptName();
	}
	public void studentId()
	{
		System.out.println("Student ID --> 29");
	}
	
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.studentName();
		stud.studentDept();
		stud.studentId();	
	}
}

