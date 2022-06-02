package Lesson7;

public class TaskOne {
    enum DaysOfWeek {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    public static void main (String[] args) {
        for (DaysOfWeek day: DaysOfWeek.values()) {
            if ((day.ordinal() > 4) ||
            (day == DaysOfWeek.SATURDAY)) {
                System.out.println(day.name() + " is week end");
            }
            else {
                System.out.println(day.name() + " is working Day");
            };
        }
    }
}


