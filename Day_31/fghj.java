package Day_31;

import java.io.*;
import java.util.*;
class Result {
/*
* Complete the 'maxSubarray' function below.
*
* The function is expected to return an INTEGER_ARRAY.
* The function accepts INTEGER_ARRAY arr as parameter.
*/
public static List<Integer> maxSubarray(List<Integer> arr) {
int maxSA = arr.get(0); // max sub array
int maxSS = arr.get(0); // max sub sequences
int max = arr.get(0);
for (int i = 1; i < arr.size(); i++) {
max = Math.max(max + arr.get(i), arr.get(i));
maxSA = Math.max(maxSA, max);
maxSS = Math.max(Math.max(maxSS, arr.get(i)), maxSS + arr.get(i));
}
ArrayList<Integer> list = new ArrayList<>();
list.add(maxSA);
list.add(maxSS);
return list;
}
}
public class fghj {
public static void main(String[] args) throws IOException {
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bufferedWriter = new BufferedWriter(new
FileWriter(System.getenv("OUTPUT_PATH")));
int t = Integer.parseInt(bufferedReader.readLine().trim());
for (int tItr = 0; tItr < t; tItr++) {
int n = Integer.parseInt(bufferedReader.readLine().trim());
String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$",
 "").split(" ");
List<Integer> arr = new ArrayList<>();
for (int i = 0; i < n; i++) {
int arrItem = Integer.parseInt(arrTemp[i]);
arr.add(arrItem);
}
List<Integer> result = Result.maxSubarray(arr);
for (int i = 0; i < result.size(); i++) {
bufferedWriter.write(String.valueOf(result.get(i)));
if (i != result.size() - 1) {
bufferedWriter.write(" ");
}
}
bufferedWriter.newLine();
}
bufferedReader.close();
bufferedWriter.close();
}
}

