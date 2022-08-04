import java.util.Scanner;
//Для постановки Сказки красная шапочка в детском саду
// "Солнышко" было решено выбрать самого маленького по росту ребёнка на роль красной шапочки и самого большого на роль волка
//На вход программе даётся число n, затем 2*n  строк. Каждая пара строк - Имя ребёнка и его рост.
// Выведите  на разных строках два имени: ребёнка, который будет играть красную шапочку и ребёнка,
// который будет играть волка. Если детей одного наименьшего или наибольшего роста несколько,
// то выберите первого из встретившихся. Гарантируется, что все имена различны и есть минимум 1 ребёнок.
public class detskiySad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next(), name=s, name1=s;
        int tall=sc.nextInt(), max = tall, min = tall;


        for (int i = 1; i < num; i++) {
            s = sc.next();
            tall = sc.nextInt();
            if (tall > max) {
                max = tall;
                name = s;
            }
            if (tall < min) {
                min = tall;
                name1 = s;
            }

        }
        System.out.println(name + "\n" + name1);
    }
}
