package day7;

import day7.Airplane;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2020, 50, 15000);
        Airplane airplane2 = new Airplane("Airbus", 2020, 55, 15000);

        Airplane.compareAirplane(airplane1, airplane2);


    }
}
