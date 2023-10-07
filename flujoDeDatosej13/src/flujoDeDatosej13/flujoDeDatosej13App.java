package flujoDeDatosej13;

import javax.swing.JOptionPane;

public class flujoDeDatosej13App {

	public static void main(String[] args) {
		
		double resultado = 0;

		String texto_1num = JOptionPane.showInputDialog("Introduce el primer valor ");
		int val1 = Integer.parseInt(texto_1num);
		String texto_2num = JOptionPane.showInputDialog("Introduce el segundo valor ");
		int val2 = Integer.parseInt(texto_2num);
		String texto_math = JOptionPane.showInputDialog("Elije: sumar(+), resta(-), multiplicar(*), dividir(/), elevar(^), modulo(%)");
		switch(texto_math) {
			case "+":
			case "sumar":
				resultado = val1+val2;
				JOptionPane.showMessageDialog(null,"El resultado de la suma es "+resultado);
				break;
			case "-":
			case "resta":
				resultado = val1-val2;
				JOptionPane.showMessageDialog(null,"El resultado de la resta es "+resultado);
				break;
			case "*":
			case "multiplicar":
				resultado = val1*val2;
				JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es "+resultado);
				break;
			case "/":
			case "dividir":
				resultado = val1/val2;
				JOptionPane.showMessageDialog(null,"El resultado de la division es "+resultado);
				
				break;
			case "^":
			case "elevar":
				resultado= Math.pow(val1, val2);
				JOptionPane.showMessageDialog(null,"El valor "+val1+" elevado al valor " +val2+" es igual a "+resultado);
				
				break;
			case "%":
			case "modulo":
				resultado = val1%val2;
				JOptionPane.showMessageDialog(null,"El resultado del modulo es "+resultado);
				
				break;
				default:
					JOptionPane.showMessageDialog(null,"El valor introducido no es correcto, pruebe otra vez");
				
		}

	}

}
