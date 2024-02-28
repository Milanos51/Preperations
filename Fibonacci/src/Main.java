//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        }
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;

        int past = 0;
        int present = 1;
        int next;

        for (int i = 2; i <= n; i++) {
            next = past + present;
            past = present;
            present = next;
        }

        return present;

        // alternatively the following math formula works
        // public static int fibonacci(int n) {
        //    double phi = (1 + Math.sqrt(5)) / 2;
        //    return (int) Math.round((Math.pow(phi, n) - Math.pow(1 - phi, n)) / Math.sqrt(5));
        //}
    }


    public static String Primenumber(int n) {
        boolean isprime = false;
        if (n <= 2) {
            return n + " is prime";
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return n + " is not prime";

            }
        }
            return n + " is  prime";



    }

    public static String PalindromeStringBuilder(String s){

        StringBuilder Pali = new StringBuilder(s);
        String Reversed= Pali.reverse().toString();

        if(s.equals(Reversed)){
            return s + " is a palindrome";
        }
        return s + " is not a palindrome";
    }

    public static String PalindromeIterative(String s) {

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }

        if (reversed.equals(s)) {
            return s + " is a Palindrome";
        }
        return s + " is not a Palindrome";

    }
}




