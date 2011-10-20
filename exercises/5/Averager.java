/*chp 5 - Averager */

class Averager {
    public static void main(String[] args) {
        int sum = 0;
        
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
                }
                System.out.println("Sum is: " + sum);
                System.out.println("Aerage is: " + (float)sum / args.length);
         }
        else {
            System.out.println("You did not enter a value!");
            }
            
     }
        
}

