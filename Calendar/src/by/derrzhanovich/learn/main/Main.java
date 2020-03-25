package by.derrzhanovich.learn.main;

import by.derrzhanovich.learn.calendar.*;
import by.derrzhanovich.learn.calendarAction.CalendarAct;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CalendarAct act = new CalendarAct();
        act.fillCalendar();
        Calendar.Holidays calendar = new Calendar(2020,act.getMonths()).new Holidays();
       // calendar.printHoliday("may");
        calendar.addHolidays("March", 1);
        calendar.addHolidays("march",2);
        calendar.removeHoliday("march",2);
        calendar.printHoliday("march");
        calendar.isHoliday("march",1);

    }
}
