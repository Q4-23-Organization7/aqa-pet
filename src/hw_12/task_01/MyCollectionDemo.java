package hw_12.task_01;

import java.util.*;

public class MyCollectionDemo {
    public static void main(String[] args) {
        List<Integer> originalList = generateRandomNumbers(100, -20, 20);

        System.out.println("Initial collection:");
        System.out.println(originalList);

        Set<Integer> uniqueSet = new HashSet<>(originalList);

        System.out.println("Collection without duplicates :");
        System.out.println(uniqueSet);

        int removedDuplicates = originalList.size() - uniqueSet.size();
        System.out.println("Amount of deleted duplicates : " + removedDuplicates);
    }

    public static List<Integer> generateRandomNumbers(int count, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(max - min + 1) + min);
        }
        return numbers;
    }
}
