import java.util.Scanner;

public class SwitchCaseAndDoWhile
{
  public static void main(String[]args)
  {
    System.out.println("Basic Calculator Program");
    int answer = 0;
    String yesOrNo = "";

    Scanner sc = new Scanner(System.in);
    do
    {
      System.out.print("Enter the first integer: ");
      int firstInteger = sc.nextInt();

      System.out.print("Enter the second integer: ");
      int secondInteger = sc.nextInt();

      System.out.print("Enter the operator: ");
      String operator = sc.next();

      switch(operator)
      {
        case "+":
          answer = firstInteger + secondInteger;
          System.out.println("The result is: " + answer);
          break;
        case "-":
          answer = firstInteger - secondInteger;
          System.out.println("The result is: " + answer);
          break;
        case "*":
          answer = firstInteger * secondInteger;
          System.out.println("The result is: " + answer);
          break;
        case "/":
          if (secondInteger == 0)
          {
            System.out.println("Error: cannot divide by zero.");
          }
          else
          {
            answer = firstInteger / secondInteger;
            System.out.println("The result is: " + answer);
          }
          break;
        case "%":
          if (secondInteger == 0)
          {
            System.out.println("Error: cannot divide by zero.");
          }
          else
          {
            answer = firstInteger % secondInteger;
            System.out.println("The result is: " + answer);
          }
          break;
        default:
          System.out.println("Invalid operation.");
      }
      System.out.print("Another operation (y/n)? ");
      yesOrNo = sc.next();
    } while(yesOrNo.equals("y") || yesOrNo.equals("Y"));

    return;
  }
}
