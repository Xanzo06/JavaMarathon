package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] arr = new int[12][8];

        int index = 0;
        int maxResult = 0;

        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(50);
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            if (sum >= maxResult){
                maxResult = sum;
                index = i;
            }

            System.out.println("Сумма: " + sum);
        }
        System.out.println("Индекс с максимальной суммой: " + index);

    }
}
