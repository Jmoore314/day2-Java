// write a program that shows all primes between 2 and 100.
public class Primes {

  public static void main(String[] args){
    int number1, number2;
    boolean isPrime;

    for (number1 = 2; number1 <= 100; number1++) {
      isPrime = true;
      for (number2 = 2; number2 < number1; number2++) {
        if (number1%number2 == 0) {
          isPrime = false;
        } 
      }
      if (isPrime) {
        System.out.println(number1 + " is prime.");
      }
    }
  }  
}