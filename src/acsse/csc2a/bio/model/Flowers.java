package acsse.csc2a.bio.model;
//Inherits from BioFlora :
public class Flowers extends BioFlora {
	//Attributes :
	private double Polltoxic ;
	//Constructor :
	public Flowers(double Polltoxic ,String commonName,EGlowColour glowcolour,double base_width)
	{
		super(commonName,glowcolour,base_width);
		this.Polltoxic=Polltoxic ;
	}
	//Accessor :
	public double getPolltoxic()
	{
		return Polltoxic ;
	}
	//Mutator :
	public void setPolltoxic(double Polltoxic)
	{
		this.Polltoxic =Polltoxic ;

	}

}
