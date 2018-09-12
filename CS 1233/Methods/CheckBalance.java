import java.util.Scanner;

public class CheckBalance{
  public static void checkBalance(String S){
    int countPar = 0;
    int countBrack = 0;
    int countCurly = 0;
    int i = 0;
    for(i = 0; i < S.length(); i++){
      if(S.charAt(i) == '(')
        countPar++;
      if(S.charAt(i) == ')')
        countPar--;
      if(S.charAt(i) == '[')
        countBrack++;
      if(S.charAt(i) == ']')
        countBrack--;
      if(S.charAt(i) == '{')
        countCurly++;
      if(S.charAt(i) == '}')
        countCurly--;
    }
    if(countCurly == 0 && countBrack == 0 && countPar == 0)
      System.out.println("String Balanced");
    else
      System.out.println("String Unbalanced");
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String userText = sc.nextLine();

    checkBalance(userText);

    return;
  }
}
