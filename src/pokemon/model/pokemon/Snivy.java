package pokemon.model.pokemon;

import pokemon.model.Pokemon;
import pokemon.model.types.Grass;

public class Snivy extends Pokemon implements Grass
{
	public Snivy(int number, String name)
	{
		super(number, name);
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
}
