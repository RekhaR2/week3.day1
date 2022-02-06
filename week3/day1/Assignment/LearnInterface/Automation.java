package week3.day1.Assignment.LearnInterface;

public class Automation extends MultipleLanguage implements Language, TestTool{
	
	public void java()
	{
		System.out.println("Java");
	}
	public void selenium()
	{
		System.out.println("Selenium");
	}
	public void ruby()
	{
		System.out.println("Ruby");
	}
	public static void main(String[] args)
	{
		Automation obj = new Automation();
		obj.java();
		obj.selenium();
		obj.ruby();
		obj.python();
		
				
	}
}
