import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class Meetup {
    private int month;
    private int year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public DateTime day(int weekday, MeetupSchedule time) {
        DateTime day;
        switch(time) {
            case FIRST:
                day = findInRange(weekday,  1,  7, 1);
                break;
            case SECOND:
                day = findInRange(weekday,  8, 14, 1);
                break;
            case THIRD:
                day = findInRange(weekday, 15, 21, 1);
                break;
            case FOURTH:
                day = findInRange(weekday, 22, 28, 1);
                break;
            case LAST:
                int daysInMonth = new DateTime(year, month, 1, 0, 0).dayOfMonth().getMaximumValue();
                day = findInRange(weekday, daysInMonth, daysInMonth - 7, -1);
                break;
            case TEENTH:
                day = findInRange(weekday, 13, 19, 1);
                break;
            default:
                throw new IllegalArgumentException("Not a valid selector");
        }
        return day;
    }

    private DateTime findInRange(int weekday, int start, int stop, int step) {
        DateTime day = new DateTime(year, month, start, 0, 0);
        for(; day.getDayOfMonth() != stop + step; day = day.plusDays(step)) {
            if(day.getDayOfWeek() == weekday)
                break;
        }
        return day;
    }
}