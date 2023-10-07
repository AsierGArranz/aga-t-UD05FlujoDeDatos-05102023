package flujoDeDatosEj9;

public class flujoDeDatosEj9App {

	public static void main(String[] args) {
		
		for(int contador100 = 1; contador100 <=100;) {
			if(contador100%2 ==0) {
				System.out.println(contador100);
			}else if(contador100%3 ==0){
				System.out.println(contador100);
			}
			contador100++;
		}
	}

}
