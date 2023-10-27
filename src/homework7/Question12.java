package homework7;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in); // take input from user using scanner class
        System.out.println("Enter the first number : ");
        double a = sc.nextInt();
        System.out.println("Enter the second number : ");
        double b =sc.nextInt();
        System.out.println("Enter the third number : ");
        double c = sc.nextInt();
        double avg;
        avg=a+b+c/3;
        System.out.println("The average is : " +avg);
    }

}
