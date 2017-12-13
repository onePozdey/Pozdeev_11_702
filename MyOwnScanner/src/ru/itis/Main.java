package ru.itis;

public class Main {

    public static void main(String[] args) throws Exception {
        MyScanner scanner = new MyScanner("D:/my sklad/For ITIS/java/Pozdeev_11_702/MyOwnScanner/input.txt");
        String line = scanner.nextLine();
        System.out.println(line);
        MyScanner scanner1 = new MyScanner("D:/my sklad/For ITIS/java/Pozdeev_11_702/MyOwnScanner/inputNum.txt");
        int numb = scanner1.nextInt();
        System.out.println(numb);

    }
}
