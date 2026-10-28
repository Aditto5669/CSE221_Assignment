import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
 
        int t = Integer.parseInt(br.readLine().trim());
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
 
            int[] id = new int[n];
            int[] mark = new int[n];
 
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                id[i] = Integer.parseInt(st.nextToken());
            }
 
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                mark[i] = Integer.parseInt(st.nextToken());
            }
 
            int swaps = 0;
 
            for (int i = 0; i < n - 1; i++) {
                int min = i;
 
                for (int j = i + 1; j < n; j++) {
                    if (mark[j] > mark[min] ||
                       (mark[j] == mark[min] && id[j] < id[min])) {
                        min = j;
                    }
                }
 
                if (min != i) {
                    int temp = mark[i];
                    mark[i] = mark[min];
                    mark[min] = temp;
 
                    temp = id[i];
                    id[i] = id[min];
                    id[min] = temp;
 
                    swaps++;
                }
            }
 
            pw.println("Minimum swaps: " + swaps);
 
            for (int i = 0; i < n; i++) {
                pw.println("ID: " + id[i] + " Mark: " + mark[i]);
            }
        }
 
        pw.close();
    }
}