import java.util.Scanner;

/**
 * Created by LIZ on 25/02/2017.
 */
public class CalcularMayor
{
    public static void main(String[] args)
    {
        int Numero1, Numero2, Numero3, Mayor, Menor;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero 1: ");
        Numero1 = teclado.nextInt();
        System.out.println("Ingrese el valor del numero 2: ");
        Numero2 = teclado.nextInt();
        System.out.println("Ingrese el valor del numero 3: ");
        Numero3 = teclado.nextInt();

        if (Numero1 > Numero2 && Numero1 > Numero3)
        {
            Mayor = Numero1;
        }
        else {
            if (Numero2 > Numero1 && Numero2 > Numero3)
            {
                Mayor = Numero2;
            } else {
                Mayor = Numero3;
            }
        }
        if (Numero1 < Numero2 && Numero1 < Numero3)
        {
            Menor = Numero1;
        }
        else {
            if (Numero2 < Numero1 && Numero2 < Numero3) {
                Menor = Numero2;
            } else {
                Menor = Numero3;
                }
            }

        System.out.println("El numero mayor es: "+Mayor+" y el numero menor es: "+Menor);
        }
    }
