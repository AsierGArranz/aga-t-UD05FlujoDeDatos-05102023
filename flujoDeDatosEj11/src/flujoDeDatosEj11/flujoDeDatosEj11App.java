package flujoDeDatosEj11;

import javax.swing.JOptionPane;

public class flujoDeDatosEj11App {

	public static void main(String[] args) {
		
		String texto_diaSemana = JOptionPane.showInputDialog("Introduce el dia quieres saber si es dia laboral ");
		int val1 = Integer.parseInt(texto_diaSemana);
		
		switch(val1) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia laboral");
			break;
		case 6:
		case 7:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia festivo");
			break;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia laboral");
			break;
		case 13:
		case 14:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia festivo");
			break;
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia laboral");
			break;
		case 20:
		case 21:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia festivo");
			break;
		case 22:
		case 23:
		case 24:
		case 25:
		case 26:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia laboral");
			break;
		case 27:
		case 28:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia festivo");
			break;
		case 29:
		case 30:
		case 31:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" es un dia laboral");
			break;	
		default:
			JOptionPane.showMessageDialog(null,"El dia " +val1+" NO es un dia valido, introduce entre 1 y 31");
		
		}
	}

}
