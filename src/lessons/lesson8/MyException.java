package lessons.lesson8;

public class MyException extends Exception {
    MyException(String s) {
        super(s);
    }

    MyException() {
        super();
    }
}
