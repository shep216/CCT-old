public class TestMovie {

  public static void main(String [] args){
    Movie myFavoriteMovie = new Movie("Jackass 3", 2010, "Jeff Tremaine");
    
    /*  or...
    Movie myFavoriteMovie = new Movie();
    myFavoriteMovie.setTitle("Jackass 3");
    myFavoriteMovie.setYear(2010);
    myFavoriteMovie.setDirector("Jeff Tremaine");
    */

    myFavoriteMovie.display();
  }
}
