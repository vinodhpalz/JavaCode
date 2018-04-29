class Vehicle
{
	public final void move(int speed)
	{
		speed = 103;
		System.out.println(speed);
	}
}

class Car extends Vehicle
{
	final int id = 101;
	
}

class TestVehicle
{
	public static void main(String[] args)
	{
		Car obj = new Car();
		int s = 100;
		obj.move(s);
		System.out.println(s);
	}
}
