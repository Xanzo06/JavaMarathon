package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numbers = new int[100];

        int max = numbers[0];
        int min = numbers[0];
        int zeroCount = 0;
        int sum = 0;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        for (int maxNum : numbers){
            if (maxNum > max){
                max = maxNum;
            }
        }
        for (int minNum : numbers){
            if (minNum < min){
                min = minNum;
            }
        }
        for (int value : numbers){
            if (value % 10 == 0){
                zeroCount++;
                sum += value;
            }
        }



        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Самое большое число массива: " + max);
        System.out.println("Самое маленькое число массива: " + min);
        System.out.println("Количество елементов заканщивающихся на 0: " + zeroCount);
        System.out.println("Сумма элементов массива заканчивающихся на 0: " + sum);
    }
}
