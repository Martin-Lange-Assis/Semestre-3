package busca;

public class Buscador<T extends Comparable<T>> {
	public int pesquisaLinear(T vetor[], T chave) {
		for (int i = 0; i < vetor.length; i++) {
			if (chave.equals(vetor[i])) {
				return i;
			}
		}
		return -1;
	}

	public int pesquisaBinaria(T vetor[], T chave) {
		int inicio = 0;
		int fim = vetor.length - 1;
		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;
			if (chave.compareTo(vetor[meio]) < 0) {
				fim = meio - 1;
			} else {
				if (chave.compareTo(vetor[meio]) > 0) {
					inicio = meio + 1;
				} else {
					return meio;
				}
			}
		}
		return -1;
	}
}
