package com.Problems;

public class TotalSundays {
    public static void main(String[] args) {
        String day = "sun";
        int n = 8;
        System.out.println(findSundays(n, day));
    }

    public static int getDayIndex(String startDay) {
        return switch (startDay.toLowerCase()) {
            case "mon" -> 0;
            case "tue" -> 1;
            case "wed" -> 2;
            case "thu" -> 3;
            case "fri" -> 4;
            case "sat" -> 5;
            case "sun" -> 6;
            default -> throw new IllegalArgumentException("Invalid day input");
        };
    }

    static int findSundays(int n, String day) {

        int fullWeeks = n / 7;
        int remainingDays = n % 7;
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