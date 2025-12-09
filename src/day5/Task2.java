package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2025, "Honda", "Blue");
        System.out.println("Мотоцикл: " + motorbike.getModel() + "\nЦвет: " + motorbike.getColor() + "\nГод выпуска: " + motorbike.getYearOfIssue());
    }
}
