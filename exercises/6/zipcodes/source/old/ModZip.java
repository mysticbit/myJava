/* This will be the class used for modifying zip code entries. It will be a package
and you can only access this through interface/accessor methods.*/

package org.example;

import java.util.*;

public class ModZip {
    private int zipCodes;
    private LinkedList mylist = new LinkedList();    

    ModZip(String zipCodesIn) {
//        zipCodes = Integer.parseInt(zipCodesIn);
        for (char myArray: zipCodesIn.toCharArray()) {
            System.out.println(myArray);
        }
    }

}
