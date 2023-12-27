package hw_06.task_01;

import java.util.Scanner;

public class CheckOddEven {

    public static int x;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");

        x = sc.nextInt();

        String result = (x % 2) > 0 ? "Odd number." : "Even number.";

        System.out.println("Result: " + result + "\nBYE");
    }
}
