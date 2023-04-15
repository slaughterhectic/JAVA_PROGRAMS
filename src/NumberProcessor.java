public class NumberProcessor {

    public void processInput(int num) throws NegativeNumberException {
        if(num < 0) {
            throw new NegativeNumberException("Entered number is negative.");
        } else {
            int doubleValue =  num*2;
            System.out.println("Double value of entered number: " + doubleValue);
        }
    }

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        try {
            processor.processInput(5);
            processor.processInput(-10);
        } catch (NegativeNumberException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

