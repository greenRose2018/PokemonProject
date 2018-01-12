package pokemon.model.pokemon;

public class Seadra extends Horsea
{
	public Seadra()
	{
		super(117,"Seadra");
		setup();
	}
	public Seadra(String name)
	{
		super(117,name);
		setup();
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
