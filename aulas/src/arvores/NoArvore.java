package arvores;

public class NoArvore<T> {
	private T info;
	private NoArvore<T> filho;
	private NoArvore<T> irmao;

	public NoArvore(T info) {
		super();
		this.info = info;
		this.filho = null;
		this.irmao = null;
	}

	public NoArvore<T> getFilho() {
		return filho;
	}

	public void setFilho(NoArvore<T> filho) {
		this.filho = filho;
	}

	public NoArvore<T> getIrmao() {
		return irmao;
	}

	public void setIrmao(NoArvore<T> irmao) {
		this.irmao = irmao;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public String imprimePre() {
		String str = "<" + this.info.toString();
		if (this.filho != null) {
			str += this.filho.imprimePre();
		}
		str += ">";
		if (this.irmao != null) {
			str += this.irmao.imprimePre();
		}
		return str;
	}

	public void inserirFilho(NoArvore<T> sa) {
		sa.irmao = this.filho;
		this.filho = sa;
	}

	public NoArvore<T> pertence(T info) {
		if (this.info.equals(info)) {
			return this;
		}
		NoArvore<T> no = null;
		if (this.filho != null) {
			no = this.filho.pertence(info);
		}
		if (no == null && this.irmao != null) {
			no = this.irmao.pertence(info);
		}
		return no;
	}

	public void removerFilho(NoArvore<T> filhoRemovido) {
		if (this.filho == filhoRemovido) {
			this.filho = filhoRemovido.getIrmao();
			filhoRemovido.setInfo(null);
		} else {
			NoArvore<T> irmaoAnterior = this.filho;
			while (irmaoAnterior != null && irmaoAnterior.getIrmao() != filhoRemovido) {
				irmaoAnterior = irmaoAnterior.getIrmao();
			}
			if (irmaoAnterior != null) {
				irmaoAnterior.setIrmao(filhoRemovido.getIrmao());
				filhoRemovido.setIrmao(null);
			}
		}
	}
}