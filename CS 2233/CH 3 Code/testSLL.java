public class testSLL{

  public static void main(String [] args){

    SinglyLinkedList<String> LNumber = new SinglyLinkedList<String>();

    LNumber.addFirst("3");
    LNumber.addFirst("2");
    LNumber.addFirst("6");
    LNumber.addFirst("0");
    LNumber.addFirst("6");
    LNumber.addFirst("7");
    LNumber.addFirst("2");
    LNumber.addFirst("2");
    LNumber.addFirst("L");

    LNumber.print();
  }
}
