import java.util.Scanner;

public class distinctElements
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int[] inputArray = new int[100];
    int[] outputArray = new int[100];

    System.out.println("Enter integer values into the array, or -1 to stop:");

    int userInput = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int numDistinctElements = 1;
    boolean elementMatch = true;
    while(userInput != -1){
      userInput = sc.nextInt();
      inputArray[i] = userInput;
      if(i > 0){
        for(j = (i - 1); j >= 0; j--){
          if(inputArray[i] == inputArray[j]){
            elementMatch = false;
            break;
          }
          else
            elementMatch = true;
        }
      }
      if(elementMatch == true){
        outputArray[k] = inputArray[i];
        k += 1;
        numDistinctElements += 1;
      }
      i += 1;
    }

    int m = 0;
    System.out.print("(");
    for(m = 0; m < (numDistinctElements - 3); m++)
    {
      System.out.printf("%3d,",outputArray[m]);
    }
    System.out.printf("%3d",outputArray[numDistinctElements - 3]);
    System.out.print(")");

    return;
  }
}
