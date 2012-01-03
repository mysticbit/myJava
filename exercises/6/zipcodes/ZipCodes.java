/*  Create a ZipCode class that uses access control to ensure that its
zipCode instance variable always has a five- or nine-digit value. 

1. I'll create a class that will do the following:
	a. Be a package
	b. set a private instance variable of zipCode
	c. Create a mutator/accessor methods which will allow access to 
           the private instance variable
               i. getter
              ii. setter

2. Create another class that will:
	a. Give the user two options
	       i. call a getter
              ii. call a setter
*/

import org.example.*;
import java.util.*;

class ZipCodes {
    public static void main(String[] arguments) {
        ModZip collector = new ModZip();
        try {
            if (arguments[0].length() == 5 || arguments[0].length() == 9) {
            collector.setZip(arguments[0]);
            collector.getZip();
            }
            else {
                System.out.println("Sorry, you have to enter a 5 or 9 digit zip code!");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: java ZipCode <5 or 9 digit zip code>");
        }   
        }
        
}

