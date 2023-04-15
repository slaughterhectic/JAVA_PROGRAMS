import java.util.*;
abstract class BankB {
    protected double rateOfInterest;

    public abstract void setRateOfInterest();

    public void getRateOfInterest() {
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

class HDFC extends BankB {
    @Override
    public void setRateOfInterest() {
        rateOfInterest = 7.5;
    }
}

class ICICI extends BankB {
    @Override
    public void setRateOfInterest() {
        rateOfInterest = 8.0;
    }
}

class SBI extends BankB {
    @Override
    public void setRateOfInterest() {
        rateOfInterest = 6.5;
    }
}

public class Bank {
    public static void main(String args[]) {
        BankB bank1 = new HDFC();
        BankB bank2 = new ICICI();
        BankB bank3 = new SBI();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        if (choice == "sbi") {
            bank3.setRateOfInterest();
            bank3.getRateOfInterest();
        }
        if (choice == "icici") {
            bank2.setRateOfInterest();
            bank2.getRateOfInterest();
        }
        if (choice == "hdfc") {
            bank1.setRateOfInterest();
            bank1.getRateOfInterest();
        }

    }
}


