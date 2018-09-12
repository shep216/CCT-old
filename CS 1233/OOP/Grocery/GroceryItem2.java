import java.util.Scanner;

class GroceryItem{

Scanner sc = new Scanner(System.in);

  private int stockNumber;
  private double price;
  private int quantityInStock;
  private double totalValue;

  public void dataEntry(){
    stockNumber_input();
    price_input();
    quantityInStock_input();
    totalValue();
    }

    private void stockNumber_input(){
      System.out.print("Please enter a Stock Number: ");
      stockNumber = sc.nextInt();
      while (stockNumber <= 1000 || stockNumber >= 9999){
        System.out.print("Please enter a Stock Number: ");
        stockNumber = sc.nextInt();
      }
    }

    private void price_input(){
      System.out.print("Please enter a Price: ");
      price = sc.nextDouble();
      while (price < 0){
        System.out.print("Please enter a Price: ");
        price = sc.nextDouble();
      }
    }

    private void quantityInStock_input(){
      System.out.print("Please enter Quantity in Stock: ");
      quantityInStock = sc.nextInt();
      while (quantityInStock < 0){
        System.out.print("Please enter a Quantity in Stock: ");
        quantityInStock = sc.nextInt();
      }
    }

    private void totalValue(){
      totalValue = price * quantityInStock;
    }

    public void Display(){
      System.out.println();
      System.out.println("Grocery Item");
      System.out.println("Stock Number:      " + stockNumber);
      System.out.println("Price:             " + price);
      System.out.println("Quantity in Stock: " + quantityInStock);
      System.out.println("Total Value:       " + totalValue);
    }

    public static void main(String[] args){
      GroceryItem A = new GroceryItem();
      A.dataEntry();
      A.Display();
    }

}

/*
Define a class named GroceryItem.
  Include private fields
    stock number
    price
    quantity in stock
    total value
  Write a public function named dataEntry()
    calls four private functions
      prompt the user for keyboard input for
        stock number
           between 1000 and 9999 inclusive
        price
          non-negative values
        quantity in stock
          non-negative values
      calculates the Groceryltem’s total value field
        (price times quantity in stock)
      Write a public function that displays a GroceryItem’s values.
      main() function that declares a GroceryItem object, assigns values to its fields, and uses the display function. Save the file as Grocery.java.

b) Write a main() function that declares an array of 10 Groceryltem objects. Assign values to all 10 items and display them. Save the file as TestGrocery.java.
*/
