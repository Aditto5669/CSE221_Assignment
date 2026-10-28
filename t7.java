import java.io.*;
import java.util.*;

public class t7 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            ArrayList<int[]> arr = new ArrayList<>();
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
            for (int j = 0; j < m; j++) {

                arr.add(new int[] { c[j], d[j] });
            }

            int count = 0;
            for(int j=0;j<m;j++){
                int min=-9999999;
                int idx=-1;
                for(int k=j;k<m;k++){
                    if(arr.get(k)[1]>min){
                        min=arr.get(k)[1];
                        idx=k;
                    }
                    else if(arr.get(k)[1]==min){
                        if(arr.get(k)[0]>arr.get(idx)[0]){
                            idx=k;
                        }
                    }
                }
                if(idx!=-1){
                    count++;
                    int temp[] = arr.get(j);
                    arr.set(j, arr.get(idx));
                    arr.set(idx, temp);
                }
                
            }
            pw.println("Minimum swaps: " + count);
            for(int j=0;j<m;j++){
                pw.println("ID: " + arr.get(j)[0] + "Mark: " + arr.get(j)[1]);
            }
        }
        pw.close();
    }
}