package hw_06.task_05;

import java.util.Scanner;

public class task_05 {
    public static String line;
    public static int length;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String with length of an even number: ");
        line = sc.nextLine();
        length = line.length();

        if (length % 2 == 0) {
            System.out.println("Two middle chars: " + line.charAt(length / 2 - 1) + " " + line.charAt(length / 2));
        } else {
            System.out.println("This String is not with length of an even number");
        }
    }
}