package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Water;

public class Horsea extends Pokemon implements Water
{
	public Horsea()
	{
		super(116, "Horsea");
	}
	public Horsea(String name)
	{
		super(116, name);
	}
	public Horsea(int number, String name)
	{
		super(number,name);
		setup();
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
	protected void setup()
	{
		this.setAttackPoints(10);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.85);
		this.setHealthPoints(30);
	}
}
