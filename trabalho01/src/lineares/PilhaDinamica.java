// Andre Heller E Martin Lange de Assis
package lineares;

public class PilhaDinamica<T> implements Pilha<T> {
	private int contador;
	private ListaEncadeada<T> lista;

	public PilhaDinamica() {
		super();
		this.lista = new ListaEncadeada<>();
		this.contador = 0;
	}

	@Override
	public void push(T valor) {
		lista.inserir(valor);
		contador++;
	}

	@Override
	public T pop() {
		T valor;
		valor = lista.pegar(lista.getTamanho() - 1);
		lista.retirar(valor);
		contador--;
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
		return contador;
	}

}
