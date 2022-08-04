import java.util.Scanner;
//Дано натуральное число. Найдите произведение его цифр.
public class proizvChisel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(), sum = 1;
        for (int i = 0; n != 0 ; i++) {
            sum = sum * (n%10);
            n = n/10;
        }
        System.out.println(sum);
    }
}
