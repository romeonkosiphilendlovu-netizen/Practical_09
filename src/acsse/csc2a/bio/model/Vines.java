package acsse.csc2a.bio.model;
//Inherites from BioFlora :
public class Vines extends BioFlora {
//Attribute :
	private String Potency;
	//Constructors :
	public Vines(String Potency,String commonName,EGlowColour glowcolour,double base_width) {
		// TODO Auto-generated constructor stub
		super(commonName,glowcolour,base_width) ;
		this.Potency=Potency ;
	}
	//Accessor :
	public String getPotency()
	{
		return Potency;
	}
	//Mutator :
	public void setPotency(String Potency)
	{
		if(Potency!=null && !Potency.isEmpty())
		{
			this.Potency=Potency ;
			
		}else
		{
			System.out.println("Potency Cannot be empty");
		}
	}

}
