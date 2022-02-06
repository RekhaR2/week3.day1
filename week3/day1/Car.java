package week3.day1;

public class Car extends Vehicle{
	public  void openDoor()
	{
		applyBrake();
		System.out.println("Open Door --> Car");
	}
	public void getKey()
	{
		System.out.println("Car Key");
	}
	
}
