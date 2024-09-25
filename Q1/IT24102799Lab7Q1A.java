import java.util.Scanner;

public class IT24102799Lab7Q1A {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter Subject Mark 1 :");
        int num1 =scanner.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        int num2 =scanner.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        int num3 =scanner.nextInt();

        System.out.print("Enter subject Mark 4: ");
        int num4=scanner.nextInt();

        int count= num1 + num2 + num3 + num4 ;
        double avg=count/4;

        System.out.println("Average is :"+ avg);

        String grade;

        if(avg>=75 && avg<=100 ){
            grade ="Distinction";
        }else if (avg>=50 && avg<=74 ){
            grade ="Credit";
        }else{
        grade ="Fail";
        }

        System.out.println("Overall Grade is : " + grade);
    } 
    
} 
