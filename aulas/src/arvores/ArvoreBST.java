package arvores;

import java.util.Comparator;

public class ArvoreBST<T extends Comparable<T>> extends ArvoreBinariaAbstract<T> {

	private Comparator<T> comparaVeiculo;

	public ArvoreBST() {
		this.raiz = null;
		this.comparaVeiculo = null;
	}

	public ArvoreBST(Comparator<T> comparaVeiculo) {
		this.raiz = null;
		this.setComparaVeiculo(comparaVeiculo);
	}

	public void inserir(T info) {
		if (this.vazia()) {
			this.setRaiz(new NoArvoreBST<T>(info));
		} else {
			((NoArvoreBST<T>) this.getRaiz()).inserir(info);
		}
	}

	public NoArvoreBST<T> buscar(T info) {
		if (this.vazia()) {
			return null;
		}
		return ((NoArvoreBST<T>) this.getRaiz()).buscar(info);
	}

	public void retirar(T info) {
		NoArvoreBST<T> noARemover = this.buscar(info);
		if (noARemover != null) {
			this.removerNo(noARemover);
		}
	}

	private void removerNo(NoArvoreBST<T> noARemover) {
		NoArvoreBST<T> noPai = this.buscarPai(noARemover);

		if (noARemover.ehFolha()) {
			// caso 1
			if (this.getRaiz() == noARemover) {
				this.setRaiz(null);
			} else {
				if (noPai.getEsq() == noARemover) {
					noPai.setEsq(null);
				} else {
					noPai.setDir(null);
				}
			}
		} else {
			if (noARemover.temApenasUmFilho()) {
				// caso 2
				NoArvoreBST<T> noFilho = noARemover.buscarUnicoFilho();
				if (this.getRaiz() == noARemover) {
					this.setRaiz(noFilho);
				} else {
					if (noPai.getEsq() == noARemover) {
						noPai.setEsq(noFilho);
					} else {
						noPai.setDir(noFilho);
					}
				}
			} else {
				// caso 3
				NoArvoreBST<T> noSucessor = this.buscarSucessor(noARemover);
				T info = noSucessor.getInfo();
				this.removerNo(noSucessor);
				noARemover.setInfo(info);
			}
		}
	}

	private NoArvoreBST<T> buscarPai(NoArvoreBST<T> no) {
		if (no == this.getRaiz()) {
			return null;
		}
		NoArvoreBST<T> noPai = (NoArvoreBST<T>) this.getRaiz();
		while (noPai.getEsq() != no && noPai.getDir() != no) {
			if (no.getInfo().compareTo(noPai.getInfo()) < 0) {
				noPai = (NoArvoreBST<T>) noPai.getEsq();
			} else {
				noPai = (NoArvoreBST<T>) noPai.getDir();
			}
		}
		return noPai;
	}

	public NoArvoreBST<T> getSucessor(T info) {
		NoArvoreBST<T> no = this.buscar(info);
		if (no == null || info.equals(this.maiorValor())) {
			return null;
		}
		if (no.getDir() != null) {
			return this.buscarSucessor(no);
		} else {
			NoArvoreBST<T> noPai = this.buscarPai(no);
			while (noPai.getDir() == no) {
				no = noPai;
				noPai = this.buscarPai(no);
			}
			return noPai;
		}
	}

	private NoArvoreBST<T> buscarSucessor(NoArvoreBST<T> no) {
		NoArvoreBST<T> noSucessor = (NoArvoreBST<T>) no.getDir();
		while (noSucessor.getEsq() != null) {
			noSucessor = (NoArvoreBST<T>) noSucessor.getEsq();
		}
		return noSucessor;
	}

	public NoArvoreBST<T> getAntecessor(T info) {
		NoArvoreBST<T> no = this.buscar(info);
		if (no == null || info.equals(this.menorValor())) {
			return null;
		}
		if (no.getEsq() != null) {
			return this.buscarAntecessor(no);
		} else {
			NoArvoreBST<T> noPai = this.buscarPai(no);
			while (noPai.getEsq() == no) {
				no = noPai;
				noPai = this.buscarPai(no);
			}
			return noPai;
		}
	}

	private NoArvoreBST<T> buscarAntecessor(NoArvoreBST<T> no) {
		NoArvoreBST<T> noAntecessor = (NoArvoreBST<T>) no.getEsq();
		while (noAntecessor.getDir() != null) {
			noAntecessor = (NoArvoreBST<T>) noAntecessor.getDir();
		}
		return noAntecessor;
	}

	public T maiorValor() {
		if (this.vazia()) {
			return null;
		}
		NoArvoreBST<T> no = (NoArvoreBST<T>) this.getRaiz();
		while (no.getDir() != null) {
			no = (NoArvoreBST<T>) no.getDir();
		}
		return no.getInfo();
	}

	public T menorValor() {
		if (this.vazia()) {
			return null;
		}
		NoArvoreBST<T> no = (NoArvoreBST<T>) this.getRaiz();
		while (no.getEsq() != null) {
			no = (NoArvoreBST<T>) no.getEsq();
		}
		return no.getInfo();
	}

	public String toStringOrdered() {
		if (this.vazia()) {
			return "<>";
		}
		return this.getRaiz().imprimeEmOrdem();
	}

	public Comparator<T> getComparaVeiculo() {
		return comparaVeiculo;
	}

	public void setComparaVeiculo(Comparator<T> comparaVeiculo) {
		this.comparaVeiculo = comparaVeiculo;
	}
}