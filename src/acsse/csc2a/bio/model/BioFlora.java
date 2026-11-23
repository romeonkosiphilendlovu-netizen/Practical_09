package acsse.csc2a.bio.model;
//Base Class :
public class BioFlora {
//Since this class will be used by derived class ;Attributes sould be protected
	protected String commonName;
	protected EGlowColour glowcolour;
	protected double base_width ;
	//Constructor :
	public BioFlora(String commonName,EGlowColour glowcolour,double base_width)
	{
		this.commonName=commonName;
		this.glowcolour=glowcolour;
		this.base_width=base_width;
	}
	//Accessors :
	public String getCcommonName()
	{
		return commonName ;
	}
	public EGlowColour getglowcolour()
	{
		return glowcolour;
	}
	public double setbase_width()
	{
		return base_width ;
	}
	
}
