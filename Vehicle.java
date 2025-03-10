/* Vehicle is a super class (parent)
Put the most general attributes and behaviors in this class definition
*/

public class Vehicle {

 private int numWheels;
 private double avgSpeed;
 private String color;


 public Vehicle() {
    this.numWheels = 4;
    this.avgSpeed = 60;
    this.color = "White";
 }

 public Vehicle(int numWheels, double avgSpeed, String color) {
    this.numWheels = numWheels;
    this.avgSpeed = avgSpeed;
    this.color = color;
 }



 public String toString() {
   return("Vehicle[numWheels: " + this.numWheels + ", avgSpeed: " + this.avgSpeed + ", color: " + this.color + "]");
 }

 public int getNumWheels() {
   return this.numWheels;
 }

 public double getAvgSpeed() {
   return this.avgSpeed; 
 }

public String getColor() {
   return this.color;
}

public void makeNoise() {
   System.out.println("Vroom vroom");
}




}
