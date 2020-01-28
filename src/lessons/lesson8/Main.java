package lessons.lesson8;

public class Main {
    void println(String s) {
        try {
            throw new MyException(s);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }
    }

    void nullPointer() {
        String s = null;
        try {
            s.charAt(0);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException thrown successfully");
        }
    }

    public static void main(String[] args) {
        Main st1 = new Main();
        st1.nullPointer();
        st1.generateArrayOutOfBoundsException(11);
    }

    void f() {
        g();
    }

    void g() {
        throw wrapException(new MyException());
    }

    RuntimeException wrapException(Exception e) {
        return new RuntimeException(e);
    }

    void unwrapException(Exception e) throws Throwable {
        throw e.getCause();
    }

    void generateArrayOutOfBoundsException(int i) {
        int[] array = new int[10];
        try {
            System.out.println(array[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No such item");
        }
    }


    void threesome() throws MyException3 {
        try {
            if (true) {
                throw new MyException();
            } else if (true) {
                throw new MyException3();
            } else {
                throw new MyException2();
            }
        } catch (MyException | MyException2 e) {
            System.out.println();
        }
    }
}



