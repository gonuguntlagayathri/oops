import D.*;
class Test extends demo {
    public static void main(String args[])
    {
        int x=10;
        try
        {
            System.out.println(x/0);
        }
        catch(Exception e)
        {
            System.out.println("Arithmetic exception");
        }
    }
}
