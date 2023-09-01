import java.util.Scanner;
public class Ejercicio4 {
	
	public static void main (String args []) {
		
		Scanner entrada = new Scanner(System.in);
		
		int arreglo [] = new int [10];
		
		for (int i = 0; i < 10; i++ ) {
			System.out.print((i+1) + ".-Digite un número: ");
			arreglo[i] = entrada.nextInt();
		}
		
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(arreglo[i]);
			System.out.println(arreglo[9-i]);
		}
		
	}

}
