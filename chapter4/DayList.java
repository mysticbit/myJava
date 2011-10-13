/* Chapter 4: Exercise 1 
 * Using the countDays() method from the DayCounter application, 
 * create an application that displays every date in a given 
 * year in a single list from January 1 to December 31.
 */

class DayList {
    public static void main(String[] args) {
        int yearIn = 2008;
        int monthIn = 1;
        int daysIn = 1;
        if (args.length > 0)
            yearIn = Integer.parseInt(args[0]);
        while (monthIn != 13) {
//            System.out.println(months + "-" + days + "-" + yearIn);
              while (daysIn < (countDays(monthIn, yearIn) + 1));
              System.out.println(monthIn + "-" + daysIn + "-" + yearIn);
              monthIn++; 
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
