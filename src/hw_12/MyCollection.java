package hw_12;

import java.util.*;

public class MyCollection {

    public static ArrayList<Integer> createList() {

        ArrayList<Integer> list = new ArrayList<>() {
        };

        for (int i = 0; i < 100; i++) {
            double random = Math.random() * (40 + 1) - 21;
            list.add((int) random);
        }
        return list;
    }
}