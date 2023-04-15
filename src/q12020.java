class plate{
    int length;
    int breadth;
    plate(int l,int b){
        length=l;
        breadth=b;
        System.out.println(length+" "+breadth);
    }

}
class bo1 extends plate{
    int height;
    bo1(int l,int b,int h){
        super(l,b);
        height=h;
        System.out.println(length+" "+breadth+" "+height);

    }


}
class wb extends bo1{
    int thick;
    wb(int l,int b,int h,int t){
        super(l,b,h);
        thick=t;
        System.out.println(length+" "+breadth+" "+height+" "+thick);
    }

}
public class q12020 {

    wb w=new wb(5,6,7,8);





}

