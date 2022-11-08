import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] n = new int[5];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Dame el numero "+i);
            n[i] = sc.nextInt();
        }
        for (int i = n.length-1; i >= 0; i--) {
            System.out.print(n[i]);
            System.out.print(" ");
        }

    }
}