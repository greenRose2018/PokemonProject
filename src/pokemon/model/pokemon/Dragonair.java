package pokemon.model.pokemon;

public class Dragonair extends Dratini
{

	public Dragonair(int number, String name)
	{
		super(number, name);
	}
	
	public int dragonTail()
	{
		
		return 5;
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
