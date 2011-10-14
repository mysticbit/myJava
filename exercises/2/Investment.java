/*1. Create a program that calculates how much a $14,000 investment would be 
 * worth if it increased in value by 40% during the first year, lost $1,500 
 * in value the second year, and increased 12% in the third year. 

40% = .40 = decimal format

2. Write a program that displays two numbers and uses the / and % operators 
to dis- play the result and remainder after they are divided. Use the \t 
character escape code to separate the result and remainder in your output. */

/*Exercise 1:
public class Investment {
  public static void main(String[] args){
    double investment = 14000;
    double percentIncrease1 = 0.40, percentIncrease2 = 0.12;
    double dollarLost = 1500;
    double gainOne, lostOne, gainTwo;
    
    System.out.println("Your investment is: " +  investment);
    gainOne = investment * percentIncrease1;
    gainOne = gainOne + investment;
    System.out.println("You have increased your investment to: " +  gainOne);
    lostOne = gainOne - dollarLost;
    System.out.println("You have decreaed your investment to: " + lostOne);
    gainTwo = lostOne * percentIncrease2;
    gainTwo = gainTwo + lostOne;
    System.out.println("You have increased your investment to: " + gainTwo);
  }
}*/

//Exercise 2
public class TwoNumbers{
  public static void main(String[] args){
    int x, y;
    int result;
    x = 3; y = 10;
    
     System.out.println("The numbers are : " + x + "and" + y);
  }
}
    
    
    
   