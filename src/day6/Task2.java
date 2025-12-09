package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplane airplane = new Airplane("Боинг", 2020, 50, 15000);

    airplane.setYear(2021);
    airplane.setLength(55);

    airplane.fillUp(490);
    airplane.fillUp(500);

    airplane.info();

}
    }
