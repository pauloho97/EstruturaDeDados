package estrutura_de_dados_aula04;

public class BinarySearch {

	public static int binarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		int left = 0, right = arr.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if(arr[mid] == target) {
				return mid; // elemento encontrado, retorna o indice
			} else if(arr[mid] < target) {
				left = mid + 1; // busca na metade direita
			} else {
				right = mid - 1; // busca na metade esquerda
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		int[] lista = {1,3,5,10,9,11}; // lista ordenada
		int alvo = 9;
		
		int resultado = binarySearch(lista,alvo);
		
		if(resultado != -1) {
			System.out.println("elemento encontrado no indice: " + resultado);
			
		}else {
			System.out.println("elemento não encontrado ");
		}
		
	}
	

}
