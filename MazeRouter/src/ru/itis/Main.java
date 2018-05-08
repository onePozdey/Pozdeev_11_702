package ru.itis;

import java.util.Scanner;

public class Main {

    public static final int N = 5;
    public static final int M = 5;
    public static final int AMOUNT_OF_ELEMENTS = M * N;

    public static boolean checkEdge(int i, int j) {
        if((i < 0) || (j < 0) || (i >= M) || (j >= N)) {
            return true;
        }
        return false;
    }

    public static boolean checkWall(int i, int j, Field array[][]) {
        if (checkEdge(i, j)) {
            if(array[i][j].getWaveValue() == -2) {
                return true;
            }
        }
        return false;
    }

    public static void mapSout(Field[][] array) {
        System.out.print("#");
        for(int i = 0; i < M; i++) {
            System.out.print("-");
        }
        System.out.println("#");

        for(int i = 1; i < N + 1; i++) {
            System.out.print("|");
            for(int j = 1; j < M + 1; j++) {
                if(array[i][j].getWaveValue() == -2) {
                    System.out.print("X");
                }else if(array[i][j].getWaveValue() == -1) {
                    System.out.print(" ");
                } else {
                    System.out.print(array[i][j].getWaveValue());
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
        Field[][] mazeMap = new Field[N + 2][M + 2];
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader();
        reader.read(mazeMap);

        mapSout(mazeMap);

        int wave = 0;
        int pointedI = scanner.nextInt();
        int pointedJ = scanner.nextInt();
        int endI = scanner.nextInt();
        int endJ = scanner.nextInt();
        mazeMap[pointedI][pointedJ].setField(0);
        mazeMap[endI][endJ].set(-3);

        mapSout(mazeMap);
        while((mazeMap[endI][endJ].getWaveValue() < 0)) {
            for(int i = 1; i < N + 1; i++) {
                for(int j = 1; j < M + 1; j++) {
                    if((mazeMap[i][j].getWaveValue() == wave) || (!mazeMap[i][j - 1].getMark()) || (!mazeMap[i - 1][j].getMark()) || (!mazeMap[i + 1][j].getMark())
                                    || (!mazeMap[i][j + 1].getMark())) {
                        wave++;
//                        if(!checkWall(i, j - 1, mazeMap)) {
//                            mazeMap[i][j-1].setField(wave);
//                        }
//                        if(!checkWall(i - 1, j, mazeMap)) {
//                            mazeMap[i - 1][j].setField(wave);
//                        }
//                        if(!checkWall(i + 1, j, mazeMap)) {
//                            mazeMap[i + 1][j].setField(wave);
//                        }
//                        if(!checkWall(i, j + 1, mazeMap)) {
//                            mazeMap[i][j + 1].setField(wave);
//                        }
                        mazeMap[i][j - 1].setField(wave++);
                        mazeMap[i - 1][j].setField(wave++);
                        mazeMap[i + 1][j].setField(wave++);
                        mazeMap[i][j + 1].setField(wave++);
                        mazeMap[i][j].setField(wave);
                    }
                }
            }
            mapSout(mazeMap);
        }
        mapSout(mazeMap);

    }
}
