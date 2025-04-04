package estrutura_de_dados_vetores_com_objeto;

import java.util.Arrays;
import java.util.Scanner;

public class VetorBusca {
	private int[] vetor;

	// Construtor que recebe o tamanho do vetor
	public VetorBusca(int tamanho) {
		this.vetor = new int[tamanho];
	}

//Método para preecher o vetor com valores fornecidos pelo usário
	public void preencherVetor(Scanner scanner) {
		System.out.println("Digite os " + vetor.length + "numero inteiros do vetor: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Elemento " + (i + 1) + ": ");
			vetor[i] = scanner.nextInt();
		}
		Arrays.sort(vetor);// Ordenar o vetor automaticamente
	}

//Método para exibir o vetor ordenado
	public void exibirVetor() {
		System.out.println("Vetor ordenado " + Arrays.toString(vetor));
	}

	// Método que implementa a busca binária
	public int buscaBinaria(int chave) {
		int inicio = 0, fim = vetor.length - 1;
		while (inicio <= fim) {
			int meio = inicio + (fim - inicio) / 2;
			if (vetor[meio] == chave) {
				return meio;
			} else if (vetor[meio] < chave) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		return -1;
	}
}