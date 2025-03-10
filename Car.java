/* Car is a sublass (child) 
that inherits from Vehicle */

public class Car extends Vehicle {
    private int numSeats;
    private String brand;

    //CONSTURCTORS ARE NOT INHERITED

    public Car() {
        super(); // call to the super class constructor
        this.numSeats = 5;
        this.brand = "Toyota";
    }

    public Car(int numWheels, double avgSpeed, String color, int numSeats, String brand) {

    super(numWheels, avgSpeed, color);
    this.numSeats = numSeats;
    this.brand = brand;
    }

    public String toString() {
        return("Vehicle[numWheels: " + this.getNumWheels() + ", avgSpeed: " + this.getAvgSpeed() + ", color: " + this.getColor() + "]");
      }

      public void makeNoise() {
        super.makeNoise();
        System.out.println("Beep beep");
      }

   
    



}