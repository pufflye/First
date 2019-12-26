import java.util.Scanner;

public class Number5
{
    public static void Num(Number5 e)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер числа: ");
        int n = in.nextInt();
        int P=1;
        int X=0;
        int A=0;
        int B=3;
        while(P<n)
        {
            for(int i=1;i<=B;i++)
            {
                if(B%i==0)
                    A++;
            }
            if(A==2)
            {
                P++;
                X=B;
            }
            A=0;
            B=B+2;
        }
        System.out.println("Число под данным номером это " + X);
    }
}