package Tasks1;

import java.math.BigInteger;

public class WeekDay_ternar {
    public static void main(String[] args) {
        checkWeekend("Saturday");
    }

    public static String checkWeekend(String weekday) {
        return (weekday.equals("Saturday") || weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо еще поработать";
    }

}
