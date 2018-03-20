package ru.itis;

import java.io.*;

import static ru.itis.Main.AMOUNT_OF_ELEMENTS;

public class Staff {
    File file;

    public  Staff() {
        this.file = new File("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\TimSort\\src\\ru\\itis\\file");
    }

    public void write() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\TimSort\\src\\ru\\itis\\file"));
            for(int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
                int num = (int)(Math.random() * 100000);
                writer.write(String.valueOf(num));
                writer.write('\n');
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Shit happened");
            System.exit(228);
        }
    }

    public void read(int[] array) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\my sklad\\For ITIS\\java\\Pozdeev_11_702\\TimSort\\src\\ru\\itis\\file"));
            for(int i = 0; i < AMOUNT_OF_ELEMENTS; i++) {
                String str = reader.readLine();
                int modifier = 1;
                for(int j = str.length() - 1; j >= 0; j--) {
                    array[i] = array[i] + (str.charAt(j) - '0') * modifier;
                    modifier *= 10;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Shit happened with file");
            System.exit(228);
        } catch (IOException e) {
            System.err.println("Shit happened with IO ");
            System.exit(666);
        }
    }
}
