package ru.itis;

import java.io.*;

import static ru.itis.Main.AMOUNT_OF_ELEMENTS;
import static ru.itis.Main.M;
import static ru.itis.Main.N;

public class Reader {
    public void read(Field[][] array) {
        try {
            File input = new File("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\MazeRouter\\src\\ru\\itis\\input");
            BufferedReader reader = new BufferedReader(new FileReader("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\MazeRouter\\src\\ru\\itis\\input"));
            for(int i = 0; i < N + 2; i++) {
                for(int j = 0; j < M + 2; j++) {
                    array[i][j] = new Field();
                    array[i][j].set(-5);
                }
            }
            for(int l = 1; l < N + 1; l++) {
                    for(int m = 1; m < M + 1; m++) {
                        String line = reader.readLine();
                        array[l][m].setField(-1 * (line.charAt(0) - '0'));
                    }
                }
        } catch(FileNotFoundException e) {
            System.err.println("Shit happened");
            System.exit(228);
        } catch(IOException e) {
            System.err.println("Shit happened");
            System.exit(666);
        }
    }
}
