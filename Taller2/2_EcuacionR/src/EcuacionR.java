import java.util.Scanner;

/**
 * Created by LIZ on 17/02/2017.
 */
public class EcuacionR
{
    public static void main(String[] args)
    {
        double variableA, variableB, variableC, variableD, variableR;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor de la variable A: ");
        variableA = teclado.nextInt();
        System.out.println("Ingrese el valor de la variable B: ");
        variableB = teclado.nextInt();
        System.out.println("Ingrese el valor de la variable C: ");
        variableC = teclado.nextInt();
        System.out.println("Ingrese el valor de la variable D: ");
        variableD = teclado.nextInt();

        variableR = (variableA + variableB / variableC)*variableD;

        System.out.println("El resultado de la ecuacion es: "+(int) variableR);
    }
}
