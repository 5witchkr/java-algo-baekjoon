import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon10828 {
    public static void main(String[] args) throws IOException {

        //
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        //stringbuilder 문자열 더하거나 할때 사용
        StringBuilder sb = new StringBuilder();

        //Int형 스택 사용
        Stack<Integer> stack = new Stack<Integer>();

        int t = Integer.parseInt(input.readLine());

        for (int i=0; i<t; i++) {
            String command = input.readLine();

            if (command.startsWith("push")){
                //stack에 push
                stack.push(Integer.parseInt(command.substring(5)));
            }
            else if (command.equals("pop")){
                //비었으면 -1 출력
                if (stack.isEmpty()) sb.append("-1\n");
                //stack에서 pop
                else sb.append(stack.pop()+"\n");
            }
            else if (command.equals("size")){
                //스택 크기 출력
                sb.append(stack.size()+"\n");
            }
            else if (command.equals("empty")){
                if (stack.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }
            else {
                if (stack.isEmpty()) sb.append("-1\n");
                //peek = stack에서 가장 상단값 출력
                else sb.append(stack.peek() + "\n");
            }
        }
        System.out.println(new String(sb));
    }
}
