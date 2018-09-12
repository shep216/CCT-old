public class Date{

  public int month;
  public int day;
  public int year;

  public Date(){
    this.month = 1;
    this.day = 1;
    this.year = 2000;
  }

  public Date(int month, int day, int year){
    this.month = month;
    this.day = day;
    this.year = year;
  }

  public void display(){
    System.out.printf("%d/%d/%d\n", month, day, year);
  }

  public static void main(String[] args){
    Date A = new Date();
    Date B = new Date(11, 24, 1998);
    A.display();
    B.display();
  }

}
