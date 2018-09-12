public class Person{

  private String firstname;
  private String lastname;
  private int zip;

  public Person(){
    this.firstname = "X";
    this.lastname = "X";
    this.zip = 0;
  }

  public Person(String first, String last, int zip){
    this.firstname = first;
    this.lastname = last;
    this.zip = zip;
  }

  public void Display(){
    System.out.println("Firstname: " + firstname);
    System.out.println("Lastname: " + lastname);
    System.out.println("Zipcode: " + zip);
  }

  public static void main(String[] args){
    Person A = new Person();
    Person B = new Person("Tori", "Sanzone", 06010);
    A.Display();
    B.Display();
  }
}
