package classes.curso.executa;

import java.util.Scanner;
import classes.curso.Aluno;

public class Programa {

	/*
	 * Equals e Hascode - diferenciar objetos
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		
		System.out.print("Qual o nome do aluno: ");
		aluno1.nome = sc.nextLine();
		
		System.out.print("Qual é a idade: ");	
		aluno1.idade = sc.nextInt();
		
		System.out.print("Qual a data de nascimento: ");	
		aluno1.dataNascimento = sc.next();
		
		System.out.print("Numero do RG: ");	
		aluno1.registroGeral = sc.next();
		
		System.out.print("Numero do CPF: ");
		aluno1.numeroCpf = sc.next();
	
		System.out.print("Nome da mãe: ");	
		aluno1.nomeMae = sc.next();
		
		System.out.print("Nome do pai: ");
		aluno1.nomePai = sc.next();
		
		System.out.print("Data da matrícula: ");
		aluno1.dataMatricula = sc.next();
		
		System.out.print("Série que está cursando: ");	
		aluno1.serieMatriculado = sc.next();
		
		System.out.print("Nome da escola: ");		
		aluno1.nomeEscola = sc.next();
		
		System.out.println("\nInforme as 4 notas: ");
		
		System.out.print("Disciplina 1: ");
		aluno1.setDisciplina1(sc.next());
		System.out.print("1a nota: ");				
		aluno1.setNota1(sc.nextDouble());
		
		System.out.print("Disciplina 2: ");
		aluno1.setDisciplina2(sc.next());
		System.out.print("2a nota: ");
		aluno1.setNota2(sc.nextDouble());
		
		System.out.print("Disciplina 3: ");
		aluno1.setDisciplina3(sc.next());
		System.out.print("3a nota: ");
		aluno1.setNota3(sc.nextDouble());
		
		System.out.print("Disciplina 4: ");
		aluno1.setDisciplina4(sc.next());
		System.out.print("4a nota: ");
		aluno1.setNota4(sc.nextDouble());
		
		System.out.println("====================================");

		System.out.println(aluno1.toString());
		System.out.println(aluno1.getSituacaoAluno());

		
	}
}
