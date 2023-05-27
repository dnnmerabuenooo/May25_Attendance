public class Vehicles {

    private double speed;

    private String color;

    private double price;

    

public Vehicles (double speed, String color, double price) {

        this.speed = speed;

        this.color = color;

        this.price = price;

    }

    

    public double getSpeed() {

        return speed;

    }

    

    public String getColor() {

        return color;

    }

    

    public double getPrice() {

        return price;

    }

    

    public void stop() {

        System.out.println("The vehicle stopped moving.");

    }

}
