import java.util.Scanner;
//По данному целому числу a и натуральному n вычислите сумму 1+a+a^2+...+a^n,
// не используя формулу суммы геометрической прогрессии. Время работы программы должно быть пропорционально n.
// if a = 2, n = 2 -----> sum = 1 + 2 + 2^2 = 7
// if a = 2, n = 4 -----> sum = 1 + 2 + 2^2 + 2^3 + 2^4 = 31
public class GeomProgress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n ; i++) {
            sum += Math.pow(a,i);

        }
        System.out.println(sum);
    }
}
