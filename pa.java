import java.io.*;
import java.util.*;
public class pa {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int arr[] = new int[a];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<a;j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            int count=0;
            int max=arr[0];
            for(int j=0;j<a;j++){
                if(max>arr[j]){
                    count++;
                }
                else{
                    max=arr[j];
                }
            }
            if(count==0){
                out.println("YES");
            }
            else{
                out.println("NO");
            }
        }
        out.close();

        //     st=new StringTokenizer(br.readLine());
        //     int a = Integer.parseInt(st.nextToken());
        //     int count=0;
        //     for(int j=1;j<=a;j++){
        //         count+=j;
        //     }
        //     out.println(count);
        // }
    }
}