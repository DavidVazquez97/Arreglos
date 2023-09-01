import java.util.Scanner;
public class Ejercicio6 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner (System.in);
		
		int arreglo1 [], arreglo2[], arreglo3[];
		
		arreglo1 = new int [12];
		arreglo2 = new int [12]; 
		arreglo3 = new int [24];
		
		
		System.out.println("LLenado del primer arreglo.");
		for (int i = 0; i <12; i++) {
			System.out.print((i+1) + ".- Digite un numero");
			arreglo1 [i] = entrada.nextInt(); 
		}
		
		System.out.println("Lleando del segundo arreglo.");
		for (int i = 0; i<12; i++) {
			System.out.print((i+1) + ".- Digite un número: ");
			arreglo2 [i] = entrada.nextInt();
		}
		
		
		int j = 0;
		int k = 0;
		for (int i = 0; i < 4; i++) {
			for (int l = k; l < (k+3); l++) {
				arreglo3 [j] = arreglo1 [l];
				j++;
			}
			for (int l = k; l < (k+3); l++) {
				arreglo3 [j] = arreglo2 [l];
				j++;
			}
			k+=3;
		}
		
		for (int i: arreglo3) {
			System.out.println(i);
		}
	}

}
