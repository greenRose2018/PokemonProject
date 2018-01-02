package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Dragon;

public class Dratini extends Pokemon implements Dragon
{
	public Dratini()
	{
		super(147,"Dratini");
	}
	public Dratini(String name)
	{
		super(147, name);
	}
	public Dratini(int number, String name)
	{
		super(number, name);
		setup();
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
	
	protected void setup()
	{
		this.setAttackPoints(15);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(50);
	}
}
