package pokemon.model.pokemon;

public class Dragonair extends Dratini
{
	public Dragonair()
	{
		super(148,"Dragonair");
		setup();
	}
	public Dragonair(String name)
	{
		super(148,name);
		setup();
	}
	public Dragonair(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public int dragonTail()
	{
		
		return 5;
	}
	
	public String sayName()
	{
		return "Dragonair";
	}
	@Override
	protected void setup()
	{
		this.setAttackPoints(22);
		this.setHealthPoints(150);
	}
}
