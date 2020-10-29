package me.juegotrivia.utils;

public class Utils {
	
	public final static void borrarConsola()
	{
	       try
	       {
	           final String os = System.getProperty("os.name");

	           if (os.contains("Windows"))
	           {
	               Runtime.getRuntime().exec("cls");
	           }
	           else
	           {
	               Runtime.getRuntime().exec("clear");
	           }
	       }
	       catch (final Exception e)
	       {
	           //  Handle any exceptions.
	       }
	}
	
}
