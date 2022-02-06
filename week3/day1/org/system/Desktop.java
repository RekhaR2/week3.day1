package week3.day1.org.system;

public class Desktop extends Computer{

	public void desktopSize()
	{
		System.out.println("Size of the desktop is 14 inch");
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
	}
}
