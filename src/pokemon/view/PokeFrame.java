package pokemon.view;

import pokemon.controller.Controller;
import javax.swing.JFrame;


public class PokeFrame extends JFrame
{	
	private Controller appController;
	private PokePanel firstPanel;

	public PokeFrame(Controller appController)
	{
		super();
		this.setAppController(appController);
		firstPanel = new PokePanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(firstPanel);
		this.setTitle("Pokedex");
		this.setSize(500,450);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public Controller getAppController()
	{
		return appController;
	}
	public void setAppController(Controller appController)
	{
		this.appController = appController;
	}
}
