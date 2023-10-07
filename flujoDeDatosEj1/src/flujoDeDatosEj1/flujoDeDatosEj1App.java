package flujoDeDatosEj1;
import javax.swing.JOptionPane;

public class flujoDeDatosEj1App {

	public static void main(String[] args) {
		
		String texto_1num = JOptionPane.showInputDialog("Introduce el primer valor ");
		int val1 = Integer.parseInt(texto_1num);
		String texto_2num = JOptionPane.showInputDialog("Introduce el segundo valor ");
		int val2 = Integer.parseInt(texto_2num);
		
		if (val1 > val2) {
			System.out.println("El primer valor es mayor que el segundo");
		}else if(val2 > val1){
			System.out.println("El segundo valor es mayor que el primero");
		}else if(val1 == val2) {
			System.out.println("Tienen el mismo valor");
		}

	}

}
