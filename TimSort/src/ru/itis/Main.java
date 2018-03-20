package ru.itis;

import java.time.LocalTime;

public class Main {

    public static final int AMOUNT_OF_ELEMENTS = (int)(Math.random() * (9900 + 100));
    public static final int MIN_RUN = 32;
    public static int amountOfIterations = 0;

    public static void insertionSort(int[] array) {
        int temp = 0;
        int j = 0;
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while ((j > 0) && (temp < array[j - 1])) {
                    array[j] = array[j - 1];
                    j--;
                    amountOfIterations++;
                }
                array[j] = temp;
                amountOfIterations++;
            }
        }
    }

    public static void merge(int array[], int end) {
        int leftLength = end / 2;
        int rightLength = end - leftLength;
        int left[] = new int[leftLength];
        int right[] = new int[rightLength];
        for (int i = 0; i < leftLength; i++) {
            left[i] = array[i];
            amountOfIterations++;
        }
        for (int i = leftLength; i < rightLength; i++) {
            right[i] = array[i];
            amountOfIterations++;
        }

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
            amountOfIterations++;
        }
        while (i < leftLength) {
            array[k] = left[i];
            k++;
            i++;
            amountOfIterations++;
        }
        while (j < rightLength) {
            array[k] = right[j];
            k++;
            j++;
            amountOfIterations++;
        }
    }

    public static void timSort(int array[], int arraySize) {
        insertionSort(array);
        for (int size = MIN_RUN; size < arraySize; size = 2*size) {
            for (int left = 0; left < arraySize; left += 2*size) {
                int center = arraySize / 2;
                int right = arraySize - center;
                merge(array, right);
            }
        }
    }

    public static void main(String[] args) {
        Staff staff = new Staff();      // служебный класс
        int array[] = new int[AMOUNT_OF_ELEMENTS];
        staff.write();
        staff.read(array);

        long startTime = System.currentTimeMillis();
        timSort(array, AMOUNT_OF_ELEMENTS);
        long endTime = System.currentTimeMillis();
        long timeDifference = endTime - startTime;

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Time spent: " + timeDifference);
        System.out.println("Itarations done: " + amountOfIterations);
    }
}
