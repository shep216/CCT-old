public class Person{

  private String lastName;
  private String firstName;
  private String zipCode;

  public Person(){
    this.lastName = "X";
    this.firstName = "X";
    this.zipCode = "X";
  }

  public Person(String l, String f, String z){
    this.lastName = l;
    this.firstName = f;
    this.zipCode = z;
  }

  // setters
  public void setFirst(String f){
    this.firstName = f;
  }
  public void setLast(String l){
    this.lastName = l;
  }
  public void setZip(String z){
    this.zipCode = z;
  }

  // getters
  public String getFirst(){
    return firstName;
  }
  public String getLast(){
    return lastName;
  }
  public String getZip(){
    return zipCode;
  }

  public void displayPerson(){
    System.out.println("Name: " + lastName + ", " + firstName);
    System.out.println("Zip Code: " + zipCode);
  }
}
