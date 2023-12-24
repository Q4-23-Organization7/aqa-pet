package hw_06.task_03;

import java.util.Scanner;

public class MathAbsApp {
    public static int x;
    public static int y;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = sc.nextInt();
        System.out.println("Enter second number: ");
        y = sc.nextInt();

        if ((x < 0) | (y < 0)) {
            System.out.println("Result: " + (Math.abs(x) > Math.abs(y) ? x : y));
        } else {
            System.out.println("Result: " + Math.max(x, y));
        }
    }
}