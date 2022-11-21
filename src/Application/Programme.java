package Application;

import java.util.Scanner;
import java.time.*;  
import java.util.*; 

public class Programme {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

	    
	    // Application
	    System.out.print("Quel est ton nom : ");
	    String nom = scanner.nextLine();
	    System.out.print("Quel est ton prénom : ");
	    String prenom = scanner.nextLine();
	    System.out.print("Date de naissance : ");
	    
	    //obtains an instance of LocalDate from a year, month and date 
	    String date = scanner.nextLine();
	    String dates[]= date.split("/");
	    short date1 = (short) Integer.parseInt(dates[0]);
	    short date2 = (short) Integer.parseInt(dates[1]);
	    short date3 = (short) Integer.parseInt(dates[2]);
	         
       LocalDate dateA = LocalDate.of(date3, date2, date1); 
	    //obtains the current date from the system clock  
	    LocalDate curDate = LocalDate.now();  
	    //calculates the difference betwween two dates  
	    Period period = Period.between(dateA , curDate); 
	    //prints the differnce in years, months, and days  
	    System.out.printf("Age : " + period.getYears() + " ans");	    
	    } 
	}

