import java.io.*;
import java.util.*;

public class t6 {
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
        for (int i = 1; i < n; i++) {
    for (int j = i; j > 0; j--) {
        if ((a[j] % 2 == 0 && a[j - 1] % 2 == 0)
                || (a[j] % 2 != 0 && a[j - 1] % 2 != 0)) {

            if (a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
            } else {
                break;
            }
        } else {
            break;
        }
    }
}
        for (int i = 0; i < n; i++) {
            pw.print(a[i] + " ");
        }
        // pw.println();
        pw.close();
    }
}
