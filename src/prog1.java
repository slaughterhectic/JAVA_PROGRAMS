public class prog1{
    String studentName;
    int srollno;
    String ssection;
    String sbranch;

    prog1(String name , int rollno , String section, String branch){


        studentName = name;
        srollno = rollno;
        ssection=section;
        sbranch=branch;
    }
    void display(){
        System.out.println(studentName);
        System.out.println(srollno);
        System.out.println(ssection);
        System.out.println(sbranch);
    }
    public static void main(String args[])
    {


        prog1 obj = new prog1("Gourav" , 21052759,"Cse-01","cse");
        obj.display();
    }
}
