package flujoDeDatosEj10;

import javax.swing.JOptionPane;

public class flujoDeDatosEj10App {

	public static void main(String[] args) {
		String texto_1num = JOptionPane.showInputDialog("Introduce el numero de ventas ");
		int val1 = Integer.parseInt(texto_1num);
		int sumaTotalVentas = 0;
		
		int contadorVentas=1;
		while(contadorVentas<=val1) {
			String texto_2num = JOptionPane.showInputDialog("Introduce el valor de la venta nuero "+contadorVentas);
			int val2 = Integer.parseInt(texto_2num);
			sumaTotalVentas+=val2;
			contadorVentas++;
		}
		
		JOptionPane.showMessageDialog(null,"El valor total de las ventas es " +sumaTotalVentas);

	}

}
