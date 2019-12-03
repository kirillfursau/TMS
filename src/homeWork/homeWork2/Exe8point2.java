package homeWork.homeWork2;

public class Exe8point2 {
    public static void main(String[] args) {
        int heightOfTriangle = 4;
        for (int line = heightOfTriangle; line > 0; line--) {
            for (int space = line; space < heightOfTriangle; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= line; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}