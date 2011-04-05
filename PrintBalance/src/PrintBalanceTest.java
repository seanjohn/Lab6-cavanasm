import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;



public class PrintBalanceTest {
	@Test
	public void testEnglishGreeting(){
		PrintBalance test = new PrintBalance(new Locale("en","US"));
		assertEquals(test.greeting(),"Hello World");
	}
	
	@Test
	public void testFrenchGreeting(){
		PrintBalance test = new PrintBalance(new Locale("fr","FR"));
		assertEquals(test.greeting(),"Bonjour tout le monde");
	}
	
	@Test
	public void testGermanGreeting(){
		PrintBalance test = new PrintBalance(new Locale("de","DE"));
		assertEquals(test.greeting(),"Hallo Welt");
	}
	
	@Test
	public void testEnglishNameRequest(){
		PrintBalance test = new PrintBalance(new Locale("en","US"));
		assertEquals(test.nameRequest(),"Please enter your name");
	}
	
	@Test
	public void testFrenchNameRequest(){
		PrintBalance test = new PrintBalance(new Locale("fr","FR"));
		assertEquals(test.nameRequest(),"S'il vous plaît entrer votre nom");
	}
	
	@Test
	public void testGermanNameRequest(){
		PrintBalance test = new PrintBalance(new Locale("de","DE"));
		assertEquals(test.nameRequest(),"Bitte geben Sie Ihren Namen");
	}
	
	@Test
	public void testEnglishKindRemark(){
		PrintBalance test = new PrintBalance(new Locale("en","US"));
		assertEquals(test.kindRemark("John"),"I am pleased to meet you John");
	}
	
	@Test
	public void testFrenchKindRemark(){
		PrintBalance test = new PrintBalance(new Locale("fr","FR"));
		assertEquals(test.kindRemark("John"),"Je suis heureux de vous rencontrer John");
	}
	
	@Test
	public void testGermanKindRemark(){
		PrintBalance test = new PrintBalance(new Locale("de","DE"));
		assertEquals(test.kindRemark("John"),"Ich freue mich, Sie kennen zu lernen John");
	}
	
	@Test
	public void testEnglishBalance(){
		PrintBalance test = new PrintBalance(new Locale("en","US"));
		assertEquals(test.balance(),"You owe the school $9,876,543.21");
	}
	
	@Test
	public void testFrenchBalance(){
		PrintBalance test =new PrintBalance(new Locale("fr","FR"));
		assertEquals(test.balance(),"Vous devez l'école 9 876 543,21 €");
	}
	
	@Test
	public void testGermanBalance(){
		PrintBalance test = new PrintBalance(new Locale("de","DE"));
		assertEquals(test.balance(), "Du schuldest der Schule 9.876.543,21 €");
	}
	
	@Test
	public void testEnglishFarewell(){
		PrintBalance test = new PrintBalance(new Locale("en","US"));
		assertEquals(test.farewell(),"Good Bye");
	}
	
	@Test
	public void testFrenchFarewell(){
		PrintBalance test = new PrintBalance(new Locale("fr","FR"));
		assertEquals(test.farewell(),"Au revoir");
	}
	
	@Test
	public void testGermanFarewell(){
		PrintBalance test = new PrintBalance(new Locale("de","DE"));
		assertEquals(test.farewell(),"Auf Wiedersehen");
	}
}
