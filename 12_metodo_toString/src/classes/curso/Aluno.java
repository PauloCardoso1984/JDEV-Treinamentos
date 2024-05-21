package classes.curso;

/* Classe/Objeto que representa o Aluno*/
public class Aluno {

	// Atributos
	public String nome;
	public int idade;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	public String dataNascimento;
	public String registroGeral;
	public String numeroCpf;
	public String nomeMae;
	public String nomePai;
	public String dataMatricula;
	public String nomeEscola;
	public String serieMatriculado;

	public Aluno() {

	}

	public Aluno(String nome, int idade, String dataNascimento, String registroGeral, String numeroCpf, String nomeMae,
			String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado) {
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.registroGeral = registroGeral;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;

	}

	/*
	 * Get e Set Set -> é para dicionar ou receber dados para os atributos Get -> é
	 * para regatar ou obter informações sobre valores atribuidos
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	// MÉTODO
	// Calcular média do aluno
	public double getMediaNota() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	public String getSituacaoAluno() {
		double media = this.getMediaNota();
		if (media >= 1) {
			if (media >= 5) {
				if (media >= 7) {
					if (media >= 9) {
						return "Aluno APROVADO - Excelente";
					} else {
						return "Aluno APROVADO";
					}
				} else {
					return "ALuno em recuperação";
				}
			} else {
				return "REPROVADO";
			}
		} else {
			return "Analise";
		}
	}

	public boolean getSituacaoAluno2() {
		double media = this.getMediaNota();
		if (media >= 6) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Aluno: " + getNome() + "\nMatriculado: " + getDataMatricula() + "\nEscola: " + getNomeEscola()
				+ "\nSituação: " + getSituacaoAluno();
	}
}
