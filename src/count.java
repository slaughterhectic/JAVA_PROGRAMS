public class count {
    int x=0;
    static int y=0;
    count(){
        x++;
        y++;
        System.out.println(x+y);

    }
    public static void main(String a[]){
        count c1= new count();
        count c2= new count();
        count c3= new count();
    }

}
