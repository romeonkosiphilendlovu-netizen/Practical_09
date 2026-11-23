//Imports :
import java.io.*;
import acsse.csc2a.bio.file.*;
import acsse.csc2a.bio.tester.*;
import acsse.csc2a.bio.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("data/chamber_logs.txt");
		GrowthChamber chamber = FloraFileReader.readChamberFile(file);
		
		System.out.println(chamber.toString());
		
		GenomicTester.test(chamber);

	}

}
