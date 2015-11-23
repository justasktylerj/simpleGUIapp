package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import java.awt.Color;
import java.awt.event.*;

public class GUIPanel extends JPanel
{
	private GUIController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public GUIPanel(GUIController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("Please do not click the button");
		firstTextField = new JTextField("words can be type here");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	/**
	 * helper method to load all GUI components into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.setBackground(Color.MAGENTA);
		this.add(firstTextField);
	}
	
	/**
	 * Helping method for arranging the panel
	 * Dumping ground for generated code
	 */
	private void setupLayout() // FOR crap code
	{
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 83, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, -196, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 63, SpringLayout.SOUTH, firstButton);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 129, SpringLayout.WEST, this);
		
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Much Wow, this is the most amazing click event ever! WOW");
			}
		});
		
		this.addMouseListener(new MouseListener()
		{
			public void mouseClicked(MouseEvent click)
			{
				
			}
			public void mouseEntered(MouseEvent entered)
			{
				
			}
			public void mousePressed(MouseEvent pressed)
			{
				
			}
			public void mouseReleased(MouseEvent released)
			{
				
			}
			public void mouseExited(MouseEvent exited)
			{
				
			}
		});
	}
}	

