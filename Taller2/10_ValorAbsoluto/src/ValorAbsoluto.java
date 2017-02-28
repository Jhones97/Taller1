import java.util.Scanner;

/**
 * Created by LIZ on 25/02/2017.
 */
public class ValorAbsoluto
{
    public static void main(String[] args)
    {
        int Numero, ValorAbsoluto;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular: ");
        Numero = teclado.nextInt();

        ValorAbsoluto = Math.abs(Numero);

        System.out.println("El numero es: "+Numero+" y su valor absoluto es: "+ValorAbsoluto);
    }
}
