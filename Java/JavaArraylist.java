import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.            Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }
            listOfList.add(list);
        }

        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            try {
                int v = listOfList.get(r - 1).get(c - 1);
                System.out.println(v);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
        sc.close();
    }
}

/*
Sometimes it's better to use dynamic size arrays. Java's Arraylist(https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html) can provide you this feature. Try to solve this problem using Arraylist.

You are given n lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in y^th position of x^th line.

Take your input from System.in.

Input Format

The first line has an integer n. In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers. In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Constraints

1 <= n <= 20000
0 <= d <= 50000
1 <= q <= 1000
1 <= x <= n

Each number will fit in signed integer.
Total number of integers in n lines will not cross 10^5.

Output Format

In each line, output the number located in y^th position  of x^th line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output

74
52
37
ERROR!
ERROR!

Explanation

The diagram below explains the queries: 
IMG JavaArraylist.png on github (https://github.com/phsrdev/HackerRank/blob/main/Java/JavaArraylist.png)
*/