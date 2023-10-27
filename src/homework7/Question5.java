package homework7;

public class Question5 {

    public static void main(String[] args) {

        Question5 q5 = new Question5();
        q5.add(10,20);
        q5.sub(10,20);
        q5.mul(30,20);
        q5.div(50,10);

    }
    static int add(int a,int b)
    {
        int result = a+b;
        System.out.println("Addition:"+result);
        return result;

    }
    static void sub(int a,int b)
    {
        /*int result = a - b;
        System.out.println("Subtraction:"+result);
        return result;*/
        System.out.println("Subtraction:"+(a-b));

    }
    public void mul(int a,int b)
    {
        System.out.println("Multiplication:"+(a*b));
    }
    public void div(int a,int b)
    {
        System.out.println("Division:"+(a/b));

    }


}

