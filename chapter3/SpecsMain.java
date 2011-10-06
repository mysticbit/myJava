/* The main program for Create a class with instance 
 * variables for height, weight, and depth, making each
 * an integer. Create a Java application that uses your i
 * new class, sets each of these
 * values in an object, and displays the values.
 */

//import Specs.*;

class SpecsMain {
    public static void main(String args[]) {
        Specs assignClass = new Specs();
        System.out.println("The old height is: " +  assignClass.height);
        System.out.println("The old weight is: " +  assignClass.weight);
        System.out.println("The old depth is: " +  assignClass.depth);
        assignClass.height = 46;
        assignClass.weight = 150;
        assignClass.depth = 10;
        
        System.out.println("The new height is: " +  assignClass.height);
        System.out.println("The new weight is: " + assignClass.weight);
        System.out.println("The new depth is : " + assignClass.depth);
}
}

