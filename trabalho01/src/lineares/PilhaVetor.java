// Andre Heller E Martin Lange de Assis
package lineares;

import java.util.Arrays;

public class PilhaVetor<T> implements Pilha<T> {
	private T[] info;
	private int limite;
	private int tamanho;

	@SuppressWarnings("unchecked")
	public PilhaVetor(int limite) {

		this.info = ((T[]) new Object[limite]);
		this.setLimite(limite);
		this.setTamanho(0);
	}

	@Override
	public String toString() {
		return "PilhaVetor [info=" + Arrays.toString(info) + ", limite=" + limite + ", tamanho=" + tamanho + "]";
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void push(T v) {
		if (tamanho == limite) {
			throw new IllegalArgumentException("Expressao incoreta");
		} else {
			info[tamanho] = v;
			tamanho++;
		}

	}

	@Override
	public T pop() {
		if (tamanho != 0) {
			T retorno = info[tamanho - 1];
			info[tamanho - 1] = null;
			tamanho--;
			return retorno;
		}
		return null;

	}

	@Override
	public T peek() {
		if (tamanho != 0) {
			T topo = info[tamanho - 1];
			return topo;
		}

		return null;
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
		this.setTamanho(0);

	}

}
