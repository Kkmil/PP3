public class MathOne {
  public static void main(String[] args)     {
        double x = 34;    
        double y = 49;   
        double z = Math.toRadians(90); 
        System.out.println("Maximum of x and y is: " + Math.max(x, y));
        System.out.println("PI number is: " + Math.PI);
        System.out.println("Absolute value of -17 is : " + Math.abs(-17));
        System.out.println("Square root of nine divided by two: " + Math.sqrt(9.0/2));
        System.out.println("Random number in the range <0.0,1.0): " + Math.random());
        System.out.println("Random number in the range 0-10: " + Math.round((Math.random() * (10-0) + 0)));
        System.out.println("Sine of 90 degrees: " + Math.sin(z));

  }
}
