package lineares;

public class ListaEstatica<T> implements Lista<T> {
	private T[] info;
	private int tamanho;
	
	public ListaEstatica() {
		this.info = (T[]) new Object[10];
		this.tamanho = 0;
	}
	
	@Override
	public void inserir(T valor) {
		if (tamanho == info.length) {
			this.redimensionar();
		}
		info[tamanho] = valor;
		tamanho++;
	}

	private void redimensionar() {
		T[] novo = (T[]) new Object[tamanho + 10];
		for (int i=0; i < tamanho; i++) {
			novo[i] = info[i];
		}
		info = novo;
	}
	
	@Override
	public int buscar(T valor) {
		for (int i=0; i < tamanho; i++) {
			if (info[i].equals(valor)) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public void retirar(T valor) {
		int pos = this.buscar(valor);
		if (pos != -1) {
			for (int i=pos; i < tamanho-1; i++) {
				info[i] = info[i+1];
			}
			tamanho--;
		}
	}
	
	@Override
	public String exibir() {
		String str = "[";
		for (int i=0; i < tamanho; i++) {
			str += info[i]+", ";
		}
		return str+"]";
	}
	
	@Override
	public Lista<T> copiar() {
		Lista<T> outra = new ListaEstatica<>();
		for (int i=0; i < tamanho; i++) {
			outra.inserir(info[i]);
		}
		return outra;
	}
	
	@Override
	public int getTamanho() {
		return this.tamanho;
	}
	
	@Override
	public T pegar(int pos) {
		if (pos <0 || pos >= tamanho) {
			throw new IndexOutOfBoundsException("Pos = "+pos);
		}
		return info[pos];
	}
	
	@Override
	public void concatenar(Lista<T> outra) {
		for (int i=0; i < outra.getTamanho(); i++) {
			this.inserir(outra.pegar(i));
		}
	}
	
	@Override
	public boolean estaVazia() {
		return (tamanho == 0);
	}
	
	@Override
	public Lista<T> dividir() {
		Lista<T> dividida = new ListaEstatica<>();
		int metade = this.tamanho / 2;
		for (int i = metade; i < tamanho; i++) {
			dividida.inserir(info[i]);
		}
		this.tamanho = metade;
		return dividida;
	}
}