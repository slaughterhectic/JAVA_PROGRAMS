// Permutation interface
interface Permutation {
    int calculatePermutation(int n, int r);
}

// Combination interface
interface Combination {
    int calculateCombination(int n, int r);
}

// NPRnNCR interface that extends Permutation and Combination interfaces
interface NPRnNCR extends Permutation, Combination {
    // no additional methods are required here
}

// NPRnNCRCalculation class implementing NPRnNCR interface
class NPRnNCRCalculation implements NPRnNCR {
    @Override
    public int calculatePermutation(int n, int r) {
        // TODO: Implement permutation calculation logic
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
        }
        return result;
    }

    @Override
    public int calculateCombination(int n, int r) {
        // TODO: Implement combination calculation logic
        int result = 1;
        for (int i = 0; i < r; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        return result;
    }
}

// Main class
public class demo1 {
    public static void main(String[] args) {
        NPRnNCRCalculation calc = new NPRnNCRCalculation();

        int n = 5;
        int r = 3;

        int permutation = calc.calculatePermutation(n, r);
        int combination = calc.calculateCombination(n, r);

        System.out.println("Permutation of " + n + " and " + r + " is " + permutation);
        System.out.println("Combination of " + n + " and " + r + " is " + combination);
    }
}
