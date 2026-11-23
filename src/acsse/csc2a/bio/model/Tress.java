package acsse.csc2a.bio.model;
//Inherits from BioFlora
public class Tress extends BioFlora {
	//Attributes :
	private int OxygenCycle;
	//Constructor:
	public Tress(int OxygenCycle,String commonName,EGlowColour glowcolour,double base_width)
	{
		super(commonName,glowcolour,base_width);
		this.OxygenCycle=OxygenCycle;
	}
	//Accessors :
	public int getOxygenCycle()
	{
		return OxygenCycle;
	}
	//Mutators :
	public void setOxygenCycle(int OxygenCycle)
	{
		if(OxygenCycle > 0)
		{
			this.OxygenCycle = OxygenCycle;
		}else
		{
			
		}
	}
}
