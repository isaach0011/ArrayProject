package hipster.view;

import hipster.controller.HipsterAppController;

import javax.swing.JFrame;

import java.awt.Dimension;

public class HipsterFrame extends JFrame
{

	private HipsterAppController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterAppController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Hipster 2016");
		this.setSize(new Dimension(600,400));
		this.setResizable(false);
		this.setVisible(true);
	}
}
