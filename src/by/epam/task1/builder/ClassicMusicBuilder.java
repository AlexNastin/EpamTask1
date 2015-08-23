package by.epam.task1.builder;

import by.epam.task1.musicalcomposition.Gener;
import by.epam.task1.musicalcomposition.Music;

public class ClassicMusicBuilder implements Builder {

	public Music getMusic(String tembre, String title, String author,
			double duration) {
		Music music = new Music(tembre, title, author, Gener.CLASSIC, duration);
		return music;
	}

}
