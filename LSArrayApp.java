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
		if( args.length == 3){
			printAreas(args[0], args[1], args[2]);
		}
		/*if(args != null){
			for(int x = 0; x < data.length; x++){
				String temp = data[x].substring(0,6);
				String test = args[0] + "_" + args[1] + "_" + args[2];
				if(test.equals(temp)){
					System.out.println("This is index: " + x);
					System.out.println(data[x]);
				}
			}
		}else{
			for(int y = 0; y < data.length; y++){
				String details = data[y];
				System.out.println(details);
			}
		}*/
	}
	public static void printAreas(String stage, String day, String startTime){
		String question = stage + "_" + day + "_" + startTime;
		for(int x = 0; x < data.length; x++){
			String temp = data[x].substring(0,6);
			if(question.equals(temp)){
				System.out.println("This is index: " + x);
				System.out.println(data[x]);
			}
		}
	}
}
