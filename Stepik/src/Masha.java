
//Маша занималась обработкой больших и не очень больших данных.
// На её компьютер время от времени приходили числа и она хотела понять, каких больше:
// кратных 3, или отрицательных. Помогите Маше с её вопросом.
//Вводятся целые числа до тех пор, пока не будет введён 0.
//Если больше чисел, кратных 3, то выведите "333", если больше отрицательных чисел, то выведите "negative",
// если их одинаковое количество, то выведите "Equal".
import java.util.Scanner;
// вывести каких числе было больше: кратных 3 или отрицательных
public class Masha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int krat3 = 0, negative = 0;

        for (int i = 0; num!=0 ; num = sc.nextInt() ) {
            if (num % 3 == 0 && num > 0)
                krat3++;
            if (num < 0 )
                negative++;
        }
        if (krat3>negative) System.out.println("333");
        else if (krat3 < negative) System.out.println("negative");
        else System.out.println("Equal");
    }
}
