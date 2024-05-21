package classes.curso.executa;

import java.util.Scanner;
import classes.curso.Aluno;

public class Programa {

	/*
	 * Equals e Hascode - diferenciar objetos
	 */
	public static void main(String[] args) {

		// Forma - Usando o método Equals e Hascode dentro da classe Aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Paulo");
		aluno1.setNumeroCpf("123456");
		aluno1.setRegistroGeral("54321");

		Aluno aluno2 = new Aluno();
		aluno2.setNome("Paulo");
		aluno2.setNumeroCpf("123456");
		aluno2.setRegistroGeral("4321");

		if (aluno1.equals(aluno2)) {
			System.out.println("É o mesmo aluno.");
		} else {
			System.out.println("Alunos diferentes.");
		}
	}
}
