public class DayOfWeek
{
  public static void main(String[]args)
  {
    String firstArgument = args[0];
    int m = Integer.parseInt(firstArgument);
    int m0 = m;

    String secondArgument = args[1];
    int d = Integer.parseInt(secondArgument);
    int d0 = d;

    String thirdArgument = args[2];
    int y = Integer.parseInt(thirdArgument);
    int y0 = y;

    int x = 0;

    y0 = y - (14 - m) / 12;
    x = y0 + y0/4 - y0/100 + y0/400;
    m0 = m + 12 * ((14 - m) / 12) - 2;
    d0 = (d + x + (31*m0)/ 12) % 7;

    System.out.printf("%d %d %d falls on %d.", m, d, y, d0);
  }
}
