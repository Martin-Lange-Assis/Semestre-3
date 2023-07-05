// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis
package trabalho03;
public class NoLista<T, K> {
	private T info;
	private K chave;
	
	public K getChave() {
		return chave;
	}
	public void setChave(K chave) {
		this.chave = chave;
	}
	private NoLista<T, K> prox;
	
	public T getInfo() {
		return info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public NoLista<T, K>getProx() {
		return prox;
	}
	public void setProx(NoLista<T, K> novo) {
		this.prox = novo;
	}
	
	
}