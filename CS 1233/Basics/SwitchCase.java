import java.util.Scanner;

public class SwitchCase
{
  public static void main(String[]args)
  {
    Scanner myScanner = new Scanner(System.in);
    System.out.print("Please enter your grade: ");
    int points = myScanner.nextInt();

    int num = points/10;
    switch(num)
    {
      case 10:
      case 9:
        System.out.println("A grade of " + points + " is an A.");
        break;
      case 8:
        System.out.println("A grade of " + points + " is a B.");
        break;
      case 7:
        System.out.println("A grade of " + points + " is a C.");
        break;
      case 6:
        System.out.println("A grade of " + points + " is a D.");
        break;
      case 5:
      case 4:
      case 3:
      case 2:
      case 1:
      case 0:
        System.out.println("A grade of " + points + " is an F.");
        break;
      default:
        System.out.println("A grade of " + points + " is not valid.");
        break;
    }
    return;
  }
}
