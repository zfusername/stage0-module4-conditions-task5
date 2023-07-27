package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean leap = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        String result = leap ? "Leap" : "Not leap";
        System.out.println(result);
    }
}
