package flujoDeDatosEj6;

import javax.swing.JOptionPane;

public class flujoDeDatosEj6App {

	public static void main(String[] args) {
		String texto_1num = JOptionPane.showInputDialog("Introduce el precio del producto ");
		int val1 = Integer.parseInt(texto_1num);
		final double IVA = 0.21;
		double precioFinal = val1+(val1*IVA);
		
		JOptionPane.showMessageDialog(null,"El precio final con IVA sera de "+precioFinal);
	}

}
