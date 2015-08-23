package by.epam.task1.builder;

import by.epam.task1.musicalcomposition.Gener;
import by.epam.task1.musicalcomposition.Music;

public class ManagerBuilder {

	public static Music getMusic(String tembre, String title, String author,
			Gener gener, double duration) {
		Music music = null;
		switch (gener) {
		case CLASSIC:
			ClassicMusicBuilder builderClassic = new ClassicMusicBuilder();
			music = builderClassic.getMusic(tembre, title, author, duration);
			break;
		case HIPHOP:
			HipHopMusicBuilder builderHipHop = new HipHopMusicBuilder();
			music = builderHipHop.getMusic(tembre, title, author, duration);
			break;
		case POP:
			PopMusicBuilder builderPop = new PopMusicBuilder();
			music = builderPop.getMusic(tembre, title, author, duration);
			break;
		case ROCK:
			RockMusicBuilder builderRock = new RockMusicBuilder();
			music = builderRock.getMusic(tembre, title, author, duration);
			break;
		}
		return music;
	}
}
