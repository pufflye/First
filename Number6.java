import java.util.Scanner;

public class Number6
{
    public static void Num(Number6 f)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = in.nextInt();

        System.out.println("Введите второе число: ");
        int b = in.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Теперь первое число это " + a);

        System.out.println("Теперь второе число это " + b);
    }
}