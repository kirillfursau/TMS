package lessons.lesson11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/*
1. —оздаЄм функциональный интерфейс, метод которого принимает LocalDate и возвращает число
2. ѕишем метод, который принимает л€мбду (интерфейс из п.1) и LocalDate, и возвращает число, возвращаемое
функциональным интерфейсом
3. ѕишем метод, в котором вызываем метод из п.2 три раза: с л€мбдой дата -> номер мес€ца; дата -> кол-во дней в
этом мес€це; дата -> кол-во дней в году после данного дн€, не включа€
4. ѕишем метод, который принимает произвольное число дат и возвращает список (List) дат, отсортированных по номеру
мес€ца (по убыванию). в процессе использовать Comparator в виде л€мбды
*/
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
