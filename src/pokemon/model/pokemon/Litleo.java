package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Normal;
import pokemon.model.types.Fire;

public class Litleo extends Pokemon implements Normal, Fire
{
	public Litleo()
	{
		super(667,"Litleo");
	}
	public Litleo(String name)
	{
		super(667, name);
	}
	public Litleo(int number, String name)
	{
		super(number,name);
		setup();
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
	
	protected void setup()
	{
		this.setAttackPoints(16);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.70);
		this.setHealthPoints(58);
	}

}
