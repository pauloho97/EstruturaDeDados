package estaticodinamico;

import java.time.LocalDate;
import java.util.Scanner;

public class ProgramaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int opc;

		do {
			// Todas as variáveis que estão armazenando os dados para o objeto são dinâmicas
			// armazenadas em memória heap
			System.out.println("Diga seu nome: ");
			String nome = scanner.nextLine();

			System.out.println("Diga sua idade: ");
			int idade = scanner.nextInt();

			// limpa memória
			scanner.nextLine();

			System.out.println("Diga seu ano de nascimento, formato dd/mm/aaaa: ");
			String dataDeNascimento = scanner.nextLine();

			// Estático, pois como é definida a variável, ela é armazenada na pilha stack
			String texto = "Seus dados são: ";

			// objetos são alocados na memória heap, sendo dinâmicos
			Pessoa pessoa = new Pessoa(nome, idade, dataDeNascimento);
			System.out.println(texto + pessoa);

			System.out.println("\nDeseja cadastrar mais pessoas? se sim digite 1");
			System.out.println("Se não, digite qualquer tecla");
			opc = scanner.nextInt();
			
			// limpa memória
			scanner.nextLine();
			
		} while (opc == 1);
		
		scanner.close();
	}
}
