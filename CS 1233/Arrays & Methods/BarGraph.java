import java.util.Scanner;

public class BarGraph{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    int i = 0;
    int j = 0;
    int columns = 0;
    int rows = 0;

    System.out.print("Number of values to graph: ");
    columns = sc.nextInt();
    int[] inputArray = new int [columns];

    for(i = 0; i < columns; i++){
      inputArray[i] = sc.nextInt();
      if(rows < inputArray[i]){
        rows = inputArray[i];
      }
    }
    System.out.print("Bar graph for");
    for(i = 0; i < columns; i++){
      System.out.print(" " + inputArray[i]);
    }
    System.out.println(":");

    char[][] barGraph = new char[rows][columns];
    for(i = rows - 1; i >= 0; i--){
      for(j = 0; j < columns; j++){
        if(i < inputArray[j])
          barGraph[i][j] = '#';
        else
          barGraph[i][j] = ' ';
        System.out.print("  " + barGraph[i][j]);
      }
      System.out.println("");
    }
    for(i = 0; i < columns; i++){
      System.out.print("---");
    }
    System.out.println("");
    for(i = 0; i < columns; i++){
      System.out.printf("%3d",inputArray[i]);
    }

    return;
  }
}
