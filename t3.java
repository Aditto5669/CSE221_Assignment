import java.io.*;
import java.util.*;
public class t3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Long a[] = new Long[n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            a[i] = Long.parseLong(st.nextToken());
        }
        for(int i=0;i<n;i++){
            pw.println((a[i]*(a[i]+1))/2);
        }
        pw.close();
    }
}