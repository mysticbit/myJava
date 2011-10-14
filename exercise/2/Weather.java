public class Weather {
  public static void main(String[] arguments) {
    float fah = 86;
    System.out.println(fah + " degrees Fahrenheit is ...");
    //To convert Fahrenheit into Celsius
    //Begin by subtracting 32
    fah = fah - 32;
    //Divid the answer by 9
    fah = fah / 9;
    //Multiply that answer by 5
    fah = fah * 5;
    System.out.println(fah + " degree Celsius\n");
    
    float cel = 33;
    System.out.println(cel + " degree Celsius is ...");
    //To convert Fahrenheit into Celsius
    //Begin by subtracting 32
    cel = cel * 9;
    //Divid the answer by 9
    cel = cel / 5;
    //Multiply that answer by 5
    cel = cel + 32;
    System.out.println(cel + " degrees Fahrenheit");
  }
}

