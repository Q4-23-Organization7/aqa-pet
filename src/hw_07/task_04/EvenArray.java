package hw_07.task_04;

import java.util.Arrays;
import java.util.Scanner;

public class EvenArray {
    public static int n;

    public static void main(String[] args) {
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter Array length bigger then 3");
            if (scn.hasNextInt()) {
                n = scn.nextInt();
            } else System.out.println("Error. This is not a digit.");
        }
        while (n < 4);
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

