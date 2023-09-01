import javax.swing.JOptionPane;
public class Ejercicio5 {
	
	public static void main (String args[]) {
		
		
		int arreglo1 [], arreglo2 [], arreglo3[];
		
		arreglo1 = new int [10];
		arreglo2 = new int [10];
		arreglo3 = new int [20];
		
		
		for (int i = 0; i < 10; i ++) {
			arreglo1 [i] = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "Digite un número: "));
		} 
		for (int i = 0; i < 10; i ++) {
			arreglo2 [i] = Integer.parseInt(JOptionPane.showInputDialog((i+1) + "Digite un número: "));
		}
		
		int j = 0; 
		for (int i = 0; i <20; i+=2) {
			arreglo3 [i] = arreglo1[j];
			arreglo3 [i+1] = arreglo2[j];
			j++;
					
		}
		
		for (int k: arreglo3) {
			System.out.println(k);
		}
		
		
	}

}
