import java.util.Scanner;

public class StringComparisons
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter the first word: ");
    String firstWord = sc.next();

    System.out.print("Please enter the second word: ");
    String secondWord = sc.next();

    if(firstWord.equals(secondWord))
    {
      System.out.print(firstWord + " is the same as " + secondWord + ".");
    }
    else if(firstWord.compareTo(secondWord) < 0)
    {
      System.out.print(firstWord + " is less than " + secondWord + ".");
    }
    else
    {
      System.out.print(firstWord + " is greater than " + secondWord + ".");
    }

    return;
  }
}
