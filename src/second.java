

public class second {
    public static void main(String args[]){
        try{
            System.out.println("Inside try block");
            int data = 25/0;
            System.out.println(data);
        }
        catch (ArithmeticException e){
            System.out.println("Exceptional handled");
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always exception");
        }
        System.out.println("rest of the code...");

    }
}
