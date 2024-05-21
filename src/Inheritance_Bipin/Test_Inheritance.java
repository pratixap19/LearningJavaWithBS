package Inheritance_Bipin;

public class Test_Inheritance {

	public static void main(String[] args) {
		
		BMW obj = new BMW();
		obj.start();
		obj.stop();
		obj.fuel();
		
		System.out.println("============================");
		
		Car car = new Car();
		car.race();
		car.clutch();
		car.Break();
		car.noOfSheets();
		
		System.out.println("============================");
		
		Car car1 = new BMW();
		car1.Break();
		car1.clutch();
		car1.race();
		car1.noOfSheets();
		car1.start();
		car1.stop();
		
		
	}

}
