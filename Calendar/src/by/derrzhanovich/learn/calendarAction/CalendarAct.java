package by.derrzhanovich.learn.calendarAction;

import by.derrzhanovich.learn.calendar.Calendar;
import by.derrzhanovich.learn.calendar.Month;

import java.util.ArrayList;
import java.util.List;

public class CalendarAct {
   private List<Month> months = new ArrayList<>();
    public List<Month> fillCalendar(){
        months.add(new Month("JANUARY",31));
        months.add(new Month("FEBRUARY",29));
        months.add(new Month("MARCH",31));
        months.add(new Month("APRIL",30));
        months.add(new Month("MAY",31));
        months.add(new Month("JUNE",30));
        months.add(new Month("JULY",31));
        months.add(new Month("AUGUST",31));
        months.add(new Month("SEPTEMBER",30));
        months.add(new Month("OCTOBER",31));
        months.add(new Month("NOVEMBER",30));
        months.add(new Month("DECEMBER",31));

        return months;
    }

    public List<Month> getMonths() {
        return months;
    }


}
