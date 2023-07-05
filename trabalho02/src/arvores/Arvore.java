//Alunos: André Heller e Martin Lange de Assis
//Professor: Marcel Hugo

package arvores;

public class Arvore<T> { // contribui��o do Martin
	private NoArvore<T> raiz;

	public Arvore() {
		raiz = null;
	}

	public NoArvore<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}

	public NoArvore<T> pertence(T info) {
		if (this.vazia()) {
			return null;
		}
		return this.raiz.pertence(info);
	}

	public boolean vazia() {
		if (raiz == null) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		if (this.vazia()) {
			return null;
		}
		return this.raiz.imprimePre();
	}

	public int getAltura() {
		if (raiz == null) {
			return -1;
		} else {
			return this.raiz.calcularAltura(raiz) - 1;
		}
	}

	public int getNivel(T info) {
		if (raiz == null) {
			return -1;
		} else {
			return raiz.getNivel(info, 0);
		}

	}

	public boolean isBalanceada() {
		if (raiz == null) {
			return true;
		} else {
			return raiz.isBalanceada();
		}

	}

}