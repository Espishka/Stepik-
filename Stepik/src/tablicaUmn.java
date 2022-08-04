import java.util.Scanner;
//Напишите программу, которая по заданному с клавиатуры числу n печатает таблицу умножения от 1 до 9.
public class tablicaUmn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), num=0;
        for (int i = 1; i <= 9 ; i++) {
            num = i * n;
            System.out.println(n + " * " + i + " = " + num);
        }
    }
}
