public class Book {

  private String title;
  private String contents;
  private double printingCost;  // .50 for every non-whitespace
  private int pages;            // no more than 5 characters to a page

  // default
  public Book(){
    title = "";
    contents = "";
    printingCost = 0.0;
    pages = 0;
  }
  public Book(String c, String t){
    int i = 0;
    String wholeBook = c + t;
    double countChar = 0.0;
    int countPage = 0;
    this.title = t;
    this.contents = c;

    for(i = 0; i < wholeBook.length(); i++){
      if(wholeBook.charAt(i) != ' '){
        countChar += 1.0;
      }
    }
    for(i = 0; i < wholeBook.length(); i++){
      i += 4;
      countPage += 1;
    }
    this.printingCost = countChar * .5;
    this.pages = countPage;
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
    System.out.println("Body: " + content);
    System.out.println("Cost: $" + printingCost);
    System.out.println("Pages: " + pages);
  }
}
