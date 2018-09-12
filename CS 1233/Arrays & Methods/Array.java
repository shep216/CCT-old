import java.util.Scanner;

public class Array
{
  public static void main(String [] args)
  {
    Scanner myScanner = new Scanner(System.in);

    int[] myIndex = {5,3,12,3,6,14,2,9,8,4};

    System.out.print("Please enter an index: ");
    int indexPosition = myScanner.nextInt();
    int value = myIndex[indexPosition];

    System.out.print("( " + myIndex[0]);
    for(int i = 1; i < myIndex.length - 1; i++){
      System.out.print(", " + myIndex[i]);
    }
    System.out.println(myIndex[myIndex.length - 1] + ")");
    System.out.printf("The element at index %d is %d.", indexPosition, value);

    return;
  }
}
