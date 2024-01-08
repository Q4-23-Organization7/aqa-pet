package hw_07.task_01;

import java.util.Arrays;

public class ToCharArray {
    public static String strOne = "шалаш";
    public static String strTwo = "пiп";
    public static String strThree = "зараз";

    public static void main(String[] args) {

        char[] stringOne = strOne.toCharArray();

        char[] stringReverse = new char[stringOne.length];
        for (int i = 0; i < stringOne.length; i++) {
            stringReverse[i] = stringOne[stringOne.length - i - 1];
        }
        System.out.println(stringOne);
        System.out.println(stringReverse);
        System.out.println(Arrays.equals(stringOne, stringReverse));

        char[] stringTwo = strTwo.toCharArray();

        char[] stringReverseTwo = new char[stringTwo.length];
        for (int i = 0; i < stringTwo.length; i++) {
            stringReverseTwo[i] = stringTwo[stringTwo.length - i - 1];
        }
        System.out.println(stringTwo);
        System.out.println(stringReverseTwo);
        System.out.println(Arrays.equals(stringTwo, stringReverseTwo));

        char[] stringThree = strThree.toCharArray();

        char[] stringReverseThree = new char[stringThree.length];
        for (int i = 0; i < stringThree.length; i++) {
            stringReverseThree[i] = stringThree[stringThree.length - i - 1];
        }
        System.out.println(stringThree);
        System.out.println(stringReverseThree);
        System.out.println(Arrays.equals(stringThree, stringReverseThree));
    }
}



