package by.epam.task1.logic;

import java.util.List;

import by.epam.task1.musicalcomposition.Music;
import by.epam.task1.musicalcomposition.MusicalSound;

public class Worker {

	public static MusicalSound searchMusicForDuration(
			List<MusicalSound> musicalSounds, double duration) {
		Music music = null;
		for (int i = 0; i < musicalSounds.size(); i++) {
			if (musicalSounds.get(i) instanceof Music) {
				music = (Music) musicalSounds.get(i);
				if (music.getDuration() == duration) {
					return (MusicalSound) music;
				}
			}
		}
		return music;
	}

}
