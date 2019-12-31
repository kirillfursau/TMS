package lessons.lesson7;

public class Main {
    public static void main(String[] args) {
        String s1 = "20o2kek 202p0kek 20kek ll20";
        String s2 = "asdfghj";
        String s3 = "sdadsaaaaa";
        System.out.println(StringUtils.findLongest(s1, s2, s3));
        System.out.println(StringUtils.kek(s1));
        System.out.println(StringUtils.unkek(s1));
        System.out.println(StringUtils.countCharacterEntries(s1, '2'));
        for (int i = 0; i < StringUtils.count20(s1).length; i++){
            System.out.println(StringUtils.count20(s1)[i]);
        }
        System.out.println(StringUtils.findMostFrequentChar(s1));
        System.out.println("not repeating");
        System.out.println(StringUtils.findFirstNonRepeating(s1));
        StringUtils.divideAndPrint(s1, 5);

    }
}

