import java.util.Math;    // util or lang???

public class Book {

  private String title;
  private String contents;
  private double printingCost;  // .50 for every non-whitespace
  private int pages;            // no more than 5 characters to a page

  // default
  public Book(){
    title = "";
    contents = "";              // values assigned automatically
    printingCost = 0.0;
    pages = 0;
  }
  public Book(String c, String t){
    int i = 0;
    String wholeBook = c + t;
    double countChar = 0.0;
    int countPage = wholeBook.length();
    this.title = t;
    this.contents = c;

    for(i = 0; i < wholeBook.length(); i++){
      if(wholeBook.charAt(i) == '\n' && wholeBook.charAt(i) == '\t' && wholeBook.charAt(i) == ' '){
        countChar += 1;
      }
    }

    this.printingCost = countChar * .5;
    this.pages = Math.ceil(countPage/5.0);     // use Math.ceil(wholeBook.length()/5)
  }

  // accessors
  public String getTitle(){
    return title;
  }
  public String getContents(){
    return contents;
  }
  public double getPrintingCost(){
    return printingCost;
  }
  public int getPages(){
    return pages;
  }
  public void print(){
    System.out.println("Title: " + title);
    System.out.println("Body: " + contents);
    System.out.println("Cost: $" + printingCost);
    System.out.println("Pages: " + pages);
  }
// All letters should be capitalized.
// Then, shift each letter (only letters) to the right by key letters.
// E.g: If key = 2, A becomes C, B becomes D, etc...
// It wraps around, so if key = 2, Z should become B after applying
// the encryption operation,
  /*
  public void encrypt(int key)
  {
    String newTitle = title.toUpperCase();
    String newContents = contents.toUpperCase();

  }
  */
}
