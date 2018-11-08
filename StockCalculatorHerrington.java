import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
/*In this program we take the users input for the number of share purchased,
 * price of shares, and price at which the user wants to sell the stock at.
 * The program will also display the amount paid for all stocks and the commission
 * paid to the the broker. It will also display total profit.
 * by: David Herrington.
 */
public class StockCalculatorHerrington {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		//Header
		System.out.println("Joe's Account Builder: \n-----------------------------------------------");
		
		//Commission percentage constant.
		final double com = 0.02;
		//Enter number of shares.
		System.out.print("\tEnter how many shares were purchased: ");
	     double numOfShares = kb.nextDouble();
	    //Enter price of shares.
	    System.out.print("\tEnter cost per share: ");
	     double priceOfShares = kb.nextDouble();
	    //Enter preferred sale price.
	    System.out.print("\tEnter preferred sell price per share: ");
	     double sellPrice = kb.nextDouble();
	     kb.nextLine();
	    //Calculate total paid for stock.
	    double totalPaid = numOfShares * priceOfShares;
	    //Calculate buy commission.
	    double buyCom = totalPaid * com;
	    //Calculate amount sold.
	    double amountSold = sellPrice * numOfShares;
	    //Calculate sell commission.
	    double sellCom = amountSold * com;
	    //Calculate total profit.
	    double totalProfit = amountSold - totalPaid - buyCom - sellCom;
	    //Decimal formatter.
	    NumberFormat formatter = new DecimalFormat("#0.00");
	    //Output header.
	    System.out.println("Joe's Account Displayer: \n-----------------------------------------------");
	    //Output values.
	    System.out.println("\tTotal amount paid for all stocks: $" + formatter.format(totalPaid) +"\n\tCommission paid to broker at purchase: $" + formatter.format(buyCom) + 
	    		"\n\tTotal sale price for all stocks: $" + formatter.format(amountSold) + "\n\tCommission paid to broker upon selling: $" + formatter.format(sellCom) +
	    		"\n\tYou have made a total of: $" + formatter.format(totalProfit));
		
	}
}