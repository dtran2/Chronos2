package ycpCS320;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Event {
	public static void main(String[] args){
			createEvent();
	}
	
	/**
	 *Handles the process of reading inputs to
	 *Create folders for the date and time of the event if it doesn't already exist.
	 *Saves the event in a .xml file in the correct directory.
	 *
	 */
	public static void createEvent(){
		int month, day, year, startTime, endTime;
		Scanner keyboard = new Scanner(System.in);
		
		month = keyboard.nextInt(); //Assigns the first input into "month"
		day = keyboard.nextInt();	//Assigns the second input into "day"
		year = keyboard.nextInt();	//Assigns the third input into "year"
		
		//time will be recorded without the ":"
		//(0445 would mean 04:45)
		startTime = keyboard.nextInt();		 //Assigns the time the event starts at in "startTime" 
		endTime = keyboard.nextInt(); 		//Assigns the time the event ends at in "endTime"
		String details = keyboard.next();	//Stores the details of the event in "details"
		
		//Write the event information in "Events.xml"
		try{
			
			/*
			//Checks if directories leading to event exists
			String directory = "/H:/git/Chronos/" + month + "-" + day + "-" + year +"/"
					+ startTime + "-" + endTime + "/";
			
			
			//Creates the directory if it doesn't exist
			File createDir = new File(directory);
			if (!createDir.exists()){
				createDir.mkdirs();
			}
			*/
			String directory = "H:/git/Chronos/";
			File event = new File(directory + "event.xml");
			//Create a file called "event" in the directory if it doesn't already exist.
			if(!event.exists()){
				event.createNewFile();
			}
			
			//Store event information in a .XML file
			FileWriter fileWriter = new FileWriter(event.getAbsoluteFile());
			BufferedWriter write = new BufferedWriter(fileWriter);
			write.write("<event>");
			write.write("	<month>" + month + "</month>\n");
			write.write("	<day>" + day + "</day>\n");
			write.write("	<year>" + year + "</year>\n");
			write.write("	<startTime>" + startTime + "</startTime>\n");
			write.write("	<endTime>" + endTime + "</endTime>\n");
			write.write("	<details>" + details + "</details>\n");
			write.write("</event>");
			write.close();
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		keyboard.close();
	}
	
	/**
	 * Fetches the value under "month" tag in .xml file
	 * @return month
	 */
	public String getMonth(){
		String month = "no data";
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File("event.xml"));
			
			NodeList getMonth = doc.getElementsByTagName("month");
			month = getMonth.toString();
			
		}catch(SAXParseException e){
			System.out.println(e.getMessage());
		}catch(SAXException e){
			System.out.println(e.getMessage());
		}catch(Throwable t){
			t.printStackTrace();
		}
		
		
		return month;
		
	}
	/**
	 * Fetches the value under "day" tag in .xml file
	 * @return day
	 */
	public String getDay(){
		String day = "no data";
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File("event.xml"));
			
			NodeList getDay = doc.getElementsByTagName("month");
			day = getDay.toString();
			
		}catch(SAXParseException e){
			System.out.println(e.getMessage());
			
		}catch(SAXException e){
			System.out.println(e.getMessage());
		}catch(Throwable t){
			t.printStackTrace();
		}
		
		
		return day;
		
	}
	/**
	 * Fetches the value under "year" tag 
	 * @return year
	 */
	public String getYear(){
		String year = "no data";
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File("event.xml"));
			
			NodeList getYear = doc.getElementsByTagName("year");
			year = getYear.toString();
			
		}catch(SAXParseException e){
			System.out.println(e.getMessage());
			
		}catch(SAXException e){
			System.out.println(e.getMessage());
		}catch(Throwable t){
			t.printStackTrace();
		}
		
		
		return year;
	}
	/**
	 * Fetches the value under "startTime" tag in .xml file
	 * @return startTime
	 */
	public String getStartTime(){
		String startTime = "no data";
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File("event.xml"));
			
			NodeList getStartTime = doc.getElementsByTagName("startTime");
			startTime = getStartTime.toString();
			
		}catch(SAXParseException e){
			System.out.println(e.getMessage());
			
		}catch(SAXException e){
			System.out.println(e.getMessage());
		}catch(Throwable t){
			t.printStackTrace();
		}
		
		
		return startTime;
	}
	/**
	 * Fetches the value under "endTime" tag in .xml file
	 * @return endTime
	 */
	public String getEndTime(){
		String endTime = "no data";
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File("event.xml"));
			
			NodeList getEndTime = doc.getElementsByTagName("endTime");
			endTime = getEndTime.toString();
			
		}catch(SAXParseException e){
			System.out.println(e.getMessage());
			
		}catch(SAXException e){
			System.out.println(e.getMessage());
		}catch(Throwable t){
			t.printStackTrace();
		}
		
		return endTime;
	}
	/**
	 * Fetches the value under "details" tag in /xml
	 * @return details
	 */
	public String getDetails(){
		String details = "no data";
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new File("event.xml"));
			
			NodeList getDetails = doc.getElementsByTagName("details");
			details = getDetails.toString();
			
		}catch(SAXParseException e){
			System.out.println(e.getMessage());
			
		}catch(SAXException e){
			System.out.println(e.getMessage());
		}catch(Throwable t){
			t.printStackTrace();
		}
		
		return details;
	}
}
