package by.epam.task1.builder;

import by.epam.task1.musicalcomposition.Music;

public interface Builder {

	public Music getMusic(String tembre,String title, String author, double duration);
}