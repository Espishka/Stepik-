import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 1;
        for ( int i = 1; i <= x; i++) {
            sum = sum * i;
        }
        System.out.print(sum);
        }
    }
// int x =1;
//        for (int i=1; i<10;i++){
//            x = x*i;