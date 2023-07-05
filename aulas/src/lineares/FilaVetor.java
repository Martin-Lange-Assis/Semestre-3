package lineares;

public class FilaVetor<T> implements Fila<T> {
	private T[] vetor;
	private int inicio;
	private int limite;
	private int tamanho;

	@SuppressWarnings("unchecked")
	public FilaVetor(int limite) {
		super();
		this.vetor = (T[]) new Object[limite];
		this.setInicio(0);
		this.limite = limite;
		this.setTamanho(0);
	}

	public int getInicio() {
		return inicio;
	}

	private void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getLimite() {
		return limite;
	}

	public int getTamanho() {
		return tamanho;
	}

	private void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void inserir(T valor) {
		if (tamanho == limite) {
			throw new RuntimeException("Fila está cheia");
		}
		int posicaoInserir;
		posicaoInserir = (this.getInicio() + this.getTamanho()) % this.getLimite();
		vetor[posicaoInserir] = valor;
		this.tamanho++;
	}

	@Override
	public T peek() {
		if (this.estaVazia()) {
			throw new RuntimeException("Fila está vazia");
		}
		return vetor[inicio];
	}

	@Override
	public T retirar() {
		T valor = this.peek();
		this.vetor[this.inicio] = null;
		this.inicio = (this.inicio + 1) % this.limite;
		this.tamanho--;
		return valor;
	}

	@Override
	public boolean estaVazia() {
		return (tamanho == 0);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void liberar() {
		this.vetor = (T[]) new Object[this.limite];
		this.inicio = 0;
		this.tamanho = 0;
	}

	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < this.tamanho; i++) {
			str += this.vetor[(inicio + i) % limite] + ", ";
		}
		return str + "]";
	}

	public FilaVetor<T> concatenar(FilaVetor<T> outra) {
		FilaVetor<T> nova = new FilaVetor<>(this.limite + outra.getLimite());
		for (int i = 0; i < this.getTamanho(); i++) {
			nova.inserir(this.pegar(i));
		}
		for (int i = 0; i < outra.getTamanho(); i++) {
			nova.inserir(outra.pegar(i));
		}
		return nova;

	}

	private T pegar(int posicao) {
		if (posicao < 0 || posicao >= tamanho) {
			throw new IndexOutOfBoundsException("Posição = " + posicao);
		}
		return vetor[posicao];
	}

	public FilaVetor<T> dividir() {
		FilaVetor<T> dividida = new FilaVetor<>(limite);
		int metade = this.tamanho / 2;
		for (int i = metade; i < tamanho; i++) {
			dividida.inserir(vetor[i]);
		}
		this.tamanho = metade;
		return dividida;

	}

	public FilaVetor<T> copiar() {
		FilaVetor<T> outraFila = new FilaVetor<>(this.limite);
		for (int i = 0; i < tamanho; i++) {
			outraFila.inserir(vetor[i]);
		}
		return outraFila;

	}

}
