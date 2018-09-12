import java.util.Scanner;
import java.lang.Math;

public class CountPrimes{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean [] booleanArry = new boolean[n];

    int i = 0;
    for(i = 0; i < n; i++)
      booleanArry[i] = true;

    int j = 0;
    int k = 0;
    for(i = 2; i <= Math.sqrt(n); i++){
      for(j = 2; j <= n; j++){
        k = i * j;
        if(k <= n)
          booleanArry[k - 1] = false;
      }
    }

    int count = 0;
    for(i = 1; i < n; i++){
      if(booleanArry[i] == true)
        count++;
    }
    System.out.println(count);
  }
}
