package es.studium.Cuadrante;

import java.util.Scanner;

public class Cuadrante {

	public static void main(String[] args) 
	{
		double a, b;
		int cuadrante;
		
		// creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
						
		System.out.println("Dame un número real:");
		a = teclado.nextInt();
		
		System.out.println("Dame otro número real:");
		b = teclado.nextInt();
		
		teclado.close();
		
		cuadrante=funCuadrante(a,b);
		
		System.out.println("El punto dado pertenece al cuadrante nº: "+cuadrante);

	}
	
	public static int funCuadrante(double x, double y) 
	{
		int c;
		
		if(x>=0 && y>=0) 
		{
			c=1;
		}
		
		else 
		{
			if(x<0 && y>=0)
			{
				c=2;
			}
			
			else
			{
				if(x<0 && y<0) 
				{
					c=3;
				}
				else
				{
					c=4;
				}
			}
		}
		
		return(c);
	}

}
