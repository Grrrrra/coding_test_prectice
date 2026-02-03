import java.io.*;
import java.util.Arrays;

public class test_2751 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int []arr = new int [N];
        for(int i =0; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int v : arr){
            sb.append(v).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
    
    }
}
