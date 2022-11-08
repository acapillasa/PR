import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] n = new int[5];
        int p = 0;
        int u = n.length-1;

        for (int i = 0; i < n.length; i++) {
            System.out.println("Dame el numero "+i);
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < n.length/2; i++) {
            System.out.print(n[p]);
            System.out.print(" ");
            System.out.print(n[u]);
            System.out.print(" ");
            p = p + 1;
            u = u - 1;
        }

    }
}