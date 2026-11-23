package acsse.csc2a.bio.model;
//Inherits from BioFlora :
public class MushRooms  extends BioFlora{
	//Attributes :
	private MushRoom_Nut MineralNut;
	//Constructor :
	public MushRooms(MushRoom_Nut MineralNut,String commonName,EGlowColour glowcolour,double base_width)
	{
		super(commonName,glowcolour,base_width);
		this.MineralNut=MineralNut;
	}
	//Accessor :
	public MushRoom_Nut getMineralNut()
	{
		return MineralNut;
	}
	//Mutator :
	public void setMineralNut(MushRoom_Nut MineralNut)
	{
		this.MineralNut=MineralNut ;
	}

}
