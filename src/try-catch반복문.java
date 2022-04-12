import java.util.Scanner;

public class baekjoon10951 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean k = true;
        while (k) {
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(a+b);
            } catch (Exception e) {
                k = false;
            }
        }
    }
}
