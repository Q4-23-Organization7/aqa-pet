package hw_09.task_02;

public class ProgramCalculator extends Calculator {

    public ProgramCalculator() {
    }

    static int toBinary(int a) {
        return (Integer.parseInt((Integer.toBinaryString(a))));

    }

    static int toOctal(int a) {
        return Integer.parseInt((Integer.toOctalString(a)));
    }
}
