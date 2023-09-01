import java.util.Scanner;
public class Ejercicio7 {
	
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo[ ] = new int [10];
		
		boolean cre = false, decre = false;
		
		for (int i = 0; i <10; i ++) {
			System.out.println((i+1) + ".- Digite un numero: ");
			arreglo[i] = entrada.nextInt(); 
		}
		
		for (int i = 0; i <9; i ++) {
			if (arreglo [i] < arreglo [i+1]) {
				cre = true; 
			}

			if (arreglo [i] > arreglo [i+1]) {
				decre = true; 
			}
		}
		
		if (cre == true && decre == false) {
			System.out.println("El arreglo está ordenado en forma creciente");
		}
		else if (decre == true && cre == false) {
			System.out.println("El arreglo está ordenado en forma decreciente.");
		}
		else if (cre == true && decre == true){
			System.out.println("El arreglo está desordenado.");
		}
		else if (cre == false && decre == false){
			System.out.println("Todos los números del arreglo son iguales. ");
		}
		
	}

}
