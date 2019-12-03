public class HomeWork2Ex1 {
    public static void main(String[] args) {
        double dist = 10;
        double dist2 = 0;
        for (int day = 0; day < 7; day++) {
            dist2 = dist + dist2;
            dist *= 1.1;
        }
        System.out.println(dist2);
    }
}