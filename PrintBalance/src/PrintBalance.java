import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


/**
 * TODO A simple class that needs to be localized
 *
 * @author mohan.
 *         Created Mar 27, 2010.
 */
public class PrintBalance{
	
	private ResourceBundle messages;
	private Locale currentLocale;
	
	public PrintBalance(Locale aLocale){
		this.currentLocale = aLocale;
		this.messages = ResourceBundle.getBundle("MessagesBundle",currentLocale);
	}
	
	public String greeting(){
		//Greeting
		return this.messages.getString("greeting");
	}
	
	public String getName(Scanner scanInput){
		//Get User's Name
		String name = scanInput.nextLine();
		return name;
	}
	
	public String date(){
		//print today's date, balance and bid goodbye
		Date today = new Date();
		return this.messages.getString("dateBegin")+ DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, this.currentLocale).format(today);
	}
	
	public String balance(){
		return this.messages.getString("owedAmount")+NumberFormat.getCurrencyInstance(this.currentLocale).format(9876543.21);
	}
	
	public String farewell(){
		return this.messages.getString("farewell");
	}

	
	/**
	 * Simple Java Method that is crying out to be localized.
	 *
	 * @param args
	 */
	public static void main(String args[])
	{
	
		Scanner scanInput = new Scanner(System.in);
		
//		Locale currentLocale = new Locale("en", "US");
		Locale currentLocale = new Locale("fr", "FR");
//		Locale currentLocale = new Locale("de", "DE");
		
		PrintBalance printer = new PrintBalance(currentLocale);	

		
		System.out.println(printer.greeting()+"\n"+printer.nameRequest());
		String name = printer.getName(scanInput);
		System.out.println(printer.kindRemark(name)+"\n"+printer.date()+"\n"+ printer.balance()+"\n"+printer.farewell());
	}

	public String kindRemark(String name) {
		return this.messages.getString("kindRemark") + name;
	}

	public String nameRequest() {
		return this.messages.getString("nameRequest");
	}
}