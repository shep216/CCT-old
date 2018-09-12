public class Discriminant
{
  public static void main(String[]args)
  {
    //Retreiving first input
    String firstArgument = args[0];
    double b = Double.parseDouble(firstArgument);

    //Retrieving second input
    String secondArgument = args[1];
    double c = Double.parseDouble(secondArgument);

    //Retrieving third input
    String thirdArgument = args[2];
    double d = Double.parseDouble(thirdArgument);

    //b^2c^2 - 4c^3 - 4b^3d - 27d^2 + 18bcd
    double result = b*b*c*c - 4.0*c*c*c - 4.0*b*b*b*d - 27.0*d*d + 18.0*b*c*d;
    System.out.print("The discriminant of the polynomial ");
    System.out.printf("x^3 + %.2fx^2 + %.2fx + %.2f is %.2f", b, c, d, result);
  }
}
