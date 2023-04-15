class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class fifth {
    public static void main(String[] args) {
        try {
            if(args.length < 4) {
                throw new CheckArgumentException("Less than four arguments were provided.");
            }
            int sum = 0;
            for(int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num*num;
            }
            System.out.println("The sum of squares of all four elements is: " + sum);
        } catch (CheckArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Invalid argument: " + ex.getMessage());
        }
    }
}
