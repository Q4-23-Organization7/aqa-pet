package hw_12.task_02;

import java.util.*;


public class ListX {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 2, 8, 1, 7, 4, 6);
        int X = 4;

        System.out.println("Initial list");
        System.out.println(numbers);

        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            while (left < right && numbers.get(left) <= X) {
                left++;
            }
            while (left < right && numbers.get(right) > X) {
                right--;
            }
            if (left < right) {
                int temp = numbers.get(left);
                numbers.set(left, numbers.get(right));
                numbers.set(right, temp);
                left++;
                right--;
            }
        }

        System.out.println("List after replacement:");
        System.out.println(numbers);
    }
}

