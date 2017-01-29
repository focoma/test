package test;

import java.util.Locale;
import java.util.ResourceBundle;

public class Greeter
{
	ResourceBundle greetings;

	public Greeter()
	{
		this(Locale.getDefault());
	}
	
	public Greeter(Locale locale)
	{
		greetings = ResourceBundle.getBundle("GreetingsBundle", locale);
	}
	
	public String hello()
	{
		return greetings.getString("hello");
	}
	
	public static void main(String args[])
	{
		System.out.println(new Greeter(Locale.ENGLISH).hello());
		System.out.println(new Greeter(Locale.FRENCH).hello());
	}
}
