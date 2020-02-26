import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LSArrayApp{

	// Creating a private instance array  variable to store the data from a file to the data array
	private static String[] data;
	
	public static void main(String[] args){
		data = new String[2976];
		Scanner inputStream = null;
		
		try{
			inputStream = new Scanner(new FileInputStream("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"));
		}
		catch(FileNotFoundException e){
			System.out.println("file Not found...");
			System.out.println("or file could not be open");
		}
		
		// Writing the from a file to a singly traditional array
		int i = 0;
		while(inputStream.hasNext()){
			data[i] = inputStream.nextLine();
			i++;
		}
		
		// Reading what the singly array file has stored so far
		/*for(int k = 0; k < data.length; k++){
			String line = data[k];
			int index = line.indexOf(" ");
			String key = line.substring(0,index);
			System.out.println("This is index: " + k);
			System.out.println(key + " : " + line);
		}*/
		if( args.length == 3){
			printAreas(args[0], args[1], args[2]);
		}else if(args.length == 0){
			printAllAreas();
		}
	}
	public static void printAreas(String stage, String day, String startTime){
		String question = stage + "_" + day + "_" + startTime;
		System.out.println("Stage\tDay\tStartTime\tAreasAffected");
		for(int x = 0; x < data.length; x++){
			String line = data[x];
			int index = line.indexOf(" ");
			String key = line.substring(0, index);
			if(question.equals(key)){
				//System.out.println("This is index: " + x);
				String areas = line.substring(index+1);
				System.out.println(stage + "\t" + day + "\t" + startTime + "\t\t" + areas);
				//System.out.println(data[x]);
			}
		}
	}
	
	public static void printAllAreas(){
		System.out.println("Stage\tDay\tStartTime\tAreasAffected");
		for(int y = 0; y < data.length; y++){
			String details = data[y];
			System.out.println(details);
			/*String line = data[y];
			int index = line.indexOf(" ");
			String[] values = line.split("_");
			String stage = values[0];
			String day = values[1];
			String startTime = values[2];
			String areas = line.substring(index+1);
			System.out.println(stage + "\t" + day + "\t" + startTime + "\t\t" + areas);*/
		}
	}
}
