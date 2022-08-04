import java.util.Scanner;
//Дано натуральное число N. Выведите его представление в двоичном виде в обратном порядке.
public class Dvoichnie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dvoich = 0;
        String str, disp = "";
        StringBuffer sb = new StringBuffer();

        for (; num>=1 ; num = num/2) {
            dvoich =num%2;
            disp = disp + Integer.toString(dvoich);


        }
        sb = new StringBuffer(disp);
        System.out.print(sb.reverse());
    }
}
