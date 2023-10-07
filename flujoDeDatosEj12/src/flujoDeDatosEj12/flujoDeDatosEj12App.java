package flujoDeDatosEj12;

import javax.swing.JOptionPane;

public class flujoDeDatosEj12App {

	public static void main(String[] args) {
		
		int numeroDeIntentos = 3;
		int controladorNumeroDeIntentos =0;
		boolean contrasenyaCorrecta = false;
		
		String texto_contrasenya = JOptionPane.showInputDialog("Introduce tu contraseña ");
		System.out.println(texto_contrasenya);
		
		while(!contrasenyaCorrecta && numeroDeIntentos>controladorNumeroDeIntentos) {
			String texto_contrasenyaCorrecta = JOptionPane.showInputDialog("Introduce otra vez la misma contraseña ");
			System.out.println(texto_contrasenyaCorrecta);
			
			if(texto_contrasenya.equals(texto_contrasenyaCorrecta)) {
				contrasenyaCorrecta = true;
				JOptionPane.showMessageDialog(null,"La contraseña " +texto_contrasenyaCorrecta+ " es la correcta");
				
			}else if(!texto_contrasenyaCorrecta.equals(texto_contrasenya)) {
				numeroDeIntentos--;
				JOptionPane.showMessageDialog(null,"La contraseña " +texto_contrasenyaCorrecta+ " es incorrecta, te quedan " +numeroDeIntentos+" numero de intentos");
			}
		}
		if(contrasenyaCorrecta==true) {
			JOptionPane.showMessageDialog(null,"Enhorabuena!");
		}else if(contrasenyaCorrecta == false) {
			JOptionPane.showMessageDialog(null,"Se acabaron los intentos, prueba otra vez");
		}
	}

}
