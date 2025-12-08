package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int eightScore = 0;
        int oneScore = 0;
        int evenScore = 0;
        int oddScore = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            if (numbers[i] > 8) {
                eightScore++;
            }
            if (numbers[i] == 1) {
                oneScore++;
            }
            if (numbers[i] % 2 == 0) {
                evenScore++;
            }
            if (numbers[i] % 2 != 0){
                oddScore++;
            }
            sum = sum+i;

        }
        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);
        System.out.println("Количество чисел больше 8: " + eightScore);
        System.out.println("Количество чисел равных 1: " + oneScore);
        System.out.println("Количество чётных чисел: " + evenScore);
        System.out.println("Количество нечётных чисел: " + oddScore);
        System.out.println("Сумма: " + sum);



    }
}
