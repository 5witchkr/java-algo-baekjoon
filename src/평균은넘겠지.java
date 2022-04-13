import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon4344 {
    public static void main(String[] args) throws IOException {
        //bufferedreader사용
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        int[] arr;

        //readline으로 입력받으면 공백도 같이 입력돼서 분리시켜줌
        StringTokenizer st;

        for (int i = 0; i<t; i++) {
            st = new StringTokenizer(input.readLine()," ");

            int n = Integer.parseInt(st.nextToken());

            arr = new int[n];

            double sum = 0;
            //입력
            for (int j = 0; j < n; j++) {
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }
            double mean = (sum / n);
            double count = 0;

            for (int j = 0; j<n; j++) {
                if(arr[j]>mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(count/n)*100);
        }
    }
}
