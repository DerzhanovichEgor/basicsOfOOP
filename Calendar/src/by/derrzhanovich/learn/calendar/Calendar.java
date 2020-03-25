package by.derrzhanovich.learn.calendar;


import java.util.*;

public class Calendar {
    private List<Month> months;
    private int year;

    public Calendar() {
    }

    public Calendar(int year, List<Month> months) {
        this.year = year;
        this.months = months;
    }

    public int getYear() {
        return year;
    }

    public List<Month> getMonths() {
        return months;
    }

    public class Holidays {
        private Set<Integer> holidays = new TreeSet<>();
        Month month;

        public Holidays() {
        }

        public void addHolidays(String nameOfMonth, int holiday) {
            holidays.add(holiday);

            for (int i = 0; i < months.size(); i++) {
                if (months.get(i).getName().toLowerCase().equals(nameOfMonth.toLowerCase())) {
                    month = months.get(i);
                }
            }
            month.setHolidays(holidays);

        }

        public void removeHoliday(String nameOfMonth,int holiday) {
            for (int i = 0; i < months.size(); i++) {
                if (months.get(i).getName().toLowerCase().equals(nameOfMonth.toLowerCase())) {
                 holidays = month.getHolidays();
                 holidays.remove(holiday);
                }
                month.setHolidays(holidays);
            }

        }

        public boolean isHoliday(String nameOfMonth,int holiday){
            for (int i = 0; i < months.size(); i++) {
                if(months.get(i).getName().toLowerCase().equals(nameOfMonth.toLowerCase())&& months.get(i).getHolidays().contains(holiday)){
                    System.out.println(holiday + " " + nameOfMonth + " выходной");
                    return true;
                }
            }
            return false;
        }
        public void printHoliday(String month) {
            for (int i = 0; i < months.size(); i++) {
                if (months.get(i).getName().toLowerCase().equals(month.toLowerCase()) && months.get(i).getHolidays() != null) {
                    System.out.println("В этом месяце у вас " + months.get(i).getHolidays().size() + " выходной(ых).");
                }
                if (months.get(i).getName().toLowerCase().equals(month.toLowerCase()) && months.get(i).getHolidays() == null) {
                    System.out.println("В этом месяце у вас нету выходных.");

                }
            }
        }
    }
}

