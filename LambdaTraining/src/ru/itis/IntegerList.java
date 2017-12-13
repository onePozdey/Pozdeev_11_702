package ru.itis;

public class IntegerList {
    static final int NUM_COUNT = 10;
    private int array[];
    private int amount;

    public IntegerList() {
        this.array = new int[NUM_COUNT];
        this.amount = 0;
    }

    void add(int num) {
        array[amount++] = num;
    }

    void printOut() {
        System.out.print("Array now is: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void integerListMap(Function function) {
        for(int i = 0; i < array.length; i++) {
            array[i] = function.apply(array[i]);
        }
    }
    void integerListFilter(Predicate predicate) {
        IntegerList filteredArray = new IntegerList();
        for(int i = 0; i < array.length; i++) {
            array[i] = predicate.test(array[i]);
            filteredArray.add(array[i]);
        }
    }
}
