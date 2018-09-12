public class CircularlyLinkedList<String>{

  // ---------- nested Node class ----------
  private static class Node<String>{
    private String element;
    private Node<String> next;
    public Node(String x, Node<String> n){
      element = x;
      next = n;
    }
    public String getElement(){return element;}
    public Node<String> getNext(){return next;}
    public void setNext(Node<String> n){next = n;}
  }
  // ---------- end of Node class ----------

  // instance variables
  private Node<String> tail = null;
  private int size = 0;
  public CircularlyLinkedList(){}

  // access methods
  public int size() {return size;}
  public boolean isEmpty(){return size == 0;}
  public String first(){
    if (isEmpty()) return null;
    return tail.getNext().getElement();
  }
  public String last(){
    if (isEmpty()) return null;
    return tail.getElement();
  }

  // update methods
  public void rotate(){
    if (tail != null) tail = tail.getNext();
  }
  public void addFirst(String e){
    if (size == 0){
      tail = new Node(e, null);
      tail.setNext(tail);
    }
    else{
      Node<String> newest = new Node(e, tail.getNext());
      tail.setNext(newest);
    }
    size++;
  }
  public void addLast(String e){
    addFirst(e);
    tail = tail.getNext();
  }
  public String removeFirst(){
    if (isEmpty()) return null;
    Node<String> head = tail.getNext();
    if (head == tail) tail = null;
    else tail.setNext(head.getNext());
    size--;
    return head.getElement();
  }
  public void print(){
    System.out.println("");
    System.out.print("My L-number is:   ");
    Node<String> currentNode = tail.getNext();
    String currentElement = currentNode.getElement();
    while(currentNode != tail){
      System.out.print(currentElement);
      currentNode = currentNode.getNext();
      currentElement = currentNode.getElement();
    }
    System.out.print(currentElement);
    System.out.println("");
  }
}
