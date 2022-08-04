import java.util.Scanner;
//Пользователь вводит слова до тех пор, пока не введёт "СТОП". Среди введённых слов могут быть слова - паразиты, а именно:
// "'ээээ" или "потом". Слова-паразиты не считаются нормальными словами.
//Необходимо выяснить, было ли среди введённых слов слово "Куб".
// Если да, то выведите, каким по счёту нормальным словом оно было введено.
// В противном случае выведите на экран слово "NO".
public class KUB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String stop = "СТОП", cube = "Куб", a;
        String parasite = "потом", parasit1 = "ээээ";
        int count = 0, numcube = 0;

        for (; true ;) {
            a = sc.nextLine();
            if (a.equals(parasite) || a.equals(parasit1)) {
            continue; }
            count++;
            if (a.equals(cube))
                numcube = count;
            if (a.equals(stop)) {
                break; }
        }
        if (numcube > 0)
        System.out.println(numcube);
        else System.out.println("NO");
    }
}