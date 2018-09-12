import java.util.Scanner;

public class recursiveFactorial{
  public static int factorial(int n) throws IllegalArgumentException{
    if(n < 0)
      throw new IllegalArgumentException();
    else if (n == 0)
      return 1;
    else
      return n*factorial(n-1);
  }

  public static void main(String[]args){
    System.out.print("Enter your L number (w/out the 'L'): ");
    Scanner sc = new Scanner(System.in);
    String b = sc.nextLine();
    int c = b.length() -2;
    String d = b.substring(c);
    int n = Integer.valueOf(d);
    int x = factorial(n);
    System.out.println("");
    System.out.printf("The factorial of the last 2 digits of you L number, %d, is: %d", n, x);
  }
}
