public class Date{

  // initial fields
  private int month;
  private int day;
  private int year;

  // default constructor
  public Date()
  {
    month = 1;    // this.  here as well?
    day = 1;
    year = 2000;
  }

  // constructor
  public Date(int m, int d, int y){
    this.month = m;
    this.day = d;
    this.year = y;
  }

  // setters
  public void setMonth(int m){
    this.month = m;
  }
  public void setDay(int d){
    this.day = d;
  }
  public void setYear(int y){
    this.day = y;
  }

  // getters
  public int getMonth(){
    return month;
  }
  public int getDay(){
    return day;
  }
  public int getYear(){
    return year;
  }

  public void displayDate(){
    System.out.println("Date: " + month + "/" + day + "/" + year);
  }
}
