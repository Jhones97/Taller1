import java.util.Scanner;

/**
 * Created by LIZ on 18/02/2017.
 */
public class OperacinesBasicas
{
    public static void main(String[] args)
    {
        double Numero1, Numero2, Suma, Resta, Producto, Division;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero 1: ");
        Numero1 = teclado.nextDouble();
        System.out.println("Ingrese el valor del numero 2: ");
        Numero2 = teclado.nextDouble();

        Suma = Numero1 + Numero2;
        Resta = Numero1 - Numero2;
        Producto = Numero1 * Numero2;
        Division = Numero1/Numero2;

        System.out.println("El resultado de la suma es: "+(int) Suma+", de la resta es: "+(int) Resta+", del producto es: "+(int) Producto+" y de la division es: "+5 Division);
    }
}
