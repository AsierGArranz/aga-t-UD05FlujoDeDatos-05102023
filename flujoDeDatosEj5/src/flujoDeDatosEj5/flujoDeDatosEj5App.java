package flujoDeDatosEj5;

import javax.swing.JOptionPane;

public class flujoDeDatosEj5App {

	public static void main(String[] args) {
		String texto_1num = JOptionPane.showInputDialog("Introduce un numero para saber si es divisible entre 2 ");
		int val1 = Integer.parseInt(texto_1num);
		if(val1%2 ==0) {
			JOptionPane.showMessageDialog(null,"El numero "+ val1 + " SI es divible entre 2");
		} else {
			JOptionPane.showMessageDialog(null,"El numero "+ val1 + " NO es divible entre 2");
		}

	}

}
