package arvores;

public class NoArvoreBinaria<T> {
	private T info;
	private NoArvoreBinaria<T> esq;
	private NoArvoreBinaria<T> dir;

	public NoArvoreBinaria(T info) {
		super();
		this.info = info;
	}

	public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir) {
		super();
		this.info = info;
		this.esq = esq;
		this.dir = dir;
	}

	public NoArvoreBinaria<T> getEsq() {
		return esq;
	}

	public void setEsq(NoArvoreBinaria<T> esq) {
		this.esq = esq;
	}

	public NoArvoreBinaria<T> getDir() {
		return dir;
	}

	public void setDir(NoArvoreBinaria<T> dir) {
		this.dir = dir;
	}

	public T getInfo() {
		return this.info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public NoArvoreBinaria<T> pertence(T info) {
		if (this.info.equals(info)) {
			return this;
		}
		NoArvoreBinaria<T> noPesquisado = null;
		if (this.esq != null) {
			noPesquisado = this.esq.pertence(info);
		}
		if (noPesquisado == null && this.dir != null) {
			noPesquisado = this.dir.pertence(info);
		}
		return noPesquisado;
	}

	public String imprimePre() {
		String str = "<" + this.info.toString();
		if (this.esq != null) {
			str += this.esq.imprimePre();
		} else {
			str += "<>";
		}
		if (this.dir != null) {
			str += this.dir.imprimePre();
		} else {
			str += "<>";
		}
		return str + ">";
	}

	public String imprimeEmOrdem() {
		String str = "";
		if (this.esq != null) {
			str += this.esq.imprimeEmOrdem();
		}
		str += this.info.toString() + ", ";
		if (this.dir != null) {
			str += this.dir.imprimeEmOrdem();
		}
		return str;
	}
	
	public String imprimePosOrdem() {
	    String str = "";
	    if (this.esq != null) {
	        str += this.esq.imprimePosOrdem();
	    }
	    if (this.dir != null) {
	        str += this.dir.imprimePosOrdem();
	    }
	    str += this.info.toString() + ", ";
	    return str;
	}
}