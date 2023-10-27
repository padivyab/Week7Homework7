package homework7;

public class Question20 {

    static String s1 = "spain";
    String s2 = "United Kingdom";

    public static void main(String[] args) {

        Question20 q20 =new Question20();
        q20.homeCountry();
        q20.holidays();

    }
    public void homeCountry()
    {
        System.out.println(s1);

    }
    static void holidays()
    {
        Question20 q20 =new Question20();
        System.out.println(q20.s2);

    }
}
