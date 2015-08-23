package by.epam.task1.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.epam.task1.builder.ManagerBuilder;
import by.epam.task1.logic.Worker;
import by.epam.task1.musicalcomposition.Gener;
import by.epam.task1.musicalcomposition.Music;
import by.epam.task1.musicalcomposition.MusicalSound;
import by.epam.task1.sort.SortByGener;

public class Main {

	public static void main(String[] args) {

		Music classicMusic = ManagerBuilder.getMusic("1", "A", "Dima",
				Gener.CLASSIC, 1);
		Music hipHopMusic = ManagerBuilder.getMusic("4", "B", "Masha",
				Gener.HIPHOP, 2);
		Music rockMusic = ManagerBuilder.getMusic("3", "C", "Vova", Gener.ROCK,
				3);
		Music popMusic = ManagerBuilder.getMusic("2", "D", "Misha", Gener.POP,
				4);
		List<MusicalSound> list = new ArrayList<MusicalSound>();

		list.add(classicMusic);
		list.add(hipHopMusic);
		list.add(rockMusic);
		list.add(popMusic);

		Collections.sort(list, new SortByGener());
		System.out.println(Worker.searchMusicForDuration(list, 1));

		for (MusicalSound music : list) {
			System.out.println(music);
		}
	};
}
