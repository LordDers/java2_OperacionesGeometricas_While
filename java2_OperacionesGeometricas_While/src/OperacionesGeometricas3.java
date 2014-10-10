import java.util.Scanner;

import com.zubiri.geometria.Circulos;
import com.zubiri.geometria.Rectangulo;

public class OperacionesGeometricas3
{
	public static void main (String args[])
	{
		char figura;

		Scanner sc = new Scanner(System.in);
		System.out.print("\n Sobre que figura geometrica desea realizar las operaciones, ¿Circulo (C), Rectangulo (R) o Terminar (T)?");
		figura = sc.next().charAt(0);

		while (figura != 'T' && figura != 't')
		{
			if (figura == 'C' || figura == 'c')
			{
				double numero1, resultadoArea, resultadoCircunferencia;
		
				System.out.print("\nIngresa un número: ");
				numero1 = sc.nextDouble();

				Circulos operaciones = new Circulos(numero1);

				resultadoArea = operaciones.Area();
				resultadoCircunferencia = operaciones.Circunferencia();

				System.out.println("\nEl resultado del AREA es: " + resultadoArea);
				System.out.println("\nEl resultado de la CIRCUNFERENCIA es: " + resultadoCircunferencia);
				System.out.println("\n------------------------------");
			}

			else if (figura == 'R' || figura == 'r')
			{
				double alt = 0, bs = 0;

				System.out.print("\nIngresa la altura del rectangulo: ");
				alt = sc.nextDouble();
		
				System.out.print("\nIngresa la base del rectangulo: ");
				bs = sc.nextDouble();

				Rectangulo rectangulo = new Rectangulo(bs, alt);

				System.out.println("\nEl AREA del rectangulo es: " + rectangulo.Area() + "cm");
				System.out.println("\nEl PERIMETRO del rectangulo es: " + rectangulo.Perimetro() + "cm");
				System.out.println("\n------------------------------");
			}
			else 
			{
				if (figura == 'T' || figura == 't')
				{
					break;
				}
				else
				{
					System.out.println("\nDebes seleccionar una figura, Circulo (C), Rectangulo (R) o Terminar (T)");
				}
			}
			System.out.print("\n Sobre que figura geometrica desea realizar las operaciones, ¿Circulo (C), Rectangulo (R) o Terminar (T)");
			figura = sc.next().charAt(0); // figura = sc.nextLine();

		}
		System.out.println("\nHas salido del programa. \n ¡Hasta la vuelta!");
	}
}
