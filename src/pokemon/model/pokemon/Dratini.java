package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Dragon;

public class Dratini extends Pokemon implements Dragon
{
	public Dratini(int number, String name)
	{
		super(number, name);
	}
	public String sayName()
	{
		return "Dratini";
	}
	
	public boolean canFly()
	{
		return true;
	}
	public int dragonTail()
	{
		return 0; 
	}
}
