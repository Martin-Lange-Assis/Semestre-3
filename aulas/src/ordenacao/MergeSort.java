package ordenacao;

public class MergeSort {
	public void merge(int vet[], int esquerda, int meio, int direita) {
		int n1 = meio - esquerda + 1;
		int n2 = direita - meio;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = vet[esquerda + i];
		for (int j = 0; j < n2; ++j)
			R[j] = vet[meio + 1 + j];
		int i = 0, j = 0;
		int k = esquerda;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				vet[k] = L[i];
				i++;
			} else {
				vet[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			vet[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			vet[k] = R[j];
			j++;
			k++;
		}
	}

	public void ordenar(int vet[], int esquerda, int direita) {
		if (esquerda < direita) {
			int m = (esquerda + direita) / 2;
			ordenar(vet, esquerda, m);
			ordenar(vet, m + 1, direita);
			merge(vet, esquerda, m, direita);
		}
	}
}
