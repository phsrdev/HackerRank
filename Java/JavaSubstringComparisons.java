import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String lista, int tamLista) {
        String menor = "";
        String maior = "";
        
        java.util.List<String> temp = new java.util.ArrayList<>();

        for(int i=0;i<lista.length()-tamLista+1;i++){
                temp.add(lista.substring(i,i+tamLista));   
        }
        java.util.Collections.sort(temp);
         menor = temp.get(0);
         maior = temp.get(temp.size()-1);
        return menor + "\n" + maior;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

/*We define the following terms:

Lexicographical Order (https://en.wikipedia.org/wiki/Lexicographic_order), also known as alphabetic or dictionary order, orders characters as follows:

A < B < ... < Y < Z a < b < ... < y < z

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring (https://en.wikipedia.org/wiki/Substring) of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.

Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find

Returns

string: the string ' + "\n" + ' where and are the two substrings

Input Format

The first line contains a string denoting .
The second line contains an integer denoting .

Constraints

1 <= |s| <= 1000
s consists of English alphabetic letters only (i.e., [a-zA-Z]).

Sample Input 0

welcometojava
3

Sample Output 0

ava
wel

Explanation 0

String s = "welcometojava" has the following lexicographically-ordered substrings of length k = 3:

["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output. */