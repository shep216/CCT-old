public class CalendarFinal
{
  public static void main(String[]args)
  {
    String firstArgument = args[0];
    int m = Integer.parseInt(firstArgument);
    String secondArgument = args[1];
    int y = Integer.parseInt(secondArgument);

    int d0 = 0;
    int y0 = 0;
    int m0 = 0;
    int x = 0;
    int d = 1;

    y0 = y - (14 - m) / 12;
    x = y0 + y0/4 - y0/100 + y0/400;
    m0 = m + 12 * ((14 - m) / 12) - 2;
    d0 = (d + x + (31*m0)/ 12) % 7;

    int lastDay = 0;
    int totalLines = 0;

    System.out.println("---------------------");
    switch(m)
    {
      case 1:
        System.out.println("    January " + y);
        lastDay = 31;
        break;
      case 2:
        System.out.println("    February " + y);
        lastDay = 28;
        if(d0 == 0)
          totalLines = 4;
        else
          totalLines = 5;
        break;
      case 3:
        System.out.println("    March " + y);
        lastDay = 31;
        break;
      case 4:
        System.out.println("    April " + y);
        lastDay = 30;
        break;
      case 5:
        System.out.println("    May " + y);
        lastDay = 31;
        break;
      case 6:
        System.out.println("    June " + y);
        lastDay = 30;
        break;
      case 7:
        System.out.println("    July " + y);
        lastDay = 31;
        break;
      case 8:
        System.out.println("    August " + y);
        lastDay = 31;
        break;
      case 9:
        System.out.println("    September " + y);
        lastDay = 30;
        break;
      case 10:
        System.out.println("    October " + y);
        lastDay = 31;
        break;
      case 11:
        System.out.println("    November " + y);
        lastDay = 30;
        break;
      case 12:
        System.out.println("    December " + y);
        lastDay = 31;
        break;
    }
    System.out.println("---------------------");
    System.out.println(" Su Mo Tu We Th Fr Sa");

    if((m == 2) && (((y%400) == 0) || (((y%4) == 0) && ((y%100) != 0))))
    {
      totalLines = 5;
      lastDay = 29;
    }
    if((m == 1) || (m == 3) || (m == 5) || (m == 7) || (m == 8) || (m == 10) || (m == 12))
    {
      if(d0 < 5)
        totalLines = 5;
      else
        totalLines = 6;
    }
    if((m == 4) || (m == 6) || (m == 9) || (m == 11))
    {
      if(d0 == 6)
        totalLines = 6;
      else
        totalLines = 5;
    }

    int currentDay = 1;
    for(int i = 0; i < d0; i++)
      System.out.print("   ");
    for(int j = 0; j < (7 - d0); j++)
    {
      System.out.printf("%3d",currentDay);
      currentDay += 1;
    }
    System.out.println("");
    for(int k = 0; k < (totalLines - 1); k++)
    {
      for(int l = 0; l < 7; l++)
      {
        if(currentDay != (lastDay + 1))
        {
          System.out.printf("%3d",currentDay);
          currentDay += 1;
        }
      }
      System.out.println("");
    }
    System.out.print("---------------------");

    return;
  }
}
