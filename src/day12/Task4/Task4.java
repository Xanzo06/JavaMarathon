package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("John Lennon");
        members1.add("Paul McCartney");
        members1.add("Ringo Starr");
        members1.add("George Harrison");
        MusicBand band1 = new MusicBand("The Beatles", 1960, members1);


        List<String> members2 = new ArrayList<>();
        members2.add("Robert Plant");
        members2.add("Jimmy Page");
        members2.add("John Paul Jones");
        members2.add("John Bonham");
        MusicBand band2 = new MusicBand("Led Zeppelin", 1968, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();

        band2.printMembers();

    }
}
