import java.io.*;
import java.util.*;

public class t5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        

        ArrayList<int[]> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean sorted = true;
            for (int j = 0; j < n-1; j++) {
                if (a[j] > a[j + 1]) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) {
                break;
            }
            for (int j = 1; j < n - i - 1; j++) {
                // int c=0;
                if (a[j - 1] > a[j + 1]) {
                    int temp = a[j - 1];
                    a[j - 1] = a[j + 1];
                    a[j + 1] = temp;

                    arr.add(new int[] { j, j + 2 });
                }
            }
        }
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                c++;
            }
        }
        if (c != 0) {
            pw.println("NO");
        } else {
            pw.println("YES");
            pw.println(arr.size());
            for (int[] p : arr) {
                pw.println(p[0] + " " + p[1]);
            }
        }
        pw.close();
    }
}