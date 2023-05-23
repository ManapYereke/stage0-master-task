package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 1 || month < 1 || month > 12)
            System.out.println("invalid date");
        else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
                System.out.println("31");
            else if (month == 4 || month == 6 || month == 9 || month == 11)
                System.out.println("30");
            else if (month == 2 && isLeap(year))
                System.out.println("29");
            else if (month == 2 && !isLeap(year))
                System.out.println("28");
        }
    }

    public boolean isLeap(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            return true;
        return false;
    }
}
