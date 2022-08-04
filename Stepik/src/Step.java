import java.util.Scanner;
//Пользователь вводит целые числа до тех пор, пока не введёт слово "СТОП" (гарантируется, что других слов не будет).
// Найдите произведение ненулевых чисел. Если же такое произведение найти не удалось, то выведите на экран "Не найдено".
public class Step {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, sum = 1, count = 0;
        for (; sc.hasNextInt() ;) {
            a=sc.nextInt();
            if (a>0 || a < 0) {
                sum = sum * a;
                count++;
            }

        }

        if (count < 1) System.out.println("Не найдено");

        else System.out.println(sum);
    }
}
