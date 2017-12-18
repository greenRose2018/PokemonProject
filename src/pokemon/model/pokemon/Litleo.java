package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Normal;
import pokemon.model.types.Fire;

public class Litleo extends Pokemon implements Normal, Fire
{
	public Litleo(int number, String name)
	{
		super(number,name);
	}
	public boolean hasEffectTailWhip()
	{
		return true;
	}
	public int takeDown()
	{
		return 15;
	}
	public String sayName()
	{
		return "Litleo";
	}
	
	public int flame()
	{
		return 5;
	}
	public int ember()
	{
		return 3;
	}

}
