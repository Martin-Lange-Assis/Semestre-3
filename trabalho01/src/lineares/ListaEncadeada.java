package lineares;

public class ListaEncadeada<T> implements Lista<T> {
	private NoLista<T> primeiro;
	private NoLista<T> ultimo;
	private int qtdeElementos;

	@Override
	public void inserir(T valor) {
		NoLista<T> novo = new NoLista<>();
		novo.setInfo(valor);
		if (this.estaVazia()) {
			primeiro = novo;
		} else {
			ultimo.setProx(novo);
		}
		ultimo = novo;
		qtdeElementos++;
	}

	@Override
	public int buscar(T valor) { 
		NoLista<T> p = primeiro;
		int contador = 0;
		while (p != null) {
			if (p.getInfo().equals(valor)) {
				return contador;
			}
			contador++;
			p = p.getProx();
		}
		return -1;
	}

	@Override
	public void retirar(T valor) {
		NoLista<T> p = this.primeiro;
		NoLista<T> anterior = null;

		while (p != null && !p.getInfo().equals(valor)) {
			anterior = p;
			p = p.getProx();
		}

		if (p != null) {
			if (anterior == null) {
				this.primeiro = p.getProx();
			} else {
				anterior.setProx(p.getProx());
			}
			if (this.ultimo == p) {
				this.ultimo = anterior;
			}
			this.qtdeElementos--;
		}
	}

	@Override
	public String exibir() {
		NoLista<T> p = primeiro;
		String msg = "[";
		while (p != null) {
			msg = msg + p.getInfo() + ", ";
			p = p.getProx();
		}
		return msg + "]";
	}

	@Override
	public Lista<T> copiar() {
		ListaEncadeada<T> nova = new ListaEncadeada<>();
		NoLista<T> p = primeiro;
		while (p != null) {
			nova.inserir(p.getInfo());
			p = p.getProx();
		}
		return nova;
	}

	@Override
	public int getTamanho() {
		return this.qtdeElementos;
	}

	@Override
	public T pegar(int pos) {
		if (pos < 0 || pos >= this.qtdeElementos) {
			throw new IndexOutOfBoundsException("Quantidade ou Ordem dos Operandos Invalidas ");
		}
		NoLista<T> p = this.primeiro;
		for (int i=0; i < pos; i++) {
			p = p.getProx();
		}
		return p.getInfo();
	}

	@Override
	public void concatenar(Lista<T> outra) {
		for (int i = 0; i < outra.getTamanho(); i++) {
			this.inserir(outra.pegar(i));
		}
	}

	@Override
	public boolean estaVazia() {
		return (primeiro == null);
	}

	@Override
	public Lista<T> dividir() {
		ListaEncadeada<T> dividida = new ListaEncadeada<>();
		if (this.qtdeElementos < 2) {
			return dividida;
		}
		int metade = this.qtdeElementos / 2;
		NoLista<T> p = this.primeiro;
		for (int i=0; i < metade; i++) {
			p = p.getProx();
		}
		dividida.primeiro = p.getProx();
		dividida.ultimo = this.ultimo;
		dividida.qtdeElementos = metade;
		p.setProx(null);
		this.ultimo = p;
		this.qtdeElementos = this.qtdeElementos - metade;
		return dividida;
	}

}