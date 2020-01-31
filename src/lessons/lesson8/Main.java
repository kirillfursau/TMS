package lessons.lesson8;

public class Main {
    /*
    Создайте метод println(String s), который будет выбрасывать MyException с параметром s, а потом ловить это
    исключение и выводить параметр s. Выводите перенос строки в секции finally.
    */
    void println(String s) {
        try {
            throw new MyException(s);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println();
        }
    }
    /*
    Создайте метод nullPointer(), который будет создавать объект (любой), инициализировать его null, пытаться
    вызвать метод у этого объекта, ловить NullPointerException и выводить в catch блоке сообщение
    "NullPointerException thrown successfully".
    */
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
    /*
    Создайте методы f() и g(), так чтобы f() вызывал метод g(). В методе g() выбросите MyException, словите его в
    методе f(), и там же в catch блоке поделите 1 на 0. Проверьте, что при вызове этого метода вылетае
    ArithmeticException.
    */
    void f() {
        g();
    }
    /*
    Повторите упражнение 4, но в методе g() оберните MyException в RuntimeException, используя метод из
    упражнения 5. Почувствуйте разницу.
    */
    void g() {
        throw wrapException(new MyException());
    }
    /*
    Создайте метод wrapException(Exception e), который будет возвращать RuntimeException,
    созданный с аргументом е в конструкторе.
    */
    RuntimeException wrapException(Exception e) {
        return new RuntimeException(e);
    }
    /*
    Создайте метод unwrapException(Exception e), который будет выбрасывать сause исключения e.
    */
    void unwrapException(Exception e) throws Throwable {
        throw e.getCause();
    }
    /*
    Создайте метод generateArrayOutOfBoundsException(int i), который будет пытаться обратиться к i-му элементу массива
    и выбрасывать исключение, потому что такого элемента в массиве нет.
    */
    void generateArrayOutOfBoundsException(int i) {
        int[] array = new int[10];
        try {
            System.out.println(array[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No such item");
        }
    }

    /*
    Создайте метод threesome(), который будет ловить MyException, MyException2 и MyException3 в одном catch блоке.
    */
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
    /*
    Унаследуйте MyException3 от MyException2.
    Осознайте, почему код перестал компилироваться, и исправьте его не прибегая к Alt+Enter (ладно, можете прибегать
    , но осознайте) (возможно, у вас код не перестанет компилироваться. тогда обратитесь ко мне :) )
     */
}



