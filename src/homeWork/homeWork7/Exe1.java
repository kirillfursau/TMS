package homeWork.homeWork7;

public class Exe1 {
    public static void main(String[] args) {
        /*
        Вырезать подстроку из строки начиная с первого вхождения
        символа(А) до, последнего вхождения сивола(B).
        */
        String s = "oooLongggg";
        System.out.println(s.substring(s.indexOf('o'), s.lastIndexOf('g') + 1));
    }
}
