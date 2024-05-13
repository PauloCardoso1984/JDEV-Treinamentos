package for_;

public class for_ {

	public static void main(String[] args) {
		
		// Estrutura de repetição PROCURANDO POR UM ELEMENTO
		
		for (int numero = 10; numero >= 0; numero--) {	
			if (numero == 5) {
				System.out.println(numero);
				System.out.println("Numero encontrado.....");
				System.out.println("Sistema encerrado...");
				break;
			}			
		}
		System.out.println("\nSistema finalizado...");
	}
}
