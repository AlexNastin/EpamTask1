package by.epam.task1.builder;

import by.epam.task1.musicalcomposition.Gener;
import by.epam.task1.musicalcomposition.Music;

public class PopMusicBuilder implements Builder {
	
	@Override
	public Music getMusic(String tembre,String title, String author, double duration) {
		Music music = new Music(tembre,title, author, Gener.POP, duration);
		return music;
	}
}
