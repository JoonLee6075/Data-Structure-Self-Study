import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DoublePointer {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] material = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++){
            material[i] = Integer.parseInt(st.nextToken());

        }

        int cnt = 0;
        for(int start=0; start<n; start++)  {
            int sum = 0;
            int end = start+1;

            while (end<n) {
                sum = material[start];
                sum += material[end++];
                if (sum == m) {
                    cnt++;
                    break;
                }
            }

            }    System.out.print(cnt);






    }
    
}
