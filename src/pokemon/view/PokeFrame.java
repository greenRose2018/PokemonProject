package pokemon.view;

import pokemon.controller.Controller;
import javax.swing.JFrame;


public class PokeFrame extends JFrame
{	
	private Controller baseController;
	private PokePanel firstPanel;

	public PokeFrame(Controller baseController)
	{
		super();
		this.setBaseController(baseController);
		firstPanel = new PokePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(firstPanel);
		this.setTitle("Pokedex");
		this.setSize(800, 800);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public Controller getBaseController()
	{
		return baseController;
	}
	public void setBaseController(Controller baseController)
	{
		this.baseController = baseController;
	}
}
