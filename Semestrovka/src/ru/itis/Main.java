package ru.itis;

public class Main {

    public static void main(String[] args) {
        int array[] = {1, 0, 2, 3, 4, 0, 76, 3, 6, 9};
        VectorCode vectors = new VectorCode(array);
        vectors.sOut();
        int array2[] = vectors.decode();
        vectors.decode();
//        vectors.delete(3);
        vectors.sOut();
//        vectors.insert(4, 3);
//        vectors.sOut();
        vectors.vectorSum();
        vectors.mult(3, 2);
        vectors.sOut();
    }
}
