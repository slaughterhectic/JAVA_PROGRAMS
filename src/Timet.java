class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours > 24 || hours < 0) {
            throw new HrsException("Invalid value for hours: " + hours);
        }
        if (minutes > 60 || minutes < 0) {
            throw new MinException("Invalid value for minutes: " + minutes);
        }
        if (seconds > 60 || seconds < 0) {
            throw new SecException("Invalid value for seconds: " + seconds);
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void displayTime() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }
}

public class Timet {
    public static void main(String[] args) {
        try {
            Time t1 = new Time(12, 30, 45);
            t1.displayTime();
            Time t2 = new Time(25, 15, 0);
            t2.displayTime();
        } catch (HrsException | MinException | SecException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
