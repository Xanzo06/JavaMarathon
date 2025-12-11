package day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> group = new ArrayList<>();

        MusicBand musicBand1 = new MusicBand("The Beatles", 1960);
        MusicBand musicBand2 = new MusicBand("The Rolling Stones", 1962);
        MusicBand musicBand3 = new MusicBand("Pink Floyd", 1965);
        MusicBand musicBand4 = new MusicBand("Led Zeppelin", 1968);
        MusicBand musicBand5 = new MusicBand("Queen",1970);
        MusicBand musicBand6 = new MusicBand("Imagine Dragons",2008);
        MusicBand musicBand7 = new MusicBand("Arctic Monkeys",2002);
        MusicBand musicBand8 = new MusicBand("The Black Keys",2001);
        MusicBand musicBand9 = new MusicBand("The Killers",2001);
        MusicBand musicBand10 = new MusicBand("Wolf Alice",2010);


        group.add(musicBand1);
        group.add(musicBand2);
        group.add(musicBand3);
        group.add(musicBand4);
        group.add(musicBand5);
        group.add(musicBand6);
        group.add(musicBand7);
        group.add(musicBand8);
        group.add(musicBand9);
        group.add(musicBand10);

        System.out.println(group);

        System.out.println();

        System.out.println("После перемешивания списка: " + group);

        Collections.shuffle(group);

        List<MusicBand> after2000 = Task3.groupsAfter2000(group);

        System.out.println("Группы основаные после 2000-х " + after2000 );


    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> result = new ArrayList<>();
        for (MusicBand band : bands){
            if (band.getYear() > 2000){
                result.add(band);
            }
        }
        return result;
    }
}
