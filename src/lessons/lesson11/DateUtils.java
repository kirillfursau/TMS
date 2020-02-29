package lessons.lesson11;

import java.time.*;
import java.util.GregorianCalendar;

/*
1. Класс DateUtils, в нЄм создаЄм следующие статические методы
2. вывод текущей даты-времени в формате dd.MM.yyyy hh:mm:ss
3. то же, что в п.2, но с указанием таймзоны (метод принимает код зоны)
4. метод принимает LocalDateTime и возвращает LocalDateTime, который на 4 часа 30 минут позже
5. метод, который принимает дату и возвращает boolean: €вл€етс€ ли год високосным
 */
public class DateUtils {
        public String printNowDate(){
            LocalTime time = LocalTime.now();
            LocalDate date = LocalDate.now();
            if (date.getMonthValue() < 10) {
                return date.getDayOfMonth() + ".0" + date.getMonthValue() + "." + date.getYear() + " "
                        + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond();
            }else{
                return date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear() + " "
                        + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond();
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

