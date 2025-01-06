import java.util.ArrayList;
import com.Ornekler_9_15.*;

public class Baslat9_15 
{
	public static void main(String[] args) 
	{
		MusicLibrary library = new MusicLibrary();
		
		library.addSong(new Song("İki Melek","Bengü"));
		library.addSong(new Song("Bu Böyle","Sertab Erener"));
		library.addSong(new Song("Bir Devir Bitti","Ebru Gündeş"));
		library.addSong(new Song("Bir Bakmışsın","Yalın"));
		library.addSong(new Song("Tükeneceğiz","Sezen Aksu"));
		library.addSong(new Song("Demir Attım","Ebru Gündeş"));
		library.addSong(new Song("Gel Bahtımın Kar Beyazı","Müslüm Gürses"));
		
		System.out.println("All Songs: ");
		
		ArrayList<Song> a = (ArrayList)library.getSongs();
		for (Song song : a) 
		
		{
			System.out.println(song.getTitle() + " By " + song.getArtist());
		}
		
		System.out.println("\n\t***** PLAYING RANDOM MUSIC ***** ");
		
		library.playRandomSongs();
		System.out.println();
		library.playRandomSongs();
		System.out.println();
		library.playRandomSongs();
		
		 
		
	}

}
