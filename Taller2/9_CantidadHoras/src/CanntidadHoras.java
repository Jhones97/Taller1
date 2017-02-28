import java.util.Scanner;

/**
 * Created by LIZ on 25/02/2017.
 */
public class CanntidadHoras
{
    public static void main(String[] args)
    {
        double CantidadHoras, Minutos, Segundos, Dias;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas: ");
        CantidadHoras = teclado.nextDouble();

        Minutos = CantidadHoras*60;
        Segundos = CantidadHoras*3600;
        Dias = CantidadHoras/24;

        System.out.println("La cantidad de minutos es: "+Minutos+" minutos");
        System.out.println("La cantidad de segundos es: "+Segundos+" segundos");
        System.out.println("La cantidad de dias es: "+Dias+" dias");
    }
}
