package homework7;

public class Question17 {

    String s = "Oshawa";
    static String c = "Canada";

    public static void main(String[] args) {

        Question17 q17=new Question17();
        q17.m1();
        q17.m2();

    }
    public void m1()
    {
        System.out.println(c);

    }
    static void m2()
    {
        Question17 q17 =new Question17();
        System.out.println(q17.s);

    }

}
