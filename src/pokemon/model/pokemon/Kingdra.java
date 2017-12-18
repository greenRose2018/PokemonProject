package pokemon.model.pokemon;

import pokemon.model.types.Dragon;

public class Kingdra extends Horsea implements Dragon
{
	public Kingdra(int number, String name)
	{
		super(number, name);
	}
	public String sayName()
	{
		return "Kingdra";
	}
	
	public boolean canFly()
	{
		return false;
	}
	public int dragonTail()
	{
		return 15;
	}
}
