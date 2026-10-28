import java.io.*;
import java.util.*;

public class t77 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            // ArrayList<int[]> arr = new ArrayList<>();
            int c[] = new int[m];
            int d[] = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                c[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                d[j] = Integer.parseInt(st.nextToken());
            }
            // for (int j = 0; j < m; j++) {

            // arr.add(new int[] { c[j], d[j] });
            // }
            // int count = 0;
            // for (int j = 0; j < m; j++) {
            int count = 0;

            for (int j = 0; j < m - 1; j++) {
                int idx = j;

                for (int k = j + 1; k < m; k++) {
                    if (d[k] > d[idx] || (d[k] == d[idx] && c[k] < c[idx])) {
                        idx = k;
                    }
                }

                if (idx != j) {
                    count++;

                    int temp = d[j];
                    d[j] = d[idx];
                    d[idx] = temp;

                    int temp2 = c[j];
                    c[j] = c[idx];
                    c[idx] = temp2;
                }
            }
            pw.println("Minimum swaps: " + count);
            for (int j = 0; j < m; j++) {
                pw.println("ID: " + c[j] + "Mark: " + d[j]);
            }

        }
        pw.close();
    }
}