/* Chapter 4: Exercise 1 
 * Using the countDays() method from the DayCounter application, 
 * create an application that displays every date in a given 
 * year in a single list from January 1 to December 31.
 */

class DayList {
    public static void main(String[] args) {
        int yearIn = 2008;
        int monthsIn = 1; 
        int counter = 0;
        int counter2 = 0;
        int daysIn = 1;
        if (args.length > 0)
            yearIn = Integer.parseInt(args[0]);
        while (monthsIn != 13) {
             int[] keeper = new int[12];
             keeper[counter] = countDays(monthsIn, yearIn);
        while (counter2 < keeper[counter])
             System.out.println(monthsIn + "-" + counter2 + "-" + yearIn);  
             monthsIn++;
             counter++;
             counter2++;
             daysIn++;
         

        }
} 

    static int countDays(int month, int year) {
       int count = -1;
       switch (month) {
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               count = 31;
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               count = 30;
               break;
           case 2:
               if (year % 4 == 0)
                   count = 29;
               else
                   count = 28;
               if ((year % 100 == 0) & (year % 400 !=0))
                   count = 28;
           }
           return count;
         } 
}
