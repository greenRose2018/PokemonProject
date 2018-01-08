package pokemon.controller;

import pokemon.model.pokemon.*;
import pokemon.model.Pokemon;
import pokemon.view.PokeFrame;
import java.util.List;
import java.util.ArrayList;

public class Controller
{
	//MARK: Data-members
	private List<Pokemon> pokedex;
	private PokeFrame appFrame;
	
	
	public Controller()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokeFrame(this);
	}
	public void start()
	{
		
		
	}
	
	public void buildPokedex()
	{
		pokedex.add(new Cubchoo());
		pokedex.add(new Dratini());
		pokedex.add(new Horsea());
		pokedex.add(new Litleo());
		pokedex.add(new Snivy());
		pokedex.add(new Vulpix());
	}
	
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
	
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		return names;
	}
	
	
	public PokeFrame getPokeFrame()
	{
		return appFrame;
	}
}
