package Tasks1;

public class WeekDay {
    public static void main(String[] args) {
        isWeekend("Sud");
    }

    public static boolean isWeekend(String weekday) {
        boolean isWeekend = false;
        switch (weekday) {
            case "Monday":
                System.out.println("weekDay");
                break;
            case "Tuesday":
                System.out.println("weekDay");
                break;
            case "Wednesday":
                System.out.println("weekDay");
                break;
            case "Thursday":
                System.out.println("weekDay");
                break;
            case "Friday":
                System.out.println("weekDay");
                break;
            case "Saturday":
                isWeekend = true;
                System.out.println("Weekend");
                break;
            case "Sunday":
                isWeekend = true;
                System.out.println("Weekend");
                break;
            default:
                isWeekend = false;
        }
        return isWeekend;
    }
}
