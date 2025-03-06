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




}
