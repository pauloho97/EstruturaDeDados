package estrutura_de_dados_exercicio_aula04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int valor;
		int[] vetor = null;
		String textoOrdemVetores = "";
		int numeroBuscado;

		System.out.println("\t\t\t\t\t\tPrograma para vetores - busca do elemento e índice\n");
		System.out.println(
				"digite quantos elementos deseja no vetor - Regra deve ser entre 5 a 25 elementos e interios: ");
		valor = scan.nextInt();

		if (valor < 5 || valor > 25) {
			System.out.println("valor do vetor não pode ser menor que 5 ou maior que 25");
		} else {
			vetor = new int[valor];

			// Texto para as ordens (primeiro, segundo, etc)
			String[] TextoVetoresEmordens = { "primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo",
					"oitavo", "nono", "décimo", "décimo primeiro", "décimo segundo", "décimo terceiro", "décimo quarto",
					"décimo quinto", "décimo sexto", "décimo sétimo", "décimo oitavo", "décimo nono", "vigésimo",
					"vigésimo primeiro", "vigésimo segundo", "vigésimo terceiro", "vigésimo quarto",
					"vigésimo quinto" };

			for (int i = 0; i < vetor.length; i++) {
				System.out.println("Digite o " + TextoVetoresEmordens[i] + " Valor");
				vetor[i] = scan.nextInt();
			}

			System.out.println("Números em ordem crescente: ");
			Arrays.sort(vetor);
			for (int vet : vetor) {
				System.out.println(vet);
			}
		}

		System.out.println("Digite o numero da lista ao qual deseja saber o seu índice: ");
		numeroBuscado = scan.nextInt();

		if (vetorBuscado(vetor, numeroBuscado) == -1) {
			System.out.println("Número buscado não está na lista");
		} else {
			System.out.println(
					"Numero buscado é: " + numeroBuscado + "\nSeu ínice é: " + vetorBuscado(vetor, numeroBuscado));
		}

	}

	public static int vetorBuscado(int[] vetor, int numeroBuscado) {

		int numerosAhEsquerda = 0;// variável retorna o inicio da lista até o meio (esquerda)
		int numerosAhDireita = vetor.length - 1; // variável retorna o fim da lista até o meio (direita)

		int numeroDoMeio;// variável calcula o nu´mero do meio da lista.

		// Enquanto os numeros da esquerda são menores que da direita
		while (numerosAhEsquerda <= numerosAhDireita) {
			numeroDoMeio = (numerosAhEsquerda + numerosAhDireita) / 2;

			if (vetor[numeroDoMeio] == numeroBuscado) {
				return numeroDoMeio;// Significa que o número buscado está exatamente no meio
			}

			// se número do meio for menor que o número buscado
			if (vetor[numeroDoMeio] < numeroBuscado) {
				numerosAhEsquerda = numeroDoMeio + 1;// busca os números a direita
			} else {
				// se número do meio for maior que o número buscado
				numerosAhDireita = numeroDoMeio - 1;// busca os números do lado da esquerda
			}

		}

		// retorno -1 em programação significa saída inválida
		return -1;
	}

}
