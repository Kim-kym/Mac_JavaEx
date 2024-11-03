package Nov_javaEx;

import java.util.Scanner;

public class javaEx_03 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("Your name >>");
		String name = scanner.nextLine();
		System.out.print("How old are you >>");
	  	int age = scanner.nextInt(); 
	  
	  	if (age < 18) {
	    	System.out.print("Age restriction: "
		    		+ "This Contents are not suit for you");
	  	}else 
	    		System.out.print("Enjoy your stay");
	    }
}
