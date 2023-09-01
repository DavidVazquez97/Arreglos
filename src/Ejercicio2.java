import javax.swing.JOptionPane;
public class Ejercicio2 {
	
	public static void main (String args []) {
		
		int arreglo [] = new int [5];
		
		for (int i = 0; i < 5 ; i ++) {
			arreglo [i] = Integer.parseInt(JOptionPane.showInputDialog((i+1) + ".- digite un numero: "));
		}
		
		for (int j = 5; j > 0; j --) {
			System.out.println(j);
			
		}
		
	}

}
