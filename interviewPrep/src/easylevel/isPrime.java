package easylevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class isPrime {
    public static void main( String [] args) {
        try {
            System.out.println(" Print Number to check isPrime ");

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            Integer inputNumber = Integer.parseInt(bf.readLine());

            System.out.println(" Number = " + inputNumber + " isPrime = " + isPrime(inputNumber));

            Integer [] sample = { 3, 9, 11, 12, 17,18,19,21,22} ;

            System.out.println("Checking primality of sample prime number ");

            for ( Integer number : sample) {
                System.out.println(" Number = " + number + " isPrime = " + isPrime(number));
            }
            //printPrimeNumbers(inputNumber);
        } catch ( Exception ex) {
            System.out.println(ex.getMessage() );
        }

    }

    /*
    a * b = n
    if both a = b then a^2 = n
    if a != b     then a < sqrt(n) < b
    so if we check if any numbers for 3 to sqrt(n) is a factor of n then n is not prime
    else it is prime.
     */
   public static void printPrimeNumbers(int upperLimit) {
        for ( int number = 3; number <= upperLimit; number++ ) {

            boolean isPrime=true;

            for ( int i = 2; i < number && isPrime == true ; i++  ) {
                if (  (number % i) == 0)
                    isPrime = false;
            }

            if (isPrime )
                System.out.print( " " + number);
        }

    }

    public static boolean isPrime( int number ){

       if ( number < 2)
           return false;
       if ( number == 2)
           return true;

       double sqrtNumber = Math.sqrt(number);

       for ( int i = 2 ; i <= sqrtNumber +1 ; i++ ) {

           if ( number % i == 0 )
               return false;
       }

       return true;
    }
}
