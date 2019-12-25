package lessons.lesson7;

public class Main {
    public static void main(String[] args) {
        String s1 = "202kek 2020kek 20kek lol20";
        String s2 = "asdfghj";
        String s3 = "sdadsaaaaa";
        System.out.println(StringUtils.findLongest(s1, s2, s3));
        System.out.println(StringUtils.kek(s1));
        System.out.println(StringUtils.unkek(s1));
        for (int i = 0; i < StringUtils.count20(s1).length; i++){
            System.out.println(StringUtils.count20(s1)[i]);
        }


    }
}

