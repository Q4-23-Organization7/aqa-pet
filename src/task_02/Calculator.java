package task_02;

public class Calculator {

    public static double firstNumber;

    public static double secondNumber;

    public static double result;

    public Calculator(double firstNumber, double secondNumber) {
        Calculator.firstNumber = firstNumber;
        Calculator.secondNumber = secondNumber;

    }

    static void addition(double firstNumber, double secondNumber) {
        result = firstNumber + secondNumber;
        System.out.println("Result off addition: " + result);

    }
    static void subtraction(double firstNumber, double secondNumber) {
        result = firstNumber - secondNumber;
        System.out.println("Result subtraction: " + result);
    }

    static void multiplication(double firstNumber, double secondNumber) {
        result = firstNumber * secondNumber;
        System.out.println("Result multiplication: " + result);
    }

    static void division(double firstNumber, double secondNumber) {
        result = firstNumber / secondNumber;
        System.out.println("Result division: " + result);
    }

}
