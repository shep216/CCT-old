import java.util.HashMap;

public class HashRemoveDuplicate{

  public static void main(String[]args){
    final int CAPACITY = 10;
    int[] userArray = new int[CAPACITY];

    for (int i = 0; i <= 9; i++){
      String argument = args[i];
      userArray[i] = Integer.parseInt(argument);
    }

    HashMap testHash = new HashMap(CAPACITY);
    for (int i = 0; i <= 9; i++){
      if(!testHash.containsKey(userArray[i])){
        testHash.put(userArray[i], userArray[i]);
      }
    }

    System.out.println(testHash);
  }
}
