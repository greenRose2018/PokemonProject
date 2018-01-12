package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Grass;

public class Snivy extends Pokemon implements Grass
{
	public Snivy()
	{
		super(495,"Snivy");
		setup();
	}
	public Snivy(String name)
	{
		super(495,name);
		setup();
	}
	public Snivy(int number, String name)
	{
		super(number, name);
		setup();
	}
	public int vineWhip()
	{
		return 10;
	}
	public int solarBeam()
	{
		return 15;
	}
	public String sayName()
	{
		return "Snivy";
	}
	protected void setup()
	{
		this.setAttackPoints(20);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.5);
		this.setHealthPoints(55);
	}
}
