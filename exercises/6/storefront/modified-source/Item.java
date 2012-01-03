/* Item.java file. This file is part of the package org.cadenhead.ecommerce
This is commented using a multi-line comment */

/** This is multi-line documentation comments which are specially used
for managing documentation in code and can be extracted using javadocs.
*/
//Single line comment. Version 0.10a

//Here we specify that this program is part of the package mentioned below
//So the class of this file has to be placed in that directory structure
package org.cadenhead.ecommerce;

/*Here we import java.util.*, which are all classes thats within the java.util.* package but not below or above its scope.*/
import java.util.*;


//Here we create a public class called Item and implements the interface Comparable
public class Item implements Comparable {

//Here we assign some variables and make them private, which makes the variable
//Only accessible from the class (instance variable)
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private int noDiscount;

/*This is a constructor. It is different from a method, it is used for instatiation
assign values to the instance of the class itself. It will always have the
Same name as the class itself. You can have more than one constructor,
in this case you'd create another one by naming it Item again */   
    Item(String idIn, String nameIn, String retailIn, String quanIn, String noDiscountIn) {
        id = idIn;
        name = nameIn;
        noDiscount = Integer.parseInt(noDiscountIn);
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(quanIn);
        if (noDiscount != 0) {
        if (quantity > 400) 
            price = retail * .5D;
        else if (quantity > 200)
            price = retail * .6D;
        else
            price = retail * .7D;
        price = Math.floor(price * 100 + .5) / 100;
        }
        else 
            price = retail;
    }

/*These are just methods, which by standard uses mixed cases (begin with lowerAndUpperCase) (This is the available from the Interface Comparable) Comparable has only
one methods and that is the "compareTo" method. We are in this case implementing
the interface Comparable method and then "override" the compareTo() method for Item class sorting on the basis of the price variable. Items are sorted by price from highest to lowest */
    public int compareTo(Object obj) {
        Item temp = (Item)obj;
        if (this.price < temp.price)
            return 1;
        else if (this.price > temp.price)
            return -1;
        return 0;
    }

//The rest of these methods are known as "accessor" methods since they are
//used to access the private instance variables/methods. Notice that these
//are made public. In doing this, you can hide the important data but
//also allow for access to them by means of restrictions set by the "accessor methods"
//Also notice that the method name begins with "get" this is a common naming
//conventioning when the methods are "getting" something. There's also a "set" 
//for setter methods, used for setting values. getters and setters method
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getnoDiscount() {
        return noDiscount;
    }
}

    











