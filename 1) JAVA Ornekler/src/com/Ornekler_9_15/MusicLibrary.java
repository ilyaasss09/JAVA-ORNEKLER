package com.Ornekler_9_15;
import java.util.ArrayList;
import java.util.Random;

public class MusicLibrary 
{
	private ArrayList<Song> songs;
	
	public MusicLibrary()
	{
		songs = new ArrayList<Song>();
	}
	
	public void addSong(Song song)
	{
		songs.add(song);
	}
	
	public void removeSong(Song song)
	{
		songs.remove(song);
	}
	
	public ArrayList getSongs()
	{
		return songs;
	}
	
	public void playRandomSongs()
	{
		int size = songs.size();
		if (size == 0)
		{
			System.out.println("THERE IS NO SONGS IN THE LIBRARY!!");
			return;
		}
	Random rand = new Random();
	int index = rand.nextInt(size);
	System.out.println("Now Playing: " + songs.get(index).getTitle() + " By " + songs.get(index).getArtist());
	
	}
}

