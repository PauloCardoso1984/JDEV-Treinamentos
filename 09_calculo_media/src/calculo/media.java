package calculo;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {

		// Entrada de Dados com Scanner
		Scanner sc = new Scanner(System.in);
		double x = 0, soma = 0;
		int y;

		System.out.print("Quantas notas deseja informar: ");
		y = sc.nextInt();

		for (int i = 0; i < y; i++) {
			System.out.print("Digite a " + (i + 1) + " nota: ");
			x = sc.nextDouble();
			soma += x;
		}

		double media = soma / y;
		System.out.println("A média das notas é: " + media + "\n");

		if (media > 50) {
			if (media > 70) {
				if (media > 90) {
					System.out.println("APROVADO - ALUNO MUITO BOM..");
				} else {
					System.out.println("APROVADO");
				}
			} else {
				System.out.println("APROVADO, PRECISA MELHORAR");
			}
		} else {
			System.out.println("REPROVADO");
		}

		sc.close();
	}
}