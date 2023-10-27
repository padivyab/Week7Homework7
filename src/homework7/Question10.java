package homework7;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //declared scanner class
        System.out.println("Test Data : Input a Number :"); //print statement
        int num=sc.nextInt();
        System.out.println("Expected Output :");
        int i;////reading a number whose table is to be print
        for(i=1;i<=10;i++)  ////loop start execution form and execute until the condition i<=10 becomes false
        {
            System.out.println(num+"X"+i+"="+num*i); // printing statement with logic
        }

    }

}

