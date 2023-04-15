import java.util.Scanner;

public class Number {
    private int[] numbers;
    private int n;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        numbers = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
    }

    public void swap() {
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
        }

        int temp = numbers[maxIndex];
        numbers[maxIndex] = numbers[minIndex];
        numbers[minIndex] = temp;
    }

    public void display() {
        System.out.println("The swapped array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.read();
        obj.swap();
        obj.display();
    }
}
