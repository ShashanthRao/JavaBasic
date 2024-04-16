package src;
/**
 * Hello
 */
public class Hello
{
    public static void dataType()
    {
        int i = 3;
        byte b = 127;
        short s = 555;
        long lon = 33333l;
        float f = 4.7f;
        double df = 4.6;
        char c = 'h';
        boolean bo = true;
        System.out.println("Hello World \n");
        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(lon);
        System.out.println(f);
        System.out.println(bo);
        System.out.println(c);
        bo= false;
        System.out.println(df);
    }
    public static void conversionCasting()
    {
        float f = 5.6f;
        int x = 344;
        byte b = 13;
        System.out.println(x);
        //casting
        //x = (int)f;
        System.out.println(x);
        //conversion
       // f = x;
        System.out.println(f);
        //x = f;
        System.out.println(x);
        System.out.println(b);
        b =(byte) x;
        System.out.println(b);
    }
    public static void logicalOps()
    {
        int a = 3;
        int b = 4;
        int c = 5;
        boolean f;
        f = a < b || b > c;
        System.out.println(f);
        f = a < b && b > c;
        System.out.println(f);
        f = a < b == b > c;
        System.out.println(f);
    }
    public static void conditionOps()
    {
        int i = 3;
        int j = 4;
        if(i < j)
        {
            System.out.println("J is greater");
        }
        else
        {
            System.out.println("I is greater");
        }
    }
    public static void main(String[] args) 
    {
        //dataType();
        //conversionCasting();
        //logicalOps();
        conditionOps();


    }
}