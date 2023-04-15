import java.util.Scanner;

class Detail {
    String name;
    String address;
    String serviceNumber;

    public Detail(String name, String address, String serviceNumber) {
        this.name = name;
        this.address = address;
        this.serviceNumber = serviceNumber;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Service/Meter Number: " + serviceNumber);
    }
}

class PowerBill extends Detail {
    int n;
    double totalBill;

    public PowerBill(String name, String address, String serviceNumber, int n) {
        super(name, address, serviceNumber);
        this.n = n;
        this.totalBill = 0.0;
    }

    public void cal() {
        if (n > 200) {
            totalBill = 2.5 * 50 + 5 * 50 + 6 * 100 + 7.5 * (n - 200);
        } else if (n > 100) {
            totalBill = 2.5 * 50 + 5 * 50 + 6 * (n - 100);
        } else if (n > 50) {
            totalBill = 2.5 * 50 + 6 * (n - 50);
        } else {
            totalBill = 2.5 * n;
        }
    }

    public void show() {
        super.show();
        System.out.println("Number of Units Used: " + n);
        System.out.println("Total Bill: Rs " + totalBill);
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Service/Meter Number: ");
        String serviceNumber = sc.nextLine();
        System.out.println("Enter Units Consumed:");
        int n = sc.nextInt();

        PowerBill bill = new PowerBill(name, address, serviceNumber, n);
        bill.cal();
        System.out.println("Customer Details and Bill:");
        bill.show();

        sc.close();
    }
}
