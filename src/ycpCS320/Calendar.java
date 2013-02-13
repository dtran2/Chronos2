package ycpCS320;
import java.io.*;
import java.util.Scanner;
/**
 * Handles actions relating to the calendar
 * Methods include: createEvent:
 * 
 * @author dtran2
 *
 */
public class Calendar {
	
	public Calendar(){
		
	}
	/**
	 *Handles the process of reading inputs to
	 *create an event.
	 *Saves the event in a txt file.
	 *
	 */
	public void createEvent(){
		int month, day, year, startTime, endTime;
		Scanner keyboard = new Scanner(System.in);
		
		month = keyboard.nextInt(); //Assigns the first input into "month"
		day = keyboard.nextInt();	//Assigns the second input into "day"
		year = keyboard.nextInt();	//Assigns the third input into "year"
		
		//time will be recorded without the ":"
		//(0445 would mean 04:45)
		startTime = keyboard.nextInt(); //Assigns the time the event starts at in "startTime" 
		endTime = keyboard.nextInt(); //Assigns the time the event ends at in "endTime"
		String details = keyboard.next(); //Stores the details of the event in "details"
		
		//Write the event information in "Events.txt"
		try{
			File file = new File("workspace/Chronos/Events.txt");
			//Create a file called "Event" if it doesn't already exist.
			if(!file.exists()){
				file.createNewFile();
			}
			//Writes the information of the event into a .txt
			FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
			BufferedWriter write = new BufferedWriter(fileWriter);
			
			write.write("Month:" + month + "\n");
			write.write("Day:" + day + "\n");
			write.write("Year:" + year + "\n");
			write.write("Start time:" + startTime + "\n");
			write.write("End time:" + endTime + "\n");
			write.write("details:\n" + details + "\n");
			write.close();
		}
		catch(IOException e){
			System.out.println("Error: IOException");
			
		}
		
		keyboard.close();
	}
}
