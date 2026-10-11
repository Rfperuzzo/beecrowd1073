
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 1, n, par;

        n = scanner.nextInt();

        while (i <= n) {
            if (i % 2 == 0) {
                par = i * i;
                System.out.println(i +"^2 = " + par);

            }
            i++;
        }

    }
}
