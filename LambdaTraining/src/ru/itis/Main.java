package ru.itis;

public class Main {

    public static void main(String[] args) {
        IntegerList array = new IntegerList();
        IntegerList result = new IntegerList();

        array.add(12);
        array.add(13);
        array.add(45);
        array.add(52);
        array.add(112);
        array.add(124);
        array.add(343);
        array.printOut();

        array.integerListMap((num -> {
            int sum = 0;
            while(num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            return sum;
        }));
        array.printOut();

        array.integerListFilter((int num) -> {
            if(num % 2 != 0) {
                result.add(num);
            }
            return num;
        });
        System.out.print("Filtered ");
        result.printOut();
    }
}
