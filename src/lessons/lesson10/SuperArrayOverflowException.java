package lessons.lesson10;

public class SuperArrayOverflowException extends ArrayIndexOutOfBoundsException {
    SuperArrayOverflowException(String s){
        super(s);
    }
    SuperArrayOverflowException(){
        super();
    }
}
