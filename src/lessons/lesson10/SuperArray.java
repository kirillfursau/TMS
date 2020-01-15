package lessons.lesson10;

public class SuperArray<T extends Number> {
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

    void add(T element) throws SuperArrayOverflowException {
        if (i < array.length) {
            array[i] = element;
            i++;
        }
    }
    void getSum(){
        double sum = 0;
        for (int i = 0; i < array.length;i++) {
            sum += array[i].doubleValue();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SuperArray<Long> n = new SuperArray<>(3);
        System.out.println(n.getSize());
        try {
            n.add(3l);
            n.add(3l);
            n.add(3l);
        } catch (SuperArrayOverflowException e) {

        }
        n.getSum();
    }
}

