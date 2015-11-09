package gui.controller;

/**
 * Starts the simple GUI program
 * @author tjar2074
 *@version 0.1 nov 9, 2015
 */
public class GUIRunner 
{ 
	
	/**
	 * @param args
	 */
	public static void main (String [] args)
	{
		GUIController.myController = new GUIController();
		myController.start();
	}
}
