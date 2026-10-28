import java.io.*;
import java.util.*;

public class pa1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count=0;
        ArrayList<int[]> al = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            // pw.println(arr[i]);
            int sort=0;
            //int max=arr[0];
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    sort++;
                    //break;
                }
                //else {
                    //max=arr[j];
                
            }
            if(sort==0){
                count++;
                pw.println("YES");
                pw.println(al.size());
                for(int j=0;j<al.size();j++){
                    pw.print(al.get(j)[0] + " ");
                    pw.print(al.get(j)[1] );
                    pw.println();
                }
                break;
            }
            else{
                
                if(arr[i]>arr[i+2]){
                    int temp=arr[i];
                    arr[i]=arr[i+2];
                    arr[i+2]=temp;
                    al.add(new int[]{i+1,i+3});
                    //count++;
                }

            }
        }
        if(count==0){
            pw.println("NO");
        }
        //     st=new StringTokenizer(br.readLine());
        //     int a = Integer.parseInt(st.nextToken());
        //     if(a%2==0){
        //         pw.println(a + " is an Even number.");
        //     }
        //     else{
        //         pw.println(a + " is an Odd number.");
        //     }
        // }
         pw.close();
    }
}