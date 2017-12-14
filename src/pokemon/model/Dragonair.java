package pokemon.model;

public class Dragonair extends Pokemon implements Dragon
{

	public Dragonair(int number, String name)
	{
		super(number, name);
	}
	
	public String attackMoves()
	{
		String attack = "Roar";
		return attack;
	}
	public boolean canFly()
	{
		return true;
	}
	
	public String sayName()
	{
		return "Dragonair";
	}
}
