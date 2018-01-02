package pokemon.model.pokemon;

public class Beartic extends Cubchoo
{
	public Beartic()
	{
		super(614,"Beartic");
	}
	public Beartic(String name)
	{
		super(614,name);
	}
	public Beartic(int number, String name)
	{
		super(number, name);
		setup();
	}
	@Override
	protected void setup()
	{
		this.setAttackPoints(49);
		this.setCanEvolve(false);
		this.setHealthPoints(210);
	}
}
