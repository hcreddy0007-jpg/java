public class Recursion {

    int n;

    int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {

        Recursion x = new Recursion();   // object creation

        x.n = Integer.parseInt(args[0]); // input from command line

        System.out.println("Factorial = " + x.factorial(x.n));
    }
}
