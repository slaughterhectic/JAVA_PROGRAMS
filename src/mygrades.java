import java.util.Scanner;
public class mygrades
{
    public static void main(String[] args)
    {
        float[] marks = new float[8];
        float sum=0, avg;
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Marks Obtained in 6 Subjects: ");
        for(i=0; i<6; i++)
            marks[i] = scan.nextFloat();

        for(i=0; i<6; i++)
            sum = sum + marks[i];
        avg = sum/6;

        System.out.print("\nGrade = ");

        if(avg>=94)
            System.out.println("O");
        else if(avg>=90)
            System.out.println("E");
        else if(avg>=80 && avg<90)
            System.out.println("A");
        else if(avg>=70 && avg<80)
            System.out.println("B");
        else if(avg>=60 && avg<70)
            System.out.println("C");
        else if(avg>=50 && avg<60)
            System.out.println("D");
        else if(avg>=40 && avg<50)
            System.out.println("E");
        else if(avg>=30 && avg<40)
            System.out.println("F");


    }
}