package acsse.csc2a.bio.file;
//import java.util.regex.Pattern;
import acsse.csc2a.bio.model.*;
import java.io.*;
import java.util.regex.*;
//Import all Classes {.*} :

public class FloraFileReader {
	//Base Regular expressions for common attributes in files :
	// Note that : \] to escape the box .
	private static final String Base ="(\\[[^\\t]+\\])\\t" +"(NEON_GREEN|SOLAR_AMBER|DEEP_VIOLET|CYAN|MAGENTA)\\t" +"(\\d+)\\t";
	//UNIQUE PATTERN FOR EACH BIOFLORA :
	
	private static final Pattern TREE_PATTERN=Pattern.compile(Base + "(\\d+)\\t(.+)");
	private static final Pattern FLOWER_PATTERN = Pattern.compile(Base+ "(\\d+\\.\\d+)\\t(.+)");
	private static final Pattern MUSHROOM_PATTERN =Pattern.compile(Base + "(PHOSPHORUS|NITROGEN|CALCIUM)\\t(.+)");
	private static final Pattern VINE_PATTERN = Pattern.compile(Base + "([A-Za-z]+)\\t(.+)");
	
public static GrowthChamber readChamberFile(File file)
{
	GrowthChamber chamber = new GrowthChamber() ;
	try {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line ;
		
		while((line=reader.readLine())!=null)
		{
			
			Matcher m ;
			//TREE
			m=TREE_PATTERN.matcher(line) ;
			if(m.matches()) {
				String name = m.group(1);
				EGlowColour glowcolour =EGlowColour.valueOf(m.group(2));
				int base_width = Integer.parseInt(m.group(3));
				int OxygenCycle = Integer.parseInt(m.group(4));
				
				Tress tree = new Tress(OxygenCycle,name,glowcolour,base_width);
				chamber.addSpecimen(tree);
				continue ;
			}
			//FLOWER :
			m=FLOWER_PATTERN.matcher(line);
			if(m.matches())
			{
				String name = m.group(1);
				EGlowColour glowcolour= EGlowColour.valueOf(m.group(2));
				int base_width = Integer.parseInt(m.group(3));
				double polltoxic = Double.parseDouble(m.group(4));
				
				Flowers flower = new Flowers(polltoxic,name,glowcolour,base_width);
				chamber.addSpecimen(flower);
				continue ;
			}
			//VINES :
			m=VINE_PATTERN.matcher(line);
			if(m.matches())
			{
				String name = m.group(1);
				EGlowColour glowcolour = EGlowColour.valueOf(m.group(2));
				int base_width = Integer.parseInt(m.group(3));
				String potency = m.group(4);
				
				Vines vine = new  Vines(potency,name,glowcolour,base_width);
				
				chamber.addSpecimen(vine);
				continue ;	
			}
			//MUSHROOMS :
			m=MUSHROOM_PATTERN.matcher(line);
			if(m.matches())
			{
				String name = m.group(1);
				EGlowColour glowcolour = EGlowColour.valueOf(m.group(2));
				int base_width = Integer.parseInt(m.group(3));
				MushRoom_Nut MineralNut = MushRoom_Nut.valueOf(m.group(4));
				
				MushRooms MushRoom = new MushRooms(MineralNut,name,glowcolour,base_width);
				 chamber.addSpecimen(MushRoom);
				 continue ;
			}
		}
		reader.close();
		
	}catch (Exception ex)
	{
		System.out.println("Cannot read file :" + ex.getMessage());
		
	}
	return chamber ;
}




}