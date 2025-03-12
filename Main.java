import java.util.ArrayList;

public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      Vehicle v1 = new Vehicle();
      Car c1 = new Car();
      // use parameterized constructor
      Vehicle v2 = new Vehicle(3, 10.0, "Red" );
      Car c2 = new Car(4, 960.0, "Aquamarine",21, "Ford Car" );

      System.out.println(v1);
      System.out.println(v2);
      System.out.println(c1);
      System.out.println(c2);

      c2.makeNoise();
      v2.makeNoise();

    
      // instances of the top (most super) type
      Vehicle v3 = new Vehicle();
      Vehicle c3 = new Car(); // Yes you're CONSTRCUTING a car, but you can call it as a vehicle because it is a type of vehicle
      Vehicle scoot = new Vehicle();
      Vehicle moto = new Vehicle();
      Vehicle convertible = new Convertible();

        // POLYMORPHISM example:
        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
        vehicleList.add(v1);
        vehicleList.add(v2);
        vehicleList.add(v3);
        vehicleList.add(c1);
        vehicleList.add(c2);
        vehicleList.add(c3);
        vehicleList.add(moto);
        vehicleList.add(scoot);
        System.out.println(vehicleList);
        

   } 
}
