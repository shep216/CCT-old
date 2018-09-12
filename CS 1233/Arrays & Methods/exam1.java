import java.util.Scanner;

public class exam1
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int i = 0;
    int maxPosition = 0;
    int minPosition = 0;
    double maxScore = 0.0;
    double minScore = 0.0;
    double sum = 0.0;
    double averageScore = 0.0;
    // input for 7 scores
    double[] scores = new double[7];
    for(i = 0; i < scores.length; i++){
      scores[i] = sc.nextDouble();
    }
    maxScore = scores[0];
    minScore = scores[0];

    for(i = 1; i < scores.length; i++){
      if(scores[i] < minScore){
        minPosition = i;
        minScore = scores[i];
      }
      if(scores[i] > maxScore){
        maxPosition = i;
        maxScore = scores[i];
      }
    }
    for(i = 0; i < scores.length; i++){
      if(i != maxPosition && i != minPosition){
        sum += scores[i];
      }
    }
    averageScore = sum/5.0;
    System.out.printf("Average score: %.2f",averageScore);

    return;
  }
}
