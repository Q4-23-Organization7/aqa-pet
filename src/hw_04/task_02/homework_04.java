package task_02;

import java.util.Scanner;

public class homework_04 {

    public static double x;

    public static double y;

    public static double z;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter degree Celsius: ");
        x = sc.nextDouble();

        y = x * 9/5 + 32;

        z = x + 273.16;

        System.out.println(x + " Celsius: " + y + " Fahrenheit; " + z + " Kelvin");
    }
}
