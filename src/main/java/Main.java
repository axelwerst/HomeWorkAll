import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int res = fibon.fi(num);


        System.out.println(res);

        /*int i = 1;
        long [] fib;
        fib = new long [num];
        fib [0] = 0;
        fib [1] = 1;
        while (i < num -1){
            fib[i+1]= fib[i-1]+ fib[i];
            i++;
        }
    System.out.println(Arrays.toString(fib));*/


    }
}
