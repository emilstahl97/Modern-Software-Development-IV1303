import java.time.*;
import java.util.*;


public class clockTest {

  public static void main(String[] args) {

    String start = "start";
    Scanner scan = new Scanner(System.in);
    System.out.println("Type *start* to activate timer ");
    String userIn = scan.nextLine();
    userIn = userIn.toLowerCase();

    Calendar startTime = Calendar.getInstance();

    if(userIn.equals(start)) {

    System.out.println("Starting time:  " + startTime.getTime());
    }

    String end = "end";
    Scanner scan2 = new Scanner(System.in);
    System.out.println("Type *end* to stop timer ");
    String userIn2 = scan2.nextLine();
    userIn = userIn2.toLowerCase();

    Calendar endTime = Calendar.getInstance();

    if(userIn2.equals(end)) {
    System.out.println("Ending time:  " + endTime.getTime());
}
    method(startTime,endTime);
}

public static void method(Calendar startTime, Calendar endTime) {

  int Year = startTime.get(startTime.YEAR);
  int Month =  startTime.get(startTime.MONTH);
  int Day = startTime.get(startTime.DATE);
  int Hour = startTime.get(startTime.HOUR_OF_DAY);
  int Minute = startTime.get(startTime.MINUTE);
  int Second = startTime.get(startTime.SECOND);

  System.out.println("End:  " + Year +"-"+Month+"/"+Day +" " + Hour+":"+Minute+":"+Second);

}

  }
