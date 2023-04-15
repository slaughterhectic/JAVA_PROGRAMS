public class first {
    public static void main(String args[]){
        int a[]=new int[2];
        try{
            a[3]=4;
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index error");
        }
    }
}
