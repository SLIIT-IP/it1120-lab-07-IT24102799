import java.util.Scanner;

public class IT24102799Lab7Q3 {
   public static void main(String[]args){
    
   Scanner input = new Scanner (System.in);
   
   int cno = 1;

   while (cno  <= 5){
   
   System.out.println("Customer "+cno);

   System.out.print("Enter total bill amount:");
   double amount = input.nextInt();
  
   System.out.print("Enter mode of payment(C for cash, o for other):"); 
   char pmode=input.next().charAt(0);   

   if(pmode=='c' || pmode=='C'){
     double dis=amount*0.05;
     System.out.println("Discount is :"+dis);
     double nettot= amount - dis;
     System.out.println("Amount to be paid:"+nettot);
     
   }else if(pmode=='o' || pmode=='O'){
     System.out.println("No Discount applicable");
     System.out.println("Amount to be paid:"+amount);
   }else{
     System.out.println("Payment Mode is not valid");
   
   }
   cno+=1;
   System.out.println();

   }
   input.close();
   }
}