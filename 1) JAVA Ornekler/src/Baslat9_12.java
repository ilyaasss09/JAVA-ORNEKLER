import com.Ornekler_9_12.*;

public class Baslat9_12 
{

	public static void main(String[] args) 
	{
		Library l1 = new Library();
		Book b1 = new Book("Anna Karenina","Tolstoy");
		Book b2 = new Book("Crime and Punishment","Dostoyevski");
		Book b3 = new Book("War and Peace","Tolstoy");
		Book b4 = new Book("Les Misérables","Victor Hugo");
		
		l1.addBook(b1);
		l1.addBook(b2);
		l1.addBook(b3);
		l1.addBook(b4);
		System.out.println("Books in the library: \n");
		for(Book book : l1.getBooks())
		{
			System.out.println(book.getTitle() + " By " + book.getAuthor());
		}
		
		System.out.println("\n\nBooks in the library after removing " + b3.getTitle() + ":\n");
		l1.removeBook(b3);
		for (Book book: l1.getBooks())
		{
			System.out.println(book.getTitle() + " By " + book.getAuthor());
		}


	}

}
