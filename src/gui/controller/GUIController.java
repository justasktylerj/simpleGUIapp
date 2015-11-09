package gui.controller;

import gui.view.GUIFrame;

/**
 * GUIController
 * @author tjar2074
 *Version 0.x nov 9,2015
 *
 */
public class GUIController 
{
	/**
	 * referance to the GUIFrame object for internal use‹43
	 */
	private GUIFrame basePanel;
	
	/**
	 * creates a GUIController and intitializes the GUIFrame.
	 */
	public GUIController()
	{
		baseFrame = new GUIFrame(this);
	}
	
	public void start()
	{}
}
