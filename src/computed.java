
class figure{
    int a;
    figure(){

    }
    figure(int a1){
        a=a1;
        System.out.println(a);
    }
    void display(){
        System.out.println("inside super class");
    }

}
class b1 extends figure{
    b1(int j){
        super(5);
        System.out.println(j);


    }
    void display1(){

        System.out.println("inside sub class");
        super.display();
    }

}
public class computed {
    public static void main(String args[]) {
        figure f2=new figure(99);
        b1 f1 = new b1(91);

        f2.display();
        f1.display1();
    }
}
