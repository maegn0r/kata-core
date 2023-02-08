package Tasks1;

public class WeekDay_IF {
    public static void main(String[] args) {
        isWeekend("Saturday");
    }

    public static boolean isWeekend(String weekday) {
        boolean isWeekend = false;
        if (weekday.equals("Monday")) {
            System.out.println("weekDay");
        } else if (weekday.equals("Tuesday")) {
            System.out.println("weekDay");
        } else if (weekday.equals("Wednesday")) {
            System.out.println("weekDay");
        } else if (weekday.equals("Thursday")) {
            System.out.println("weekDay");
        } else if (weekday.equals("Friday")) {
            System.out.println("weekDay");
        } else if (weekday.equals("Saturday")) {
            System.out.println("Weekend");
            isWeekend = true;
        } else if (weekday.equals("Sunday")) {
            System.out.println("Weekend");
            isWeekend = true;
        }
        return isWeekend;
    }
}
