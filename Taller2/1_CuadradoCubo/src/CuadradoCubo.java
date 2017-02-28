import java.awt.*;
import java.util.Scanner;

/**
 * Created by LIZ on 17/02/2017.
 */
public class CuadradoCubo {
    public static void main(String[] args)
    {
        double Numero;
        int  Cuadrado, Cubo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero para calcular su cuadrado y su cubo: ");
        Numero = teclado.nextInt();


        Cuadrado = (int) Math.pow(Numero, 2);
        Cubo = (int) Math.pow(Numero, 3);

        System.out.println("El numero es: "+ (int) Numero+", su cuadrado es: "+ Cuadrado+" y su cubo es: "+Cubo);
    }
}
