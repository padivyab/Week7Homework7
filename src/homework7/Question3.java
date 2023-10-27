package homework7;

import java.io.FilterOutputStream;

public class Question3 {

    int a = 10;
    static String b = "divya";

    public static void main(String[] args) {

    Question3 q3= new Question3();
    q3.m1();
    q3.m2();

    }
    public void m1()
    {
        System.out.println(a);
        System.out.println(b);

    }
    static void m2()
    {
        Question3 q3 =new Question3();
        System.out.println(q3.a); //instance to static create object and after call
        System.out.println(b); //static to static direct call

    }
}
