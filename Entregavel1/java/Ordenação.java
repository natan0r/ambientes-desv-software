package entregravel;

public class Ordenação {
	public static void main(String[] args) {
				
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) Math.floor(Math.random() * vetor.length);
			
		}
		System.out.println("Messy");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");	
		}
		quicksort(vetor, 0, vetor.length - 1);
		
		System.out.println("\n\nTidy up");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");	
		}
	}
	static void quicksort(int[] vetor, int left, int right) {
		if(left < right) {
			int p = piece(vetor, left, right);
			quicksort(vetor, left, p);
			quicksort(vetor, p + 1, right);	
		}
	}
	static int piece(int[] vetor, int left, int right) {
		int meio = (int) (left + right) / 2;
		int pivo = vetor[meio];
		int i = left - 1;
		int j = right + 1;
		
		while(true) {
			do {
				i++;
			} while(vetor[i] < pivo);
			do {
				j--;
			} while(vetor[j] > pivo);
				
				if(i >= j) {
					return j;	
				}
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
		}
}