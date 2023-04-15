public class substract {
    int sub;

    int sub(int a, int b) {
        System.out.println(a - b);
        return 1;

    }

    int sub(int a, int b, int c) {
        System.out.println((a - b) - c);
        return 1;

    }

    double sub(double a, double b) {
        System.out.println(a - b);
        return 1;

    }

    double sub(double a, double b, double c) {
        System.out.println((a - b) - c);
        return 1;

    }

}
class test{
    public static void main(String args[]){
        substract s1=new substract();
        s1.sub(4,5);
        s1.sub(4,5,6);
        s1.sub(4.5,5.6,6.7);
        s1.sub(3.4,5.6);




    }
}

