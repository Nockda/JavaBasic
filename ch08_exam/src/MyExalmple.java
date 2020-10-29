class Car {
	int fuel;
	int velocity;
	
	Car() {
		fuel = 10;
		velocity = 0;
	}
	
	void doAccel() {
		velocity = velocity + 1;
		fuel = fuel - 1;
	}
	
	void doBreak() {
		velocity = velocity - 1;
	}
	
	void getStatus() {
		System.out.println("연료랑 " + fuel);
		System.out.println("속도 " + velocity);
	}
	
}


public class MyExalmple
{

	public static void main(String[] args)
	{
		Car mycar1 = new Car();
		mycar1.getStatus();
		
		mycar1.doAccel();
		mycar1.doAccel();
		mycar1.getStatus();
		
		mycar1.doBreak();
		mycar1.getStatus();
		
		Car mycar2 = new Car();
		mycar2.doAccel();
		mycar2.doAccel();
		mycar2.doAccel();
		mycar2.doAccel();
		mycar2.getStatus();
		
		mycar1.getStatus();
	}
	
}
