import java.util.Scanner;

/**
 * Created by LIZ on 21/02/2017.
 */
public class LongitudCuadrado
{
    public static void main(String[] args)
    {
        float Longitud1, Longitud2, AreaCuadrado;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la longitud 1 del cuadrado: ");
        Longitud1 = teclado.nextFloat();
        System.out.println("Ingrese el valor de la longitud 2 del cuadrado: ");
        Longitud2 = teclado.nextFloat();

        AreaCuadrado = Longitud1*Longitud2;

        System.out.println("El area del cuadrado es: "+ AreaCuadrado);
    }
}
