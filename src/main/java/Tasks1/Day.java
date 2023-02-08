package Tasks1;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

//    public static void main(String[]args){
//        Day day = null;
//        if (day.isWeekend()){
//       //     some code there;
//        }
//    }

    public boolean isWeekend() {
        return (this == SATURDAY || this == SUNDAY);
    }

    public String getRusName() {
        switch (this) {
            case MONDAY:
                return "Понедельник";
            case TUESDAY:
                return "Вторник";
            case WEDNESDAY:
                return "Среда";
            case THURSDAY:
                return "Четверг";
            case FRIDAY:
                return "Пятница";
            case SATURDAY:
                return "Суббота";
            case SUNDAY:
                return "Воскресенье";
        }
        return "Нет такого дня недели";
    }
}