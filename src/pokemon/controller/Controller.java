package pokemon.controller;

import pokemon.model.Pokemon;
import pokemon.view.PokeFrame;
import java.util.List;
import java.util.ArrayList;

public class Controller
{
	//MARK: Data-members
	private List<Pokemon> pokedex;
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		return false;
	}
	public boolean isValidDouble(String input)
	{
		return false;
	}
	
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
