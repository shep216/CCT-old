public class recursiveStringReverse{
  public static String recursiveReverse(String s){
    if (s.length() == 1 || s.isEmpty())
      return s;
	  else if (s.length() == 2){
      String newS = String.format("%c%c", s.charAt(1), s.charAt(0));
		  return newS;
	  }
	  else{
      int last = s.length() -1;
		  String midS = s.substring(1, last);
		  String revMid = recursiveReverse(midS);
		  String newS = String.format("%c%s%c", s.charAt(last), revMid, s.charAt(0));
		  return newS;
	  }
  }
  public static void main(String[]args){
    String testString = "L22760623";
    String test2 = " ";
    String test3 = "";
    String test4 = "pots&pans";
    String printString = recursiveReverse(testString);
    String print2 = recursiveReverse(test2);
    String print3 = recursiveReverse(test3);
    String print4 = recursiveReverse(test4);

    System.out.println(testString);
    System.out.println(printString);
    System.out.println(test2);
    System.out.println(print2);
    System.out.println(test3);
    System.out.println(print3);
    System.out.println(test4);
    System.out.println(print4);

  }
}
