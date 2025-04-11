package estaticodinamico;

import java.security.Identity;
import java.time.LocalDate;

public class Pessoa {
	
	//variável estática, pois está armazenada em memória stack
	private static int idContador = 0;
	
	//variáveis dinâmicas, pois estão armazenadas na memória em pilha heap
	//são variáveis de instâncias
	private int id;
	private String nome;
	private int idade;
	private String dataNascimento;
	
	//Demais métodos e construtor são dinâmicos, pois operam sobre objetos
	public Pessoa(String nome, int idade, String dataNascimento) {
		super();
		this.id = idContador++;
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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

	@Override
	public String toString() {
		return "["+ "id= " + id + " nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + "]";
	}
	
	
}
