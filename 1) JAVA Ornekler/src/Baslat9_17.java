import java.util.ArrayList;
import java.util.Arrays;

import com.Ornekler_9_17.*;

public class Baslat9_17 
{

	public static void main(String[] args) 
	{
		Movie mov1 = new Movie("Titanic", "James Cameron", new ArrayList(Arrays.asList("Leonardo DiCaprio","Kate Winslet")));
		
		Review rev1 = new Review("Great Movie!", "İlyas", 8);
		Review rev2 = new Review("Highly Recommended!", "Alperen", 6.5);
		Review rev3 = new Review("A classic never gets old!", "Onur", 7);
		Review rev4 = new Review("Legend!", "Mustafa", 9.9);
		Review rev5 = new Review("Its Okey!", "Efe", 5.4);
		
		mov1.addReview(rev1);
		mov1.addReview(rev2);
		mov1.addReview(rev3);
		mov1.addReview(rev4);
		mov1.addReview(rev5);
		
		Movie mov2 = new Movie("Godfather", "Francis Ford Coppola", new ArrayList(Arrays.asList("Marlon Brando","Al Pacino","James Caan")));
		
		System.out.println("Reviwes for '" + mov1.getTitle() + "' by " + mov1.getDirector() +" :\n");
		for (Review review : mov1.getReviews())
		{
			System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
		}
		
		mov2.addReview(rev1);
		mov2.addReview(rev4);
		mov2.addReview(rev5);
		System.out.println("\nReviews for '" + mov2.getTitle() + "' by " + mov2.getDirector() + " :\n");
		for (Review review: mov2.getReviews())
		{
			System.out.println(review.getReviewText() + " by " + review.getReviewerName() + " - " + review.getRating());
		}
	}
}
