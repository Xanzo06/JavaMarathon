package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfIssue(2025);
        car.setColor("Black");
        car.setModel("Toyota");
        System.out.println("Машина: " + car.getModel() +  "\nЦвет: " + car.getColor() + "\nГод выпуска: " + car.getYearOfIssue());

    }
}
