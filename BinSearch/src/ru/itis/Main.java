package ru.itis;

public class Main {

    public static int find(int array[], int lower, int upper, int wantToFind) {
        int value = 0;
        int mid = 0;
        for(int j = 0; j < lower; j++) {
            System.out.print("  ");
        }
        System.out.print("{");
        for(int i = lower; i < upper; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.print("}");
        System.out.println();
        do {
            mid = lower + (upper - lower)/2;
            if(wantToFind > array[mid]) {
                if(array[mid] == array[lower]) {
                    return -1;
                } else {
                    lower = mid;
                    find(array, lower, upper, wantToFind);
                }
            } else if(wantToFind < array[mid]) {
                if(array[mid] == array[upper]) {
                    return -1;
                } else {
                    upper = mid;
                    find(array, lower, upper, wantToFind);
                }
            } else if(wantToFind == array[mid]) {
                value = mid;
            }
        }while(array[mid] != wantToFind);
        return value;
    }

    public static void main(String[] args) {
	    int array[] = {2, 4, 8, 16, 34, 45, 53, 56};
        System.out.println(find(array, 0, array.length, 53));
    }
}
