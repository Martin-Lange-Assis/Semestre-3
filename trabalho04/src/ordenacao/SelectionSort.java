// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis

package ordenacao;

public class SelectionSort<T extends Comparable<T>> implements Sort<T> {

	@Override
	public void sort(T[] vetor) {

		int posicaoMenor;
		T aux;
		for (int i = 0; i < vetor.length; i++) {
			posicaoMenor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j].compareTo(vetor[posicaoMenor]) < 0) {
					posicaoMenor = j;
				}

			}
			aux = vetor[posicaoMenor];
			vetor[posicaoMenor] = vetor[i];
			vetor[i] = aux;
		}

	}

}
