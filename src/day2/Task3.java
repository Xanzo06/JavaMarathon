package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        int c = a + 1;
        while (c < b){
            if((c % 5 == 0) && (c % 10 != 0)) {
                System.out.print(c + " ");
            }
            c++;

        }

    }
}
