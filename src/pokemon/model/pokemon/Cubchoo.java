package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Ice;

public class Cubchoo extends Pokemon implements Ice
{
	public Cubchoo(int number, String name)
	{
		super(number,name);
	}
	
	public String sayName()
	{
		return "Cubchoo";
	}
	
	public int powderSnow()
	{
		return 15;
	}
	
	public int icyWind()
	{
		return 10;
	}
}
