import java.util.Scanner;
class TryCatch1
 {
   public static void main(String args[]) {
     int num1, num2,num3;
     try { 
        // Try block to handle code that may cause exception
       Scanner sc=new Scanner(System.in);
       System.out.println("Dividend : \n");
       num1=sc.nextInt();
       System.out.println("Divisor : \n");
         num2=sc.nextInt();
         num3=(num1/num2);
        if (num2!=0)
        {
           
            System.out.println("RESULT : "+num3);
           // System.out.println("Try block message Executed ");
        }
        
     } catch (ArithmeticException e) { 
            // This block is to catch divide-by-zero error
            System.out.println("Error: Don't divide a number by zero");
       }
     System.out.println(" Process End");
   }
}