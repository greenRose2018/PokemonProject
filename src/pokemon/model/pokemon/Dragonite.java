package pokemon.model.pokemon;

public class Dragonite extends Dragonair
{
	public Dragonite()
	{
		super(149,"Dragonite");
		setup();
	}
	public Dragonite(String name)
	{
		super(149,name);
		setup();
	}
	public Dragonite(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	public String sayName()
	{
		return "Dragonite";
	}
	
	public int dragonTail()
	{
		return 10;
	}
	@Override
	protected void setup()
	{
		this.setAttackPoints(46);
		this.setHealthPoints(245);
		this.setCanEvolve(false);
	}
}
