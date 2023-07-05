package arvores;

public class NoArvoreBST<T extends Comparable<T>> extends NoArvoreBinaria<T> {

	public NoArvoreBST(T info) {
		super(info);
	}

	public void inserir(T info) {
		if (info.compareTo(this.getInfo()) < 0) {
			// esquerda
			if (this.getEsq() == null) {
				this.setEsq(new NoArvoreBST<T>(info));
			} else {
				((NoArvoreBST<T>) this.getEsq()).inserir(info);
			}
		} else {
			// direita
			if (this.getDir() == null) {
				this.setDir(new NoArvoreBST<T>(info));
			} else {
				((NoArvoreBST<T>) this.getDir()).inserir(info);
			}
		}

	}

	public NoArvoreBST<T> buscar(T info) {
		if (info.equals(this.getInfo())) {
			return this;
		}
		if (info.compareTo(this.getInfo()) < 0) {
			// esquerda
			if (this.getEsq() == null) {
				return null;
			} else {
				return ((NoArvoreBST<T>) this.getEsq()).buscar(info);
			}
		} else {
			// direita
			if (this.getDir() == null) {
				return null;
			} else {
				return ((NoArvoreBST<T>) this.getDir()).buscar(info);
			}
		}
	}

	protected NoArvoreBST<T> buscarUnicoFilho() {
		if (this.getEsq() != null){
			return (NoArvoreBST<T>) this.getEsq();
		}
		else {
			return (NoArvoreBST<T>) this.getDir();
		}
	}

	public boolean temApenasUmFilho() {
		// XOR - eXclusive OR
		return (this.getEsq() == null ^ this.getDir() == null);
	}

	public boolean ehFolha() {
		return (this.getEsq() == null && this.getDir() == null);
	}
}