package ordenacao;

public class QuickSort {
	public int dividir(int vet[], int menor, int maior) {
		int pivo = vet[maior];
		int i = (menor - 1);
		for (int j = menor; j < maior; j++) {
			if (vet[j] <= pivo) {
				i++;
				int temp = vet[i];
				vet[i] = vet[j];
				vet[j] = temp;
			}
		}
		int temp = vet[i + 1];
		vet[i + 1] = vet[maior];
		vet[maior] = temp;
		return i + 1;

	}

	public void ordenar(int vet[], int menor, int maior) {
		if (menor < maior) {
			int pi = dividir(vet, menor, maior);
			ordenar(vet, menor, pi - 1);
			ordenar(vet, pi + 1, maior);
		}
	}
}
