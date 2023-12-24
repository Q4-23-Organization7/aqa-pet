package hw_06.task_04;

import java.util.Scanner;

public class task_04 {
    public static int sideA;
    public static int sideB;
    public static int sideC;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of first side of triangle: ");
        sideA = sc.nextInt();
        System.out.println("Enter length of second side of triangle: ");
        sideB = sc.nextInt();
        System.out.println("Enter length of third side of triangle: ");
        sideC = sc.nextInt();

        if (sideA == sideB | sideA == sideC | sideB == sideC) {
            System.out.println("This triangle is Equilateral.");
        } else {
            System.out.println("This triangle is not Equilateral.");
        }
    }
}
