package hw_09.task_02;

public class EngineerCalculator extends Calculator {


    public EngineerCalculator() {

    }

    static double mathPow(int a, int b) {

        return Math.pow(a, b);
    }

    static double squareRoot(int a) {
        return (Math.sqrt(a));

    }

    static double cubeRoot(int a) {
        return Math.cbrt(a);
    }
}
