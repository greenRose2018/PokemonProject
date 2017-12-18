package pokemon.controller;

import pokemon.view.PokeFrame;

public class Controller
{
	//MARK: Data-members
	private PokeFrame appFrame;
	
	public Controller()
	{
		appFrame = new PokeFrame(this);
	}
	public void start()
	{
		
	}
	
	public PokeFrame getPokeFrame()
	{
		return appFrame;
	}
}
