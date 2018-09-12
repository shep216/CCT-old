public class SinglyLinkedList<String>{

  // ---------- nested Node class ----------
  private static class Node<String>{
    private String element;
    private Node<String> next;
    public Node(String x, Node<String> n){
      element = x;
      next = n;
    }
    public String getElement(){
      return element;
    }
    public Node<String> getNext(){
      return next;
    }
    public void setNext(Node<String> n){
      next = n;
    }
  } // ---------- end of Node class ----------

  private Node<String> head = null;
  private Node<String> tail = null;
  private int size = 0;
  public SinglyLinkedList(){}

  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return size == 0;
  }
  public String first(){
    if(isEmpty())
      return null;
    return tail.getElement();
  }

  public void addFirst(String x){
    head = new Node<>(x, head);
    if(size == 0)
      tail = head;
    size++;
  }
  public void addLast(String e){
    Node<String> newest = new Node<>(e, null);
    if(isEmpty())
      head = newest;
    else
      tail.setNext(newest);
    tail = newest;
    size++;
  }
  public String removeFirst(){
    if(isEmpty()) return null;
    String answer = head.getElement();
    head = head.getNext();
    size--;
    if (size == 0)
      tail = null;
    return answer;
  }
  public void print(){
    System.out.println("");
    System.out.print("My L-number is:   ");
    Node<String> currentNode = head;
    String currentElement = currentNode.getElement();
    while(currentNode.getNext() != null){
      System.out.print(currentElement);
      currentNode = currentNode.getNext();
      currentElement = currentNode.getElement();
    }
    System.out.print(currentElement);
    System.out.println("");
  }
}
