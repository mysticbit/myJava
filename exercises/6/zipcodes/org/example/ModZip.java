* This will be the class used for modifying zip code entries. It will be a package
and you can only access this through interface/accessor methods.*/

package org.example;

import java.util.*;

public class ModZip {
    private String zipCodes = "000000000";

    public void getZip() {
        System.out.println("The current zip code is: " + zipCodes);
    }

    public void setZip(String zipCodesIn) {
        if (zipCodesIn.length() == 5 || zipCodesIn.length() == 9) {
              zipCodes = zipCodesIn;
              StringBuffer myChange = new StringBuffer();
              myChange.append(zipCodes);
              zipCodes = myChange.insert(5,"-").toString();
        }
        else { 
            System.out.println("Sorry, you have to enter a 5 or 9 digit zip code!");
        }    
    }
}

