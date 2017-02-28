import java.util.Scanner;

/**
 * Created by LIZ on 25/02/2017.
 */
public class Calculo
{
    public static void main(String[] args)
    {
        double A, B, C, D;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        A = teclado.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        B = teclado.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        C = teclado.nextDouble();
        System.out.println("Ingrese el valor de D: ");
        D = teclado.nextDouble();

        if (A/B == C/D)
        {
            System.out.println("SI");
        }
        else
        {
            System.out.println("NO");
        }
        if (B == 0 || D == 0)
        {
            System.out.println("Indefinido");
        }
    }
}
