package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Ice;

public class Cubchoo extends Pokemon implements Ice
{
	public Cubchoo()
	{
		super(613,"Cubchoo");
	}
	public Cubchoo(String name)
	{
		super(613,name);
	}
	public Cubchoo(int number, String name)
	{
		super(number,name);
		setup();
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
	protected void setup()
	{
		this.setAttackPoints(15);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.90);
		this.setHealthPoints(43);
	}
}
