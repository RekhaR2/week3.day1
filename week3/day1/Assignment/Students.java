package week3.day1.Assignment;

public class Students {
	public void getStudentInfo(int id)
	{	
		System.out.println("Id is " +id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println("Id is " + id);
		System.out.println("Name is " + name);
	}
	public void getStudentInfo(String email,String phoneNum)
	{
		System.out.println("email address is "+ email);
		System.out.println("Phone Number is "+ phoneNum);
	}
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(25);
		stud.getStudentInfo(20,"Rek");
		stud.getStudentInfo("xyz@gmail.com","9876543210");
	}
	
}
