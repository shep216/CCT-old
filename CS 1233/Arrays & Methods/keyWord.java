import java.util.Scanner;

public class keyWord
{
  public static void main(String [] args)
  {
    Scanner myScanner = new Scanner(System.in);

    System.out.print("How many integers are in your list? ");
    int indexLength = myScanner.nextInt();
    int[] myIndex = new int[indexLength];

    int sum = 0;
    for(int i = 0; i < myIndex.length; i++)
    {
      System.out.print("Please enter an integer: ");
      int iAtIndex = myScanner.nextInt();
      myIndex[i] = iAtIndex;
      sum += myIndex[i];
    }
    for(int i = 0; i < myIndex.length; i++)
      System.out.printf("%5d\n",myIndex[i]);

    System.out.println("-----");
    System.out.printf("%5d",sum);

    return;
  }
}
