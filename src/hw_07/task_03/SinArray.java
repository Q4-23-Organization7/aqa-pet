package hw_07.task_03;

public class SinArray {

    public static int x = 0;

    public static void main(String[] args) {

        double[] mas = new double[36];

        for (int i = 0; i < 36; i++) {
            mas[i] = Math.sin(Math.toRadians(x));
            System.out.println("Sin(x) = " + mas[i]);
            x = x + 10;
        }
    }
}
