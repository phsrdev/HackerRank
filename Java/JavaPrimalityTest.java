import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class JavaPrimalityTest {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");
    }
}

/*
A prime number is a natural number greater than 1 whose only positive divisors are 1 and itself. For example, the first six prime numbers are 2, 3, 5, 7, 11, and 13.

Given a large integer, n, use the Java BigInteger class' isProbablePrime(https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29) method to determine and print whether it's prime or not prime.

Input Format

A single line containing an integer, n (the number to be checked).

Constraints

n contains at most 100 digits.

Output Format

If  is a prime number, print prime; otherwise, print not prime.

Sample Input

13

Sample Output

prime

Explanation

The only positive divisors of 13 are 1 and 13, so we print prime. 

 */