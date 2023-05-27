class Plane extends Vehicles {

  Plane(int speed, String color, double price) {
    
		super(speed, color, price); 

	}

}

class U_2_Spy_Plane extends Plane {

	private int wingSpan;

	

	U_2_Spy_Plane(int speed, String color, double price, int wingSpan) {

		super(speed, color, price); 

		this.wingSpan = wingSpan;

	}

	

	public void fly() {

		System.out.println("U2 Spy Plane started to fly...");

	}

		

	@Override

	public void stop() { 

		System.out.println("U-2 Spy Plane stopped...");

	}

}
