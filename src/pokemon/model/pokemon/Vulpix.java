package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Fire;

public class Vulpix extends Pokemon implements Fire
{	
	public Vulpix()
	{
		super(037, "Vulpix");
	}
	public Vulpix(String name)
	{
		super(037, name);
	}
	public Vulpix(int number, String name)
	{
		super(number,name);
		setup();
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
	protected void setup()
	{
		this.setAttackPoints(15);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.75);
		this.setHealthPoints(60);
	}
}
