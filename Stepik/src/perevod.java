import java.util.Scanner;
//Вводятся целые неотрицательные числа n и k, причём 2 < k < 10. 
// Переведите число n из десятичной системы счисления в систему счисления с основанием k.
public class perevod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int res = 0;
        String disp = "";
        StringBuffer sb = new StringBuffer();
        if ( n==0 ) System.out.println("0");
        else {
            for (; n >= 1; n = n / k) {
                res = n % k;
                disp = disp + Integer.toString(res);

            }
            sb = new StringBuffer(disp);
            System.out.print(sb.reverse());
        }
    }
}
