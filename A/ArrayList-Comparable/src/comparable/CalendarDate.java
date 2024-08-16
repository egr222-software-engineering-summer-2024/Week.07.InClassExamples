package comparable;

//Make this code implement Comparable interface
public class CalendarDate implements Comparable<CalendarDate> {
    private int year;
    private int month;
    private int day;
    
    public CalendarDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public String toString() {
        return year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day);
    }

    @Override
    public int compareTo(CalendarDate o) {
        if (this.year == o.year) {
            // year is the same
            if (this.month == o.month) {
                // year and month are the same
                return this.day - o.day;
            }
            // NOT in the same month
            return this.month - o.month;
        }
        // NOT in the same year
        return this.year - o.year;
    }
}