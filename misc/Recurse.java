public class Recurse
{
 public static void main(String[] args)
 {
   int x = 5;
   int factx = factorial(x);
   
   System.out.println("x is " +x);
   System.out.println("x factorial is " + factx);
  
}
 
 public static int factorial(int n)
 {
    if(n==1)
      return 1;
    else
      return n*factorial(n-1);
 }
 
 //5!= 5*4*3*2*1=12
 
 /*
 public static int triple1(int n)
 {
   return n*3;
 }
 public static int triple2(int n)
 {
   int result =0;
   for (int i=0;i<n; ++i)
   {
     result = result +3;
   }
   return result;
 }

 public static int triple3(int n)
 {
   if(n==0)
     return 0;
   else
     return 3 + triple3(n-1);
 }
 */
}