package pokemon.model.pokemon;

public class Seadra extends Horsea
{
	public Seadra()
	{
		super(117,"Seadra");
	}
	public Seadra(String name)
	{
		super(117,name);
	}
	public Seadra(int number, String name)
	{
		super(number,name);
		setup();
	}
	public String sayName()
	{
		return "Seadra";
	}
	@Override
	protected void setup()
	{
		this.setAttackPoints(20);
		this.setHealthPoints(130);
	}
}
