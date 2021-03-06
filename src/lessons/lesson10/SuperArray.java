package lessons.lesson10;

public class SuperArray<T extends Number> {
    /*
    1. Создайте generic класс SuperArray, который будет хранить массив чисел произвольного типа (любых наследников
    Number)
    2. Добавьте конструктор с параметром int, который будет определять размер массива, а также конструктор без
    параметров, который будет создавать массив на 10 элементов
    3. Добавьте в него методы:
    */
    Number[] array;
    int i = 0;

    SuperArray(int i) {
        this.array = new Number[i];
    }

    SuperArray() {
        this.array = new Number[10];
    }

    //    Number[] getArray(Number ... n){
//        Number[] array = new Number[getArray().length];
//        for (int i = 0; i < getArray().length;i++){
//            array[i] = getArray()[i];
//        }
//        return array;
//    }
    int getSize() {
        return array.length;
    }

    Number[] getArray() {
        return array;
    }

    Number[] add(T element) {
        if (i < array.length) {
            array[i] = element;
            i++;
        } else {
            throw new SuperArrayOverflowException("Out off array length");
        }
        return array;
    }

    void getSum() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SuperArray<Long> n = new SuperArray<>(3);
        System.out.println(n.getSize());
        n.add(3l);
        n.add(3l);
        n.add(3l);
        n.getSum();
    }
}

