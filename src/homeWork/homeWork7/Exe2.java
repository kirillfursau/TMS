package homeWork.homeWork7;

public class Exe2 {
    public static void main(String[] args) {
        /*
        Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0
        */
        String s = "HELLO WORLD";
        char needToReplaceSymbol = s.charAt(3);
        char replaceSymbol = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == needToReplaceSymbol) {
                s = s.replace(needToReplaceSymbol, replaceSymbol);
            }
        }
        System.out.println(s);
    }
}
