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
	private GUIPanel basePanel;
	
	public GUIFrame(GUIController baseController)
	{
		this.baseController = baseController;
		basePanel = new GUIPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);  //installs the panel in the frame
		this.setSize(400,400);
		this.setTitle("silly app!"); // find a good size for app
		this.setResizable(false); //can't change size of window
		this.setVisible(true);  //must be last line of setupFrame
	}
	
	public GUIController getBaseController()
	{
		return baseController;
	}
}
