

public class fibon {

    public static int fi(int num) {

        if (num == 1) {
            return 1;
        }
        if (num == 0) {
            return 0;
        }
        return (fi(num - 2) + fi(num - 1));
    }
}