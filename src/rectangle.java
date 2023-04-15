import java.util.*;

public class rectangle {
    int length;
    int breadth;
    rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    void area(){
        System.out.println("The area of the rectangle "+length*breadth);
    }
    void perimeter(){
        int per=length+breadth;
        System.out.println("The perimeter of the rectangle "+per);
    }
}
class compute{
    public static void main(String args[]){
        int a,b;
        System.out.println("The length and breadth of the rectangle :-");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        rectangle r1=new rectangle(a,b);
        r1.area();
        r1.perimeter();


    }
}
