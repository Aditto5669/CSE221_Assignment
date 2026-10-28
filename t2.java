import java.io.*;
import java.util.*;
public class t2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            //int a = Integer.parseInt(st.nextToken());
             st.nextToken();
            long b = Long.parseLong(st.nextToken());
            String s=st.nextToken();
            long c=Long.parseLong(st.nextToken());
            if(s.equals("+")){
                out.println(b+c);
            }
            else if(s.equals("-")){
                out.println(b-c);
            }
            else if(s.equals("*")){
                out.println(b*c);
            }
            else if(s.equals("/")){
                out.println((double)b/c);
            }
            else if(s.equals("%")){
                out.println(b%c);
            }
            else if(s.equals("&")){
                out.println(b&c);
            }
            else if(s.equals("|")){
                out.println(b|c);
            }
            else if(s.equals("^")){
                out.println(b^c);
            }
            else if(s.equals("<<")){
                out.println(b<<c);
            }
            else if(s.equals(">>")){
                out.println(b>>c);
            }
            
        }
        out.close();
    }
}