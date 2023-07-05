// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis
package trabalho03;

public class ListaEncadeada<T, K> implements Lista<T> {
	private NoLista<T, K> primeiro;
	private NoLista<T, K> ultimo;
	private int qtdeElementos;

	@Override
	public void inserir(T valor) {
		NoLista<T, K> novo = new NoLista<>();
		novo.setInfo(valor);
		if (this.estaVazia()) {
			primeiro = novo;
		} else {
			ultimo.setProx(novo);
		}
		ultimo = novo;
		qtdeElementos++;
	}

	public void inserir(K chave, T valor) {
		NoLista<T, K> novo = new NoLista<>();
		novo.setInfo(valor);
		novo.setChave(chave);

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
		NoLista<T, K> p = primeiro;
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
		NoLista<T, K> p = this.primeiro;
		NoLista<T, K> anterior = null;

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
		NoLista<T, K> p = primeiro;
		String msg = "[";
		while (p != null) {
			msg = msg + "Chave: " + p.getChave() + " Info: " + p.getInfo() + ", ";
			p = p.getProx();
		}
		return msg + "]";
	}

	@Override
	public Lista<T> copiar() {
		ListaEncadeada<T, K> nova = new ListaEncadeada<>();
		NoLista<T, K> p = primeiro;
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
			throw new IndexOutOfBoundsException("Pos = " + pos);
		}
		NoLista<T, K> p = this.primeiro;
		for (int i = 0; i < pos; i++) {
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
		ListaEncadeada<T, K> dividida = new ListaEncadeada<>();
		if (this.qtdeElementos < 2) {
			return dividida;
		}
		int metade = this.qtdeElementos / 2;
		NoLista<T, K> p = this.primeiro;
		for (int i = 0; i < metade; i++) {
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

	public int duplicado() {

		NoLista<T, K> p1 = this.primeiro;
		NoLista<T, K> p2;
		int posicao = 0;

		while (p1 != null) {
			p2 = p1.getProx();
			while (p2 != null) {
				if (p1.getInfo().equals(p2.getInfo())) {
					return posicao;
				}
				p2 = p2.getProx();

			}
			p1 = p1.getProx();
			posicao++;
		}

		return -1;
	}

	public String exibirInverso() {

		NoLista<T, K> p = primeiro;
		String str = "]";
		while (p != null) {
			str = p.getInfo() + ", " + str;
			p = p.getProx();
		}
		return "[" + str;
	}

	public T buscarComChave(K chave) {
		NoLista<T, K> p = primeiro;

		while (p != null) {
			if (p.getChave().equals(chave)) {
				return p.getInfo();
			}

			p = p.getProx();
		}
		return null;

	}

	public T removerComChave(K chave) {
		NoLista<T, K> p = this.primeiro;
		NoLista<T, K> anterior = null;

		while (p != null && !p.getChave().equals(chave)) {
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
			return p.getInfo();
		}
		return null;
	}

}