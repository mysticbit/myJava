/* Chapter 4 exercise 2:
 * Create a class that takes words for the first 10 
 * numbers (“one” up to “ten”) and converts them into 
 * a single long integer. Use a switch statement for 
 * the conversion and command-line arguments for the 
 * words.
 */


class Convert {
    public static void main(String[] args) {
        int i = 0;
        int myvalue = 0;
        long newvalue = 0L;
        int[] myintlist = {1 ,2 ,3, 4, 5, 6, 7, 8, 9, 10};
        String[] mystrlist = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        for (i = 0; i < mystrlist.length; i++){
            if (mystrlist[i].equals(args[0])) {
                myvalue = myintlist[i];
}
}
        switch (myvalue) {
             case 1:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 2:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 3:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 4:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 5:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 6:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 7:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 8:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 9:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             case 10:
                 newvalue = (long)myvalue;
                 System.out.println(newvalue);
                 break;
             default:
                 System.out.println("Nothing matches!");
                 break;
        }
}
}


