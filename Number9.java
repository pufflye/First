import java.util.Scanner;

public class Number9
{
    public static void Num(Number9 k) {
        Scanner in = new Scanner(System.in);

        float SA;

        System.out.println("Введите первое число: ");
        int n1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int n2 = in.nextInt();

        System.out.println("Введите третье число: ");
        int n3 = in.nextInt();

        SA = (n1 + n2 + n3) / 3;

        System.out.println("Первое число: " + n1);
        System.out.println("Второе число: " + n2);
        System.out.println("Третье число: " + n3);
        System.out.println("Среднее арифметическое этих чисел равно : " + SA);
    }
}