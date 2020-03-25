package by.derrzhanovich.learn.calendar;

import java.util.Set;

public class Month {
    private int days;
    private String name;
    private Set<Integer> holidays;

    public Month() {
    }

    public Month(String name, int days) {
        this.days = days;
        this.name = name;

    }


    public int getDays() {
        return days;
    }

    public String getName() {
        return name;
    }



    public Set<Integer> getHolidays() {
        return holidays;
    }

    public void setHolidays(Set<Integer> holidays) {
        this.holidays = holidays;
    }

    @Override
    public String toString() {
        return "Month{" +
                "days=" + days +
                ", name='" + name + '\'' +
                '}';
    }
}
