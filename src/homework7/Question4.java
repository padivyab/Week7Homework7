package homework7;

public class Question4 {

    int a =10;
    String b = "div";

    int c =20;
    static String d = "shiv";

    public static void main(String[] args) {
        Question4 q4 =new Question4();
        q4.m1();
        q4.m2();

    }
    public void m1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
    static void m2()
    {
        Question4 q4 =new Question4();
        System.out.println(q4.a);
        System.out.println(q4.b);
        System.out.println(q4.c);
        System.out.println(d);

    }


}
