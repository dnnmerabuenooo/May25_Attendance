class Yacht extends Vehicles {


	Yacht(int speed, String color, double price) {

		super(speed, color, price); 

	}

}

class Fandango_Yatch extends Yacht {

	private String mainSailColor;

	

	Fandango_Yatch (int speed, String color, double price, String mainSailColor) {

		super(speed, color, price);

		this.mainSailColor = mainSailColor;

	}

	public void floating() {

		System.out.println("Fandango Yatch started sailing...");

	}

	

	@Override

	public void stop () { //overriding stop method

		System.out.println("Fandango Yatch has stopped...");

	}

}
