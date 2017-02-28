import java.util.Scanner;

/**
 * Created by LIZ on 25/02/2017.
 */
public class LeerNumero
{
    public static void main(String[] args)
    {
        int Numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        Numero = teclado.nextInt();

        if (Numero > 100)
        {
            Numero = Numero + 20;
        }
        if (Numero == 100)
        {
            Numero = Numero + 1;
        }
        if (Numero < 100)
        {
            Numero = Numero - 20;
        }

        System.out.println("El Numero es: "+Numero);
    }
}
