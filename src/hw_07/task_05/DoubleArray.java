package hw_07.task_05;

public class DoubleArray {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        int[][] initArray = {
                {
                        1, -2, 3, 4
                },
                {
                        -1, 2, 3, 4
                },
                {
                        1, 20, 3, 4
                },
                {
                        1, -2, 3, 414
                }
        };

        for (int i = 0; i < initArray.length; i++) {
            for (int j = 0; j < initArray.length; j++) {
                if (i > j && initArray[i][j] < 0) {
                    count++;
                }
                if (i < j && initArray[i][j] % 2 != 0) {
                    sum += initArray[i][j];
                }
            }
        }

        System.out.println("Count: " + count);
        System.out.println("sum: " + sum);

    }
}
