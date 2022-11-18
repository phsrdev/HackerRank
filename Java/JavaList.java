import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> L = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			L.add(sc.nextInt());
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; i++) {
			String op = sc.next();
			if (op.equalsIgnoreCase("INSERT")) {
				int index = sc.nextInt();
				int item = sc.nextInt();
				L.add(index, item);
			} else {
				L.remove(sc.nextInt());
			}

		}
		for (Integer integer : L) {
			System.out.print(integer + " ");
		}
		sc.close();
	}
}

/*
For this problem, we have 2 types of queries you can perform on a List(https://docs.oracle.com/javase/7/docs/api/java/util/List.html):

1 - Insert y at index x:

Insert
x y

2 - Delete the element at index x:

Delete
x

Given a list, L, of N integers, perform Q queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer, N (the initial number of elements in L).
The second line contains N space-separated integers describing L.
The third line contains an integer, Q(the number of queries).
The 2Q subsequent lines describe the queries, and each query is described over two lines:

1 - If the first line of a query contains the String Insert, then the second line contains two space separated integers x y, and the value y must be inserted into L at index x.
2 - If the first line of a query contains the String Delete, then the second line contains index x, whose element must be deleted from L.

Constraints

1 <= N <= 4000
1 <= Q <= 4000

Each element in is a 32-bit integer.

Output Format

Print the updated list L as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0

Sample Output

0 1 78 12 23

Explanation

L = [12, 0 , 1, 78, 12]
Q0: Insert 23 at index 5.
L0 = [12, 0, 1, 78, 12, 23]
Q1 = Delete the element at index 0.
L1 = [0, 1, 78, 12, 23]

Having performed all Q queries, we print L1 as a single line of space-separated integers.
*/