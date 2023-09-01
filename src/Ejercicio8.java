import java.util.Scanner;
public class Ejercicio8 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner (System.in);
		
		int arreglo []= new int [10];
		int num, pos;
		
		System.out.println("llenado del arreglo");
		for (int i = 0; i <8; i++) {
			System.out.print((i+1) + ".- Digite un numero: ");
			arreglo[i] = entrada.nextInt();
		}
		
		int i = 0; 
		
		while (i < 2) {
			System.out.print("Digite un número: ");
			num = entrada.nextInt();
			
			System.out.print("Digite la posicion en la que desea ingresar el número;");
			pos = entrada.nextInt();
			
			for (int j= 9; j > (pos-1); j-- ) {
				arreglo [j] = arreglo [j-1];
			}
			
			arreglo[pos-1] = num;
			
			i++;
		
			
		}
		
		for (int k: arreglo) {
			System.out.println(k);
		}
		
		
	}
	

}
