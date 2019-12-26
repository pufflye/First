import java.util.Scanner;

public class Number8
{
    public static void Num(Number8 g) {
        {
            Scanner in = new Scanner(System.in);

            float L = 0;

            System.out.println("Введите действительное число: ");
            float n = in.nextFloat();

            if (n > 1)
                L = n - 1;

            if (n < 0)
                L = -n;

            System.out.println("Расстояние от данной точки до прямой [0, 1]: " + L);
        }
    }
}