package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Water;

public class Horsea extends Pokemon implements Water
{
	public Horsea(int number, String name)
	{
		super(number,name);
	}
	public String sayName()
	{
		return "Horsea";
	}
	
	public boolean canSwim()
	{
		return true;
	}
	
	public int waterGun()
	{
		return 15;
	}
}
