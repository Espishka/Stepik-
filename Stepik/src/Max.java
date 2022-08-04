import java.util.Scanner;
//Последовательность состоит из натуральных чисел и завершается числом 0. Всего вводится не более 10000 чисел
// (не считая завершающего числа 0). Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
//Числа, следующие за числом 0, считывать не нужно.
public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max = num, count = 0;
        for (; num != 0; ) {

            if (num > max) {
                max = num;
                count = 0;
            }
            if (num == max ) {
                count++; }
            num = sc.nextInt();
        }
        System.out.println(count);
    }
}
