package pokemon.model.pokemon;

import pokemon.model.types.Dragon;

public class Kingdra extends Seadra implements Dragon
{
	public Kingdra()
	{
		super(230,"Kingdra");
		setup();
	}
	public Kingdra(String name)
	{
		super(230,name);
		setup();
	}
	public Kingdra(int number, String name)
	{
		super(number, name);
		setup();
	}
	public String sayName()
	{
		return "Kingdra";
	}
	
	public boolean canFly()
	{
		return false;
	}
	public int dragonTail()
	{
		return 15;
	}
	@Override
	protected void setup()
	{
		this.setAttackPoints(40);
		this.setCanEvolve(false);
		this.setHealthPoints(210);
	}
}
