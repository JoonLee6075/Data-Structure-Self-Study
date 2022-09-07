import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Josephus {
    
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < N ; i++){
            q.offer(i + 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(q.size() != 1){
            for( int i = 0; i < K-1; i++){
                q.offer(q.poll());
            }
            sb.append(q.poll() + ", ");
            


        }
       
        sb.append(q.poll() +  ">");

        
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();







    }
}
