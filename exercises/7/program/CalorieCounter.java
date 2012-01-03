/* Calorie Counter - this is to demonstrate assertion chp 7.2*/

public class CalorieCounter {
    float count;

    public CalorieCounter(float calories, float fat, float fiber) {
        if (fiber > 4) {
            fiber = 4;
        }
        count = (calories / 50) + (fat / 12) - (fiber / 5);
        assert count > 0 : "Adjusted calories < 0";
    }

    public static void main(String[] arguments) {
        if (arguments.length < 2) {
            System.out.println("Usage: java CalorieCounter calories fat fiber");
            System.exit(-1);
        try {
            int calories = Integer.parseInt(arguments[0]);
            int fat = Integer.parseInt(arguments[1]);
            int fiber = Integer.parseInt(arguments[2]);
            CalorieCounter diet = new CalorieCounter(calories, fat, fiber);
            System.out.println("Adjusted calories: " + diet.count);
        } catch (NumberFormatException nfe) {
            System.out.println("All arguments must be numeric.");
            System.exit(-1);
        }
    }
 }
} 
