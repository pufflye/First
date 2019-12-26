import java.util.Scanner;

public class Number2
{
    public static void Num(Number2 b)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int n1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int n2 = in.nextInt();

        System.out.println("Введите третье число: ");
        int n3 = in.nextInt();

        if (n1 == n2 & n2 == n3 & n1 == n3)
            System.out.println("Нет числа, второго по величине.");
        if (n1 != n2 | n1 != n3 | n2 != n3) {
            if ((n1 >= n2 & n1 > n3) | (n1 > n2 & n1 >= n3))
            {
                if (n2 < n3)
                    System.out.println(n3);
                if (n2 > n3)
                    System.out.println(n2);
                if (n2 == n3)
                    System.out.println(n1);
            }
            if (n2 > n1 & n2 >= n3) {
                if (n1 > n3)
                    System.out.println(n1);
                if (n1 < n3)
                    System.out.println(n3);
                if (n1 == n3)
                    System.out.println(n2);
            }
            if (n3 > n1 & n3 > n2) {
                if (n1 > n2)
                    System.out.println(n1);
                if (n1 < n2)
                    System.out.println(n2);
                if (n1 == n2)
                    System.out.println(n3);
            }
        }
    }
}