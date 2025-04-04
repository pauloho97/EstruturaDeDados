package estrutura_de_dados_aula04;



public class BinarySearch {
								 // arr é o array - target é o número desejado na busca
	public static int binarySearch(int[] arr, int target) {
		// a esquerda começa com índice 0 a direita começa com o último índice
		int left = 0, right = arr.length - 1;
		
		//enquanto os num da esquerda foram maiores ou igual aos números da direita
		while (left <= right) {
			
			//fórmula para calcular um índice do meio - mid = meio
			int mid = left + (right - left) / 2;
			
			// se caso o número do meio for o procurado
			if(arr[mid] == target) {
				return mid; // elemento encontrado, retorna o indice
				
			// se o valor do indice do meio for menor que o numero procurado ele procura a partir dos números a direita da lista
			} else if(arr[mid] < target) {
				left = mid + 1; // busca na metade direita
			} else {
				//Aqui se o número procurado for menor que o valor do número no meio, ele procura a partir da esquerda
				right = mid - 1; // busca na metade esquerda
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//Na fórmula do mid é: 0+5/2 = 2.5 - porém em java se arredonda para baixo, ficando o mid em índice 2
		int[] lista = {1,3,5,9,10,11}; // lista ordenada
		int alvo = 9;
		
		int resultado = binarySearch(lista,alvo);
		
		if(resultado != -1) {
			System.out.println("elemento encontrado no indice: " + resultado);
			
		}else {
			System.out.println("elemento não encontrado ");
		}
		
	}
	

}
