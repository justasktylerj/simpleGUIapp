package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

/**
 * @author tjar2074
 *version 0.x nov 9, 2015
 *
 */

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(400,400);
		this.setResizable(false); //can't change size of window
		this.setVisible(true);
	}
}
