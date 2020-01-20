package lessons.lesson11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LocalDateB {

    public static int dateBack(LocalDateBack localDateBack, LocalDate localDate) {
        return localDateBack.localDateBackDay(localDate);
    }

    public static void dateBack2() {
        System.out.println(dateBack(localDate -> localDate.getMonthValue(), LocalDate.now()));
        System.out.println(dateBack(localDate -> localDate.lengthOfMonth() -
                localDate.getDayOfMonth(), LocalDate.now()));
        System.out.println(dateBack(localDate -> localDate.lengthOfYear() - localDate.getDayOfYear(),
                LocalDate.now()));
    }

    public static List<LocalDate> chetoTam(LocalDate... localDates) {
        List<LocalDate> localDateList = new ArrayList<>();
        for (LocalDate l : localDates) {
            localDateList.add(l);
        }
        localDateList.sort((date1, date2) -> date2.getMonthValue() - date1.getMonthValue());
        return localDateList;
    }


    public static void main(String[] args) {
        dateBack2();
        System.out.println(chetoTam(LocalDate.now(), LocalDate.now().plusMonths(22),
                LocalDate.now().plusMonths(200)));
    }
}
