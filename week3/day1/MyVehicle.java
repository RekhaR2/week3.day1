package week3.day1;

public class MyVehicle {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Audi audi = new Audi();
		audi.autoPark();
		car.openDoor();
		audi.applyBrake();
		//audi.soundHorn();
		
		audi.getKey();
		
	}
	
	

	
}
