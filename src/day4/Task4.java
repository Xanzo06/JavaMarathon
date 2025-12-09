package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];

            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Тройка с максимальной суммой: " + maxSum);
        System.out.println("Индекс " + index);

    }
}
