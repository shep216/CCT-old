public class Time{

  private int hours;
  private int minutes;

  public Time(){
    hours = 0;
    minutes = 0;
  }

  public Time(int hours, int minutes){
    if (hours > 23){
      this.hours = 23;
    }
    else{
      this.hours = hours;
    }
    if (minutes > 59){
      this.minutes = 59;
    }
    else{
      this.minutes = minutes;
    }
  }

  public void setHours(int newHour){
    if (newHour > 23){
      newHour = newHour - 24;
    }
    hours = newHour;
  }

  public void setMinutes(int newMinute){
    if (newMinute > 59){
      newMinute = newMinute - 60;
    }
    minutes = newMinute;
  }

  public int getHour(){
    return hours;
  }

  public int getMinute(){
    return minutes;
  }


  public void changeTime(int newminutes){
    int overflow = 0;
    minutes = minutes + newminutes;
    if (minutes > 59){
      overflow = minutes / 60;
      hours = hours + overflow;
      minutes = minutes % 60;
    }
  }

  public void DisplayTime(){
    System.out.printf("%02d:%02d\n", hours, minutes);
  }

  public static void main(String[] args){
    Time appts[] = new Time[4];
    appts[0] = new Time(5, 7);
    appts[1] = new Time(4, 20);
    appts[2] = new Time(22, 27);
    appts[3] = new Time(24, 60);
    for (int i = 0; i < 4; i++){
      appts[i].DisplayTime();
    }
  }

}
