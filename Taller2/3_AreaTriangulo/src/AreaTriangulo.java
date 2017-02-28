import java.util.Scanner;

/**
 * Created by LIZ on 18/02/2017.
 */
public class AreaTriangulo
{
    public static void main(String[] args)
    {
        double variableA, variableB, variableC, variableS, AreaTriangulo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la variable A: ");
        variableA = teclado.nextDouble();
        System.out.println("Ingrese el valor de la variable B: ");
        variableB = teclado.nextDouble();
        System.out.println("Ingrese el valor de la variable C: ");
        variableC = teclado.nextDouble();

        variableS = (variableA + variableB + variableC)/2;
        AreaTriangulo = Math.sqrt(variableS*(variableS + variableA)*(variableS + variableB)*(variableS + variableC));

        System.out.println("El area del triangulo es: "+AreaTriangulo);
    }
}
