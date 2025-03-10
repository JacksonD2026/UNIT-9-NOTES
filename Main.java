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
   }
}
