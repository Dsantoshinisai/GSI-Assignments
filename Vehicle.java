package Assignments;


class Vehiclenew
{
	String Brand;
	int speed;
	static String company = "AutoWorld Ltd";
	
	Vehiclenew(String Brand1 ,int speed1)
	{
		this.Brand =Brand1;
		this.speed=speed1;
	}
	
	void run()
	{
		System.out.println("Vehicle is running");
		
	}
	static void display()
	{
		System.out.println("Company: "+company);
	}
	 final void enginerType()
	{
		 String enginerType = "Standard Enginer";
			System.out.println("Engine type: " + enginerType);

		 
	}
	 
	  
}
class Car extends Vehiclenew
{
	String fuelType;
	Car(String Brand1 ,int speed1, String fuelType1)
	{
		super(Brand1,speed1);
		this.fuelType=fuelType1;
	}
	
	void print()
	{
		System.out.println("Brand : " +Brand);
		System.out.println("Speed : " +speed);
		System.out.println("FuelType : " +fuelType);
		
	}
	
	void run()
	{
		System.out.println("car is running");
		
	}
	
	/*
	 * @Override
	 * void enginerType() 
	 * {
	 * 
	 * }
	 */
}
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj=new Car("Hyundai",120,"Petrol");
		obj.print();
		obj.run();
		obj.display();
		obj.enginerType();
		Vehiclenew obj2=new Vehiclenew("standard",80);
		
		obj2.enginerType();
		System.out.println("Error:Can't override");
		
		String brand ="Hyundai";
		String rev = new StringBuilder(brand).reverse().toString();
		System.out.println("Reversed : "+rev);
		
		String rep = brand.replaceAll("[aeiouAEIOU]", "*");
		System.out.println("Replaced : "+rep);
		
		System.out.println("Equals Hyundai: "+brand.equals("Hyundai"));
		
		
		
	}

}
