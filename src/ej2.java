import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0;
        int mpos = 0;

        int neg = 0;
        int mneg = 0;

        int ceros = 0;

        int [] n = new int[5];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Dame el numero "+i);
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                pos = pos + n[i];
                mpos = mpos + 1;
            } else if (n[i] < 0) {
                neg = neg + n[i];
                mneg = mneg + 1;
            } else {
                ceros = ceros + 1;
            }

        }
        System.out.println("Has escrito "+mpos+" numeros positivos y su media es: "+pos/mpos);
        System.out.println("Has escrito "+mneg+" numeros positivos y su media es: "+neg/mneg);
        System.out.println("Has escrito "+ceros+" cero(s)");
    }
}