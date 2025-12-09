package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfIssue(2015);
        car.setColor("Black");
        car.setModel("Toyota");

        Motorbike motorbike = new Motorbike(2017, "Honda", "Blue");

        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(2020));
    }
}
