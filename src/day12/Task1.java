package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> car = new ArrayList<>();
        car.add("BMW");
        car.add("KIA");
        car.add("FIAT");
        car.add("LADA");
        car.add("GAZ");

        System.out.println(car);

        car.add("AUDI");

        System.out.println(car);

        car.remove(0);

        System.out.println(car);


    }
}
