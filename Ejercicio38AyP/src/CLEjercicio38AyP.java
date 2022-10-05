
import java.util.*;


public class CLEjercicio38AyP {

	public static void main(String[] args) {
		
		
		
			Scanner sc = new Scanner(System.in);
		
			//Introducir a "n"
			
			int ene_numeros = 0;
			int sumaenteros = 0;
			double promedioenteros;
			
			do {
			System.out.print("Inserte el número de enteros que se se tomarán en cuenta:  ");
			ene_numeros = sc.nextInt();
			
			} while(ene_numeros < 1);
			
			
		
			for (int i=1; i < ene_numeros+1; i++) 
			{
				System.out.print("Inserte un entero: ");
				int lecturaint= sc.nextInt();
				sumaenteros+= lecturaint;	
			}
		
			System.out.println("La suma de los enteros es: " + sumaenteros);
			promedioenteros= sumaenteros/ene_numeros;
			System.out.println("El promedio de los enteros es: " + promedioenteros);
			System.out.println();
			
			}
		
}
