import java.io.*;
import java.util.*;
public class t1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        // int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
           int  a = Integer.parseInt(st.nextToken());
            if(a%2==0){
                out.println(a+" is an Even number.");
            } else {
                out.println(a+" is an Odd number.");
            }
        }
        out.close();
    }
}