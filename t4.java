import java.io.*;
import java.util.*;
public class t4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int a[] = new int[b];
            for(int j=0;j<b;j++){
                a[j] = Integer.parseInt(st.nextToken());
            }
            boolean flag = true;
            for(int j=0;j<b-1;j++){
                if(a[j]>a[j+1]){
                    flag = false;
                    break;
                }
            }
            pw.println(flag ? "YES" : "NO");
        }
        pw.close();
    }
}
