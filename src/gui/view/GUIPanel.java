package gui.view;

import javax.swing.*;
import gui.controller.GUIController;
import javax.swing.SpringLayout; //for layout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

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
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Much Wow, this is the most amazing click event ever! WOW");
			}
		});
	}
}	

