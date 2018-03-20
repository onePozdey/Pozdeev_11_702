package ru.itis;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Iterator<Integer> iterator = list.iterator();

        list.add(45);
        list.add(23);
        list.add(2343);
        list.add(34);
        list.add(3456);
        list.add(44);
        list.add(3);


        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
