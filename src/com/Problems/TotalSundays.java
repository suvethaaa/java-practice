package com.Problems;

public class TotalSundays {
    public static void main(String[] args) {
        String day = "sun";
        int n= 8;
        System.out.println(findSundays(n , day));
    }

    public static int getDayIndex(String startDay) {
        switch(startDay.toLowerCase()) {
            case "mon": return 0;
            case "tue": return 1;
            case "wed": return 2;
            case "thu": return 3;
            case "fri": return 4;
            case "sat": return 5;
            case "sun": return 6;
            default: throw new IllegalArgumentException("Invalid day input");
        }
    }

    static int findSundays(int n , String day) {

        int fullWeeks = n/7;
        int remainingDays = n%7;
        int dayIndex = getDayIndex(day);
        int sundays = fullWeeks;

        // Check if remaining days include a Sunday
        for (int i = 0; i < remainingDays; i++) {
            if ((dayIndex + i) % 7 == 6) { // 6 represents Sunday
                sundays++;
            }
        }
        return sundays;
    }
}