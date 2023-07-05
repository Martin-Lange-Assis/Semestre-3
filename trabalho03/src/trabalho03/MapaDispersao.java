package trabalho03;
// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis

public class MapaDispersao<K, T> {
	private ListaEncadeada<T, K>[] tabela;
	private int quantidade;
	private int elementos;

	public MapaDispersao(int quantidade) {
		this.quantidade = quantidade;
		this.tabela = new ListaEncadeada[quantidade];
		for (int i = 0; i < quantidade; i++) {
			tabela[i] = new ListaEncadeada<>();
		}
	}

	private int calcularHash(K chave) {
		int hash = chave.hashCode();
		return Math.abs(hash % this.quantidade);

	}

	public boolean inserir(K chave, T dado) {
		if (this.existe(chave)) {
			return false;
		}
		int chaves = this.calcularHash(chave);
		elementos++;
		tabela[chaves].inserir(chave, dado);
		return true;

	}

	public T remover(K chave) {
		int chaves = this.calcularHash(chave);
		T obj = this.buscar(chave);
		if (obj != null) {
			elementos--;
		}
		return tabela[chaves].removerComChave(chave);

	}

	public T buscar(K chave) {
		int chaves = this.calcularHash(chave);
		return tabela[chaves].buscarComChave(chave);
	}

	public int quantosElementos() {
		return this.elementos;
	}

	public String toString() {
		String str = "";
		for (int i = 0; i < tabela.length; i++) {
			str += "id: " + i + " " + tabela[i].exibir() + "\n";

		}
		return str;
	}

	private boolean existe(K chave) {
		return this.buscar(chave) != null;
	}

}
