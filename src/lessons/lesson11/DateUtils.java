package lessons.lesson11;

import java.time.*;
import java.util.GregorianCalendar;


public class DateUtils {
        public static void printNowDate(){
            LocalTime time = LocalTime.now();
            LocalDate date = LocalDate.now();
            if (date.getMonthValue() < 10) {
                System.out.println(date.getDayOfMonth() + ".0" + date.getMonthValue() + "." + date.getYear() + " "
                        + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
            }else{
                System.out.println(date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear() + " "
                        + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
            }
        }
    public static void printNowDateWithTimeZone(ZoneId zoneId){
        LocalTime time = LocalTime.now(zoneId);
        LocalDate date = LocalDate.now(zoneId);
        if (date.getMonthValue() < 10) {
            System.out.println(date.getDayOfMonth() + ".0" + date.getMonthValue() + "." + date.getYear() + " "
                    + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
        }else{
            System.out.println(date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear() + " "
                    + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
        }

    }
    public static LocalDateTime getLocalDateTimePlusFourHoursThirtyMinutes(LocalDateTime localDateTime){
            return localDateTime.plusHours(4).plusMinutes(30);
    }
    public boolean LeapYear(LocalDateTime localDateTime){
        GregorianCalendar cal = new GregorianCalendar();
            if(cal.isLeapYear(localDateTime.getYear())){
                return true;
            }else {
            return false;
        }
    }

    public static void main(String[] args) {
        DateUtils dateUtils = new DateUtils();
        dateUtils.printNowDate();
        ZoneId zoneId = ZoneId.of("UTC+6");
        LocalDateTime localDateTime = LocalDateTime.now();
        dateUtils.printNowDateWithTimeZone(zoneId);
        System.out.println(getLocalDateTimePlusFourHoursThirtyMinutes(localDateTime));
        System.out.println(dateUtils.LeapYear(localDateTime));
        }
}
