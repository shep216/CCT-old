public class Movie {
  // Attributes
  private String title;
  private int year;
  private String director;

  //Default constructor
  public Movie(){
    title = "";
    year = 0;
    director = "";
  }

  //Modifiers
  public void setTitle(String new_title){
    title = new_title;
  }
  public void setYear(int new_year){
    year = new_year;
  }
  public void setDirector(String name){
    director = name;
  }

  public void display(){
    System.out.println("Title: " + title);
    System.out.println("Year: " + year);
    System.out.println("Director: " + director);
  }
}
