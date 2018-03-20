package ru.itis;

import java.util.Scanner;

public class Main {

    public static final int N = 5;
    public static final int M = 5;
    public static final int AMOUNT_OF_ELEMENTS = M * N;

    public static boolean checkEdge() {
        return false;
    }

    public static boolean checkWall(int i, int j, int array[][]) {
        if(array[i][j] != -2) {
            return true;
        }
        return false;
    }

    public static void mapSout(int[][] array) {
        System.out.print("#");
        for(int i = 0; i < M; i++) {
            System.out.print("-");
        }
        System.out.println("#");

        for(int i = 0; i < N; i++) {
            System.out.print("|");
            for(int j = 0; j < M; j++) {
                if(array[i][j] == -2) {
                    System.out.print("X");
                }else if(array[i][j] == -1) {
                    System.out.print(" ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            System.out.println("|");
        }

        System.out.print("#");
        for(int i = 0; i < M; i++) {
            System.out.print("-");
        }
        System.out.println("#");
    }

    public static void main(String[] args) {
        int[][] mazeMap = new int[N][M];
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader();
        reader.read(mazeMap);

        mapSout(mazeMap);

        int wave = 0;
        int pointedI = scanner.nextInt();
        int pointedJ = scanner.nextInt();
        int endI = scanner.nextInt();
        int endJ = scanner.nextInt();
        mazeMap[pointedI][pointedJ] = 0;
        mazeMap[endI][endJ] = -3;

        mapSout(mazeMap);
        while(mazeMap[endI][endJ] == -3) {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(mazeMap[i][j] == wave) {
                        wave++;
                        if(checkWall(i, j - 1, mazeMap)) {
                            mazeMap[i][j-1] = wave;
                        }
                        if(checkWall(i - 1, j, mazeMap)) {
                            mazeMap[i - 1][j] = wave;
                        }
                        if(checkWall(i + 1, j, mazeMap)) {
                            mazeMap[i + 1][j] = wave;
                        }
                        if(checkWall(i, j + 1, mazeMap)) {
                            mazeMap[i][j + 1] = wave;
                        }
                    }
                }
            }
        }

        mapSout(mazeMap);


    }
}
