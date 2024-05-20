package classes.curso.executa;

import java.util.Scanner;
import classes.curso.Aluno;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluno aluno1 = new Aluno();
		aluno1.setNome("Paulo");
		aluno1.setIdade(25);
		aluno1.setDataNascimento("18/02/1984");
		aluno1.setRegistroGeral("48484757557");
		aluno1.setNumeroCpf("2314324235533");
		aluno1.setNomeMae("Eueueueueue");
		aluno1.setNomePai("Paulo Cardoso");
		aluno1.setDataMatricula("01/01/2024");
		aluno1.setSerieMatriculado("9");
		aluno1.setNomeEscola("Hélio Cerqueira Leite");

		System.out.println("Informe as 4 notas: ");
		System.out.print("1a nota: ");
		aluno1.setNota1(sc.nextDouble());
		System.out.print("2a nota: ");
		aluno1.setNota2(sc.nextDouble());
		System.out.print("3a nota: ");
		aluno1.setNota3(sc.nextDouble());
		System.out.print("4a nota: ");
		aluno1.setNota4(sc.nextDouble());

		System.out.println("\nNome: 		" + aluno1.getNome());
		System.out.println("Nascimento: 	" + aluno1.getDataNascimento());
		System.out.println("Média: 		" + aluno1.getMediaNota());
		System.out.println("Situação1: 	" + aluno1.getSituacaoAluno());
		System.out.println("Situação2: 	" + (aluno1.getSituacaoAluno2() ? "Aprovado" : "Reprovado")); // OPERADOR TERNÁRIO
		
		System.out.println("====================================");

		sc.close();
	}

}
