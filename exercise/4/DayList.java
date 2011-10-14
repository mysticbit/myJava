/* Chapter 4: Exercise 1 
 * Using the countDays() method from the DayCounter application, 
 * create an application that displays every date in a given 
 * year in a single list from January 1 to December 31.
 */

class DayList {
    public static void main(String[] args){
    int yearIn = 2008;
    int monthsIn = 1;
    int monthsIn2 = 1;
    int counter = 0;
    int counter2 = 1;
    int counter3 = 1;
    int counter4 = 1;
    int counter5 = 1;
    int counter6 = 1;
    int counter7 = 1;
    int counter8 = 1;
    int counter9 = 1;
    int counter10 = 1;
    int counter11 = 1;
    int counter12 = 1;
    int counter13 = 1;
    int[] keeper = new int[12];
    if (args.length > 0)
        yearIn = Integer.parseInt(args[0]);
    while (monthsIn != 13) {
        keeper[counter] = countDays(monthsIn, yearIn);
        monthsIn++;
        counter++;
        }
    while (counter2 < keeper[0]){
        System.out.println(1 + "-" + counter2 + "-" + yearIn);
        counter2++;
}
    while (counter3 < keeper[1]){
        System.out.println(2 + "-" + counter3 + "-" + yearIn);
        counter3++;
}

    while (counter4 < keeper[2]){
        System.out.println(3 + "-" + counter4 + "-" + yearIn);
        counter4++;
}

    while (counter5 < keeper[3]){
        System.out.println(4 + "-" + counter5 + "-" + yearIn);
        counter5++;
}

    while (counter6 < keeper[4]){
        System.out.println(5 + "-" + counter6 + "-" + yearIn);
        counter6++;
}

    while (counter7 < keeper[5]){
        System.out.println(6 + "-" + counter7 + "-" + yearIn);
        counter7++;
}

    while (counter8 < keeper[6]){
        System.out.println(7 + "-" + counter8 + "-" + yearIn);
        counter8++;
}

    while (counter9 < keeper[7]){
        System.out.println(8 + "-" + counter9 + "-" + yearIn);
        counter9++;
}

    while (counter10 < keeper[8]){
        System.out.println(9 + "-" + counter10 + "-" + yearIn);
        counter10++;
}

    while (counter11 < keeper[9]){
        System.out.println(10 + "-" + counter11 + "-" + yearIn);
        counter11++;
}

    while (counter12 < keeper[10]){
        System.out.println(11 + "-" + counter12 + "-" + yearIn);
        counter12++;
}

    while (counter13 < keeper[11]){
        System.out.println(12 + "-" + counter13 + "-" + yearIn);
        counter13++;
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

