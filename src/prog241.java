
interface Currency {
    void moneyCurrency(double amount);
    void countryCurrency(String country);
}


class CurrencyConversion implements Currency {

    public void moneyCurrency(double amount) {
        // TODO: Implement money currency conversion logic
        System.out.println(amount + " USD = " + (amount * 0.85) + " EUR");
    }


    public void countryCurrency(String country) {

        System.out.println("1 USD = " + ((country.equals("Japan")) ? "110" : "0.74") + " " + country + " Yen");
    }
}


public class prog241 {
    public static void main(String[] args) {
        CurrencyConversion cc = new CurrencyConversion();

        cc.moneyCurrency(100);
        cc.countryCurrency("Japan");
    }
}
