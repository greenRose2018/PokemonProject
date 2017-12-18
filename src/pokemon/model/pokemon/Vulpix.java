package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Fire;

public class Vulpix extends Pokemon implements Fire
{	
	public Vulpix(int number, String name)
	{
		super(number,name);
	}
	
	public int flame()
	{
		return 5;
	}
	
	public int ember()
	{
		return 5;
	}
	
	public String sayName()
	{
		return "Vulpix";
	}
}
