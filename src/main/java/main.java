import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] arg) {
int f1 = 0;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        int [] fib;
        fib = new int [num];
        fib [0] = 0;
        fib [1] = 1;
        while (i < num -1){
            fib[i+1]= fib[i-1]+ fib[i];
            i++;
        }
System.out.println(Arrays.toString(fib));
    }
}
