import java.util.Scanner;
public class Ejercicio3 {
	
	public static void main (String args []) {
		
		Scanner entrada = new Scanner (System.in);
		
		int arreglo [], cpos = 0, cneg = 0, cceros = 0,spos = 0, sneg= 0;
		float mpos, mneg;
		
		
		arreglo = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite un número: ");
			arreglo[i] = entrada.nextInt();
			
			if (arreglo[i] < 0) {
				cneg++;
				sneg += arreglo[i];
			}
			
			else if (arreglo[i]>0) {
				cpos ++;
				spos += arreglo[i];
			}
			else {
				cceros ++;
			}
			
		}
		
		if (cneg == 0) {
			System.out.println("No se ingresaron número negatios.");
			
		}
		
		else {
			mneg = (float) sneg/cneg;
			System.out.println("La media de los números negativos es: " + mneg);
		}
		
		if (cpos == 0) {
			System.out.println("No se ingresaron número positivos. ");
			
		}
		
		else {
			mpos = (float) spos/cpos;
			System.out.println("La media de los número positivos es: " + mpos);
		}
		
		System.out.println("Usted ha ingresado: " + cceros + " ceros.");
		
	}

}
