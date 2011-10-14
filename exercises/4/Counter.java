
class Counter {

public static void main(String[] args) {
String[] mystring = new String[10];
int counter;

for (counter = 0; counter < mystring.length; counter++) {
    mystring[counter] = "Cool";
    System.out.println("The index " + counter + " Has the value " + mystring[counter]);
}
}
}
