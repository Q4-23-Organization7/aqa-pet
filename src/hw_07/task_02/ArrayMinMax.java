package hw_07.task_02;

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of digits: ");

        int a = s.nextInt();

        int[] mas = new int[a];
        int max = mas[0], min = mas[0];

        System.out.println("Enter digits in Array: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max)
                max = mas[i];

            if (mas[i] < min)
                min = mas[i];
        }
        System.out.println("Max digit: " + max);
        System.out.println("Min Digit: " + min);
    }
}