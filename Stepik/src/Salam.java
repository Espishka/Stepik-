import java.util.Scanner;
public class Salam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b=0, count = 0;
        for (int i=0; i < n; i++) {
            b = sc.nextInt();
            if ( b%10 == 4 || b==4) {
                count++; }

        }
        if (count > 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
