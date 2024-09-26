import java.util.Scanner;
public class IT24102799Lab7Q1B{
   public static void main(String [] args){

       Scanner input = new Scanner(System.in);

       int num1,num2,num3,num4;
       double avg;
       String Grade;
       int count;
       int Snum = 1;

       while (Snum<=3){

       System.out.print("Student"+Snum);
       System.out.println();
       System.out.print("Enter marks:");
       num1=input.nextInt();
       num2=input.nextInt();
       num3=input.nextInt();
       num4=input.nextInt();

       count=num1+num2+num3+num4;
       avg=count/4;

       System.out.println("Average is:"+avg);

       if (avg>=75 && avg<=100){
         Grade="Distinction";
       }else if (avg>=50 && avg<=74){
         Grade="Credit";
       }else{
         Grade="Fail";
       }
       
       System.out.println("Overall Grade is:"+Grade);
       System.out.println();
       
       Snum+=1;
       
       }  
       }
       }
