/* This class/program will demonstrate the concept of inner classes
Traditionally you would import a class from a package or inherit a class.
But you can also create whats called an inner class, which are classes
that are created just like method inside a class. Inner class
is good for scoping. It will create a separate class file after
compiling, so ensure to include those as well! */


 public class SquareTool {
    public SquareTool(String input) {
        try {
            float in = Float.parseFloat(input);
            Square sq = new Square(in);
            float result = sq.value;
            System.out.println("The square of " + input + " is " + result);
        } catch (NumberFormatException nfe) {
            System.out.println(input + " is not a valid number.");
        }
    }

    class Square {
        float value;
  
        Square(float x) {
            value = x * x;
        }
    }

    public static void main(String[] arguments) {
        if (arguments.length < 1) {
            System.out.println("Usage: java SquareTool number");
        } else {
            SquareTool dr = new SquareTool(arguments[0]);
        }
    }
}
