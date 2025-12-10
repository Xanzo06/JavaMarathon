package day8;

public class Task1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String numbers = "";

        for (int i = 0; i <= 20000; i++)
            numbers += i + " ";

        long endTime = System.currentTimeMillis();

        System.out.println("Время работы программы c классом String: " + (endTime - startTime));
        System.out.print(numbers);
        System.out.println();

        StringBuilder sb = new StringBuilder();

        startTime = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++)
            sb.append(i).append(" ");

        endTime = System.currentTimeMillis();

        System.out.println("Время работы программы с классом StringBuilder: " + (endTime - startTime));

        System.out.print(sb);
        System.out.println();



    }
}
