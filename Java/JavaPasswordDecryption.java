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


class Result {

    static String decryptPassword(String input) {
        char[] arr = input.toCharArray();
        System.err.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i]) && arr[i] != '0') {
                for (int j = arr.length - 1; j >= 0; j--) {
                    if (arr[j] == '0') {
                        arr[j] = arr[i];
                        arr[i] = ' ';
                        break;
                    }
                }
            }
            if (arr[i] == '*') {
                char temp = arr[i - 2];
                arr[i - 2] = arr[i - 1];
                arr[i - 1] = temp;
                arr[i]=' ';
            }
        }
        String OriginalString="";
        for(char c : arr) {
            if(c!=' ') {
                OriginalString+=c;
            }
        }
        //System.out.println(OriginalString);
        return OriginalString;
    }
}
public class JavaPasswordDecryption {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.decryptPassword(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

