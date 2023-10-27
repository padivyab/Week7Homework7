package homework7;

/*2.1 Declare two static variables.
2.2 Declare one static method.
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and run the programme.*/

public class Question2 {

    static int a = 10;
    static String b = "Divya";

    public static void main(String[] args) {

        System.out.println(a); // called static variable direct static method
        System.out.println(b);

    }
    static void m2()
    {
        System.out.println(a);
        System.out.println(b);

    }
}
