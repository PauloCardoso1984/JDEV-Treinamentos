package entradaDeDados;

import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		
		// Entrada de Dados com Scanner
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("Qual a quantidade de carros: ");
		x = sc.nextInt();
		
		System.out.print("Dividir por quantas pessoas: ");
		y = sc.nextInt();
		
		int result = x / y;
		double result2 = x % y;
		
		System.out.println();
		System.out.println("A quantidade informada é : " + x);
		System.out.println("A quantidade de pessoas é : " + y);
		System.out.println("A divisão de carros será de: " + result);
		System.out.println("A sobra da divisão será de: " + result2);
		
		
		
		

	}
}
