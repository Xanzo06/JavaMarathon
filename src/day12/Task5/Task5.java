package day12.Task5;


import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("John Lennon",40));
        members1.add(new MusicArtist("Paul McCartney",82));
        members1.add(new MusicArtist("Ringo Starr",85));
        members1.add(new MusicArtist("George Harrison",58));
        MusicBand band1 = new MusicBand("The Beatles", 1960, members1);


        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Robert Plant",77));
        members2.add(new MusicArtist("Jimmy Page", 81));
        members2.add(new MusicArtist("John Paul Jones", 79));
        members2.add(new MusicArtist("John Bonham",32));
        MusicBand band2 = new MusicBand("Led Zeppelin", 1968, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
