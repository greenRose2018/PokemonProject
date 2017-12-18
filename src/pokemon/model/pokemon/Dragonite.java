package pokemon.model.pokemon;

public class Dragonite extends Dragonair
{
	public Dragonite(int number, String name)
	{
		super(number, name);
	}
	
	public String sayName()
	{
		return "Dragonite";
	}
	
	public int dragonTail()
	{
		return 10;
	}
}
