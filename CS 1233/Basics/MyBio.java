import java.util.Scanner;

public class MyBio
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("First name: ");
    String firstName = sc.nextLine();

    System.out.print("Last name: ");
    String lastName = sc.nextLine();

    System.out.print("DOB: ");
    String dob = sc.nextLine();

    System.out.print("Address: ");
    String address = sc.nextLine();

    return;
  }
}
