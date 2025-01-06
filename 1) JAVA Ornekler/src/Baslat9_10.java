import java.util.ArrayList;
import com.Ornekler_9_10.*;

public class Baslat9_10 
{

	public static void main(String[] args) 
	{
		Bank b1 = new Bank();
		Account a1 = new Account("İLYAS",2004,19999);
		Account a2 = new Account("ALP",2005,29999);
		Account a3 = new Account("ONUR",2003,39999);
		b1.addAccount(a1);
		b1.addAccount(a2);
		b1.addAccount(a3);
		ArrayList<Account> accounts = b1.getAccounts();
		for (Account account: accounts)
		{
			System.out.println(account.getAccountInfo());
		}
		System.out.println();
		System.out.println("\tAfter Depositing 1 dollar to a1: ");
		b1.depositMoney(a1,1);
		System.out.println(a1.getAccountInfo());
		System.out.println();
		System.out.println("\tAfter No Transaction in a2: ");
		System.out.println(a2.getAccountInfo());
		System.out.println();
		System.out.println("\tAfter Withdrawing 9999 dollars to a3: ");
		b1.withdrawMoney(a3,9999);
		System.out.println(a3.getAccountInfo());
			
		
		
	}

}
 