package ru.itis;

import java.io.*;

import static ru.itis.Main.AMOUNT_OF_ELEMENTS;
import static ru.itis.Main.M;
import static ru.itis.Main.N;

public class Reader {
    public void read(int[][] array) {
        try {
            File input = new File("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\MazeRouter\\src\\ru\\itis\\input");
            BufferedReader reader = new BufferedReader(new FileReader("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\MazeRouter\\src\\ru\\itis\\input"));
                for(int l = 0; l < N; l++) {
                    for(int m = 0; m < M; m++) {
                        String line = reader.readLine();
                        array[l][m] = -1 * (line.charAt(0) - '0');
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
