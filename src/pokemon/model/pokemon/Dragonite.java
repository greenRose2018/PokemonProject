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
	public boolean canFly()
	{
		return true;
	}
	public int dragonTail()
	{
		return 10;
	}
}
