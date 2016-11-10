package array.view;

import java.awt.Color;
import javax.swing.*;
import array.controller.ArrayController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HipsterPanel extends JPanel
{
	private ArrayController baseController;
	private JButton myButton;
	private JComboBox dropDown;
	private JLabel wordsLabel;
	private SpringLayout baseLayout;
	
	public HipsterPanel(ArrayController baseController)
	{
		super();
		this.baseController = baseController;
		myButton = new JButton("Click here!!");
		wordsLabel = new JLabel("such words!");
		baseLayout= new SpringLayout();
		dropDown = new JComboBox(baseController.getHipsters());
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(myButton);
		this.add(wordsLabel);
		this.add(dropDown);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, 68, SpringLayout.SOUTH, wordsLabel);
		baseLayout.putConstraint(SpringLayout.WEST, myButton, 69, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, wordsLabel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, wordsLabel, 183, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 1, SpringLayout.NORTH, myButton);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -104, SpringLayout.EAST, this);
	}
	private void setupListeners()
	{
		dropDown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				String selectedText = baseController.getWords()[dropDown.getSelectedIndex()];
				wordsLabel.setText(selectedText);
			}
		});
	}
}
