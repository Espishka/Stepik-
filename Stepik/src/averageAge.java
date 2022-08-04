import java.util.Scanner;
public class averageAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s="vvv";
        double age, sum = 0;

        for ( int i = 1 ;i <= n; i++) {
            s = sc.next();
            age = sc.nextInt();
            sum = sum + age;

        }
        System.out.print(sum/n);
    }
}
