public class testCLL{

  public static void main(String [] args){

    CircularlyLinkedList<String> LNumber = new CircularlyLinkedList<String>();

    LNumber.addLast("3");
    LNumber.addFirst("2");
    LNumber.addFirst("6");
    LNumber.addFirst("0");
    LNumber.addFirst("6");
    LNumber.addFirst("7");
    LNumber.addFirst("2");
    LNumber.addFirst("2");
    LNumber.addFirst("L");
    LNumber.print();

    LNumber.rotate();
    LNumber.rotate();
    LNumber.print();
  }
}
