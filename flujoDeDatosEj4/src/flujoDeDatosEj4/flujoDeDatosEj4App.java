package flujoDeDatosEj4;

import javax.swing.JOptionPane;

public class flujoDeDatosEj4App {

	public static void main(String[] args) {
		
		String texto_1num = JOptionPane.showInputDialog("Introduce el radio del circulo ");
		double val1 = Double.parseDouble(texto_1num);
		double radio1= Math.pow(val1, 2);
		double resultado1 = Math.PI*radio1;
		JOptionPane.showMessageDialog(null,"El area del circulo es "+ resultado1);
	}

}
