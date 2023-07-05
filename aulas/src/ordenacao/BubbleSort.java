package ordenacao;

public class BubbleSort<T extends Comparable<T>> implements Sort<T> {

	@Override
	public void sort(T[] vetor) {
		boolean troca;
		for (int i = 0; i < vetor.length - 1; i++) {
			troca = false;
			for (int j = 0; j < vetor.length - i - 1; j++) {
				if (vetor[j].compareTo(vetor[j + 1]) > 0) {
					T bubble = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = bubble;
					troca = true;
				}
			}
			if (!troca) {
				return;
			}
		}

	}

}




































//INVERTER

/*
 * @Override
	public void sort(T[] vetor) {
		boolean troca;
		for (int i = 0; i < vetor.length - 1; i++) {
			troca = false;
			for (int j = 0; j < vetor.length - i - 1; j++) {
				if (vetor[j].compareTo(vetor[j + 1]) < 0) {
    T bubble = vetor[j];
    vetor[j] = vetor[j + 1];
    vetor[j + 1] = bubble;
    troca = true;
}

			}
			if (!troca) {
				return;
			}
		}*/
