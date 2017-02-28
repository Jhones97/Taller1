import java.util.Scanner;

/**
 * Created by LIZ on 25/02/2017.
 */
public class Hipotenusa
{
    public static void main(String[] args)
    {
        double catetoA, catetoB, hipotenusa;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del cateto 1: ");
        catetoA = teclado.nextDouble();
        System.out.println("Ingrese el valor de cateto 2: ");
        catetoB = teclado.nextDouble();

        hipotenusa = Math.sqrt(Math.pow(catetoA,2) + Math.pow(catetoB,2));

        System.out.println("El valor de la hipotenusa es: "+ hipotenusa);
    }
}
