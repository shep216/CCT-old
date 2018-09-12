import java.util.Scanner;

public class Delivery
{
  public static void main(String [] args)
  {
    Scanner myScanner = new Scanner(System.in);

    int[] zips = {12789, 54012, 54481, 54982, 60007, 60103, 60187, 60188, 71244, 90210};
    double[] price = {2.40, 3.00, 3.50, 4.00, 4.50, 5.00, 5.25, 5.75, 6.10, 10.00};

    System.out.println("Delivery Charge");

    System.out.print("Enter a ZIP code for delivery: ");
    int inputZipCode = myScanner.nextInt();

    boolean zipCodeMatch = false;
    int chargePosition = 0;
    for(int i = 0; i < zips.length; i++)
    {
      if (inputZipCode != zips[i])
        continue;
      zipCodeMatch = true;
      chargePosition = i;
    }
    if(zipCodeMatch != true)
      System.out.println("Sorry: no delivery to " + inputZipCode);
    else
    {
      double outputCharge = price[chargePosition];
      System.out.printf("Delivery charge is: %.2f\n",outputCharge);
    }


    return;
  }
}
