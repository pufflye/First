import java.util.Scanner;

public class Number3
{
    public static void Num(Number3 c)
    {
        Scanner in = new Scanner(System.in);

        int K = 0;

        System.out.println("Введите первое число: ");
        int n1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int n2 = in.nextInt();

        System.out.println("Введите третье число: ");
        int n3 = in.nextInt();

        if (n1 >= n2 & n1 >= n3)
            K++;

        if (n2 >= n1 & n2 >= n3)
            K++;

        if (n3 >= n2 & n3 >= n1)
            K++;
        System.out.println("Количество максимальных чисел, среди введенных: " + K);

    }
}
