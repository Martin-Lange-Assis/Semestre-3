package lineares;

public class PilhaLista<T> implements Pilha<T> {
	private ListaEncadeada<T> lista;

	public PilhaLista() {
		super();
		this.lista = new ListaEncadeada<>();
	}

	@Override
	public void push(T v) {
		lista.inserir(v);

	}

	@Override
	public T pop() {
		T valor;
		valor = lista.pegar(lista.getTamanho() - 1);
		lista.retirar(valor);
		return valor;
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new RuntimeException("Pilha está vazia");
		}
		return lista.pegar(lista.getTamanho() - 1);
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public void liberar() {
		while (!estaVazia()) {
			this.pop();
		}

	}

	public int getTamanho() {
		return lista.getTamanho();
	}

	@Override
	public String toString() {
		return "PilhaLista [lista=" + lista.exibir() + "]";
	}

}
