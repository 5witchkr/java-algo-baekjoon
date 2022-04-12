import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon10818 {
    public static void main(String[] args) throws IOException {
        //bufferedreader사용
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());

        //readline으로 입력받으면 공백도 같이 입력돼서 분리시켜줌
        StringTokenizer st = new StringTokenizer(input.readLine()," ");

        int[] arr = new int[n];
        
        //입력
        for (int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(arr[0]+" "+arr[n-1]);
    }
}
