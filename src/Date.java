public class Date {
    private int Year;
    private int Month;
    private int Day;

    public Date() {
        Year=1900;
        Month=1;
        Day=1;
    }

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {

        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        if (month >=1 && month <=12)
             Month = month;
        else
            // An exception can be thrown
            Month=1;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {

        if (day>=1 && day<=31)
            Day = day;
        else
            // An exception can be thrown or check based on the month
            Day=1;
    }
    public void print()
    {
        System.out.println(Year+"/"+Month+"/"+Day);
    }

    @Override
    public String toString() {
        return Year + "/" + Month + "/" + Day ;
    }
}
