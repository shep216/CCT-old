import java.util.Scanner;

public class Hanoi{

  public static void hanoiSteps(int n, String start, String spare, String end){
    if(n == 1){
      System.out.println("Move a disc from " + start + " to " + end + ".");
    }
    else{
      hanoiSteps(n - 1, start, end, spare);
      System.out.println("Move a disc from " + start + " to " + end + ".");
      hanoiSteps(n - 1, spare, start, end);
    }
  }

  public static void main(String [] args){
    System.out.print("How many discs must be moved from A to C? ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    hanoiSteps(n, "A", "B", "C");
  }
}
