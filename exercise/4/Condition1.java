/* Chapter 4 : Conditionals - if statement */

/*
class Condition1 {
    public static void main(String[] args) {
        String[] myarray = new String[10];
        
        if (myarray.length < 11)
            System.out.println("It is less than 11");
        else
            System.out.println("It is greater than 11");
    }
}
*/

class MySwitch {
    public static void main(String[] args) {
        char grades;
        grades = 'A';
        
        switch (grades) {
            case 'A':
                System.out.println("Excellent, you got a: " + grades);
                break;
            case 'B':
                System.out.println("Good, you got a: " + grades);
                break;
            case 'C':
                System.out.println("You can do better! You got a: " + grades);
                break;
            default:
                System.out.println("Your grade is out there (not in a good way) : " + grades);
                break;
        }
    }
}