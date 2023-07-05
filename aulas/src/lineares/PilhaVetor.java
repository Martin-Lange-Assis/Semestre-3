package lineares;

import java.util.Arrays;

public class PilhaVetor<T> implements Pilha<T> {
	private int limite;
	private int tamanho;
	private T[] info;

	@SuppressWarnings("unchecked")
	public PilhaVetor(int limite) {
		super();
		this.limite = limite;
		this.tamanho = 0;
		this.info = (T[]) new Object[limite];
	}

	@Override
	public void push(T v) {
		if (limite == tamanho) {
			throw new RuntimeException("Capacidade esgotada da pilha");
		}
		info[tamanho] = v;
		tamanho++;
	}

	@Override
	public T pop() {
		if (estaVazia()) {
			throw new RuntimeException("Pilha vazia");
		}
		T valor = info[tamanho - 1];
		info[tamanho - 1] = null;
		tamanho--;
		return valor;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new RuntimeException("Pilha está vazia");
		}
		return info[tamanho - 1];
	}

	@Override
	public boolean estaVazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}

	@Override
	public void liberar() {
		for (int i = 0; i < tamanho; i++) {
			info[i] = null;
		}
		tamanho = 0;
	}

	@Override
	public String toString() {
		return "PilhaVetor [limite=" + limite + ", tamanho=" + tamanho + ", info=" + Arrays.toString(info) + "]";
	}

	public int compara(PilhaVetor<T> outraPilha) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.info[i].equals(outraPilha.info[i])) {
				return 0;
			}
			if (this.tamanho < outraPilha.tamanho) {
				return -1;
			}
			if (this.tamanho > outraPilha.tamanho) {
				return 1;
			}
		}

		return 0;

	}

}
