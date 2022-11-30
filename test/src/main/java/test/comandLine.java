package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class comandLine {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		boolean wiki_valid = false;
		int n_int = 1;
		String wiki_url = "";
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
        new InputStreamReader(System.in));
        while (wiki_valid == false) {
            // Reading Wiki URL
            System.out.print("Please, enter Wiki URL and press Enter. Fromat: https://wikipedia.org/*: ");
            wiki_url = reader.readLine();
            String regex = "(\\b(https?|ftp|file)://).?.?.?[wikipedia.org].*";
            if (wiki_url.matches(regex)) { 
            	wiki_valid = true;
            }
            
            else{ 
            	System.out.println("Wiki URL should be valid.");
            	wiki_valid = false;
            }
        	
        }
        
     // Confirm Wiki URL
        System.out.println("Entered Wiki URL is: " + wiki_url);
     
        // Reading number n
        boolean n_valid = false;
        while (n_valid == false) {
        System.out.print("Please, enter number from 1 to 20 and press Enter: ");
        String n = reader.readLine();
        // Converting string to number n
        try {
        n_int = Integer.parseInt(n);
        // Validations
        if (1 <= n_int && n_int <= 20)
        {
        n_valid = true;}
        else{ 
        	System.out.println("Number must be between 1 to 20.");
        	n_valid = false;
        }
            }
        catch(Exception e) {
        	System.out.println("Number must be integer value from 1 to 20.");
        	  }       
        } 
		// Confirm number n
        System.out.println("Entered number is: " + n_int);     

        //Start browser and test
      test.main(wiki_url, n_int);

	}

}
