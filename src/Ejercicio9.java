import java.util.Scanner;
public class Ejercicio9 {
	
	public static void main (String args []) {
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo [] = new int [10];
		
		
		System.out.println("Llenado del arreglo.");
		for(int i = 0; i <10; i ++) {
			System.out.print((i+1) + "Ingrese un número: ");
			arreglo[i] = entrada.nextInt();
		}
		
		int pos = arreglo[0];
		
		for (int i = 0; i < 9; i++ ) {
			arreglo [i] = arreglo [i+1];
		}
		
		arreglo [9] = pos;
		
		
		for (int i: arreglo) {
			System.out.println(i);
		}
		
	}

}
