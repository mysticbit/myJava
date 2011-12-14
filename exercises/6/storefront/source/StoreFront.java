/*THis is the StoreFront class, which should be camelcase by convention */

//Let's make this class part of the following package
package org.cadenhead.ecommerce;

//We'll import the java.util.* packages
import java.util.*;


//Let's create the StoreFront class making it public (available to all)
public class StoreFront {
    //This is making a "LinkedList" (a data structure) and naming it catalog
    private LinkedList catalog = new LinkedList(); 

    //Here we create a public method that has no return value
    public void addItem(String id, String name, String price, String quant) {

        //Here we instantiate the class Item and giving it a name of "it"
        //We then use the value assigned to "it" and use the "add" method
        //available on LinkedList to add items to catalog. (catalog.add())    
        Item it = new Item(id, name, price, quant);
        catalog.add(it);
    }

    //The getItem and getSize method provides an interface to the information
    //stored in the private catalog variable. 
    public Item getItem(int i) {
        return (Item)catalog.get(i);
    }

    //This calls the catalog.size() method, which returns the number of objects 
    //contained in catalog
    public int getSize() {
        return catalog.size();
    }

    //This is where you ebenft from the Comparable interface
    public void sort() {
        Collections.sort(catalog);
    }
}

