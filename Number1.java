import java.util.Scanner;

public class Number1
{
    public static void Num(Number1 a)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int n1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int n2 = in.nextInt();

        System.out.println("Введите третье число: ");
        int n3 = in.nextInt();

        if (n1 == n2 || n1 == n3 || n2 == n3)
        {
            System.out.println("Два или более числа равны.");
        }
        if (n1 != n2 & n1 != n3 & n2 != n3)
        {
            System.out.println("Числа не равны.");
        }
    }
}