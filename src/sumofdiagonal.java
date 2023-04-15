
import java.io.*;


public class sumofdiagonal {


    static void Sum_of_Diagonals1(int[][] matrix, int N)
    {

        int Pd = 0, Sd = 0;

        for (int k = 0; k < N; k++) {


            for (int l = 0; l < N; l++) {

                if (k == l)
                    Pd += matrix[k][l];

                if ((k + l) == (N - 1))
                    Sd += matrix[k][l];
            }
        }


        System.out.println("Sum of left Diagonal:"
                + Pd);

        System.out.println("Sum of right Diagonal:"
                + Sd);
    }


    static public void main(String[] args)
    {

        int[][] b = { { 8, 2, 13},
                { 9, 16, 17},
                { 1, 22, 3 }};

        Sum_of_Diagonals1(b, 3);

    }
}
