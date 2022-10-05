import java.util.*;
	
public class CLEjercico34AyP {
	

	public static void main(String[] args) {
		
		

		
			Scanner sc = new Scanner(System.in);
			System.out.print("Inserte el valor de x: ");
			double x= sc.nextDouble();
			double efedex=0;
		
			
				if (x<=11){
					efedex= 3*x+36;
				}
				else {
					if (x<=33) {
						efedex= Math.pow(x, 2)-10;
					}
					else {
						if (x<=64){
						efedex= x+6;
						}
						else {
							efedex=0;
						}
					}
				}
			
			System.out.print("(f)x= " + efedex);
			System.out.println();
		}


}
