package estrutura_de_dados_aula04;

public class BinarySearch2 {
	
	public static int searchInteractive(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		
		// enquanto o intervalo de busca não estiver vazio
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(key < a[mid]) {
				high = mid - 1;
			}
			
			else if (key > a[mid]) {
				low = mid + 1;
			}
			
			else {
				return mid;
			}
		}
		
		return -1;
	}
}
