import java.util.Scanner;

public class Number10 {
    public static void Num(Number10 r) {
        Scanner in = new Scanner(System.in);

        float D;
        double x1;
        double x2;

        System.out.println("Введите коэффициент a: ");
        float a = in.nextFloat();

        System.out.println("Введите коэффициент b: ");
        float b = in.nextFloat();

        System.out.println("Введите коэффициент c: ");
        float c = in.nextFloat();

        D = b * b - 4 * a * c;

        while (D <= 0) {
            System.out.println("Дискриминант должен быть положительным!");

            System.out.println("Введите коэффициент a:");
            a = in.nextFloat();

            System.out.println("Введите коэффициент b");
            b = in.nextFloat();

            System.out.println("Введите коэффициент c");
            c = in.nextFloat();

            D = b * b - 4 * a * c;
        }
        x1 = (-b + Math.sqrt(D)) / 2 * a;
        x2 = (-b - Math.sqrt(D)) / 2 * a;

        System.out.println(x1);
        System.out.println(x2);
    }
}