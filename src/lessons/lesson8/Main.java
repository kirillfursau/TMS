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
        st1.f();
        st1.wrapException();
    }
    void f(){
        try {
            g();
        }catch (MyException e){
            int a = 1 /0;
        }

    }
    void g() throws MyException {
            throw new MyException();
    }
    RuntimeException wrapException(Exception e){
        return new RuntimeException(e);
    }
}


