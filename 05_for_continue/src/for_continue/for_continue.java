package for_continue;

public class for_continue {

	public static void main(String[] args) {
		
		// Estrutura de repetição For e Continue
		
		for (int numero = 0; numero <= 25; numero++) {	
			if (numero == 5 || numero == 12 || numero == 20) {
				System.out.print(numero);
				System.out.println(" - Numero encontrado => " + numero);
				continue;
			}			
		}
		System.out.println("\nSistema finalizado...");
	}
}
