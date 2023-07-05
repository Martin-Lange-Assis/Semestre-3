//Alunos: André Heller e Martin Lange de Assis
//Professor: Marcel Hugo

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

	public int calcularAltura(NoArvore<T> no) {
		if (no == null) {
			return 0;
		} else {
			int maxAltura = 0;
			int alturaFilho = calcularAltura(no.filho);
			int alturaIrmao = calcularAltura(no.irmao);
			maxAltura = Math.max(maxAltura, alturaFilho);
			maxAltura = Math.max(maxAltura, alturaIrmao - 1);
			return 1 + maxAltura;
		}
	}

	public NoArvore<T> getFilho() {
		return filho;
	}

	public NoArvore<T> getIrmao() {
		return irmao;
	}

	public int getNivel(T info, int nivel) {
		int nivelMax = -1;
		if (this.info.equals(info)) {
			return nivel;
		}
		if (this.filho != null) {
			nivelMax = this.filho.getNivel(info, nivel + 1);
		}
		if (this.irmao != null && nivelMax == -1) {
			nivelMax = this.irmao.getNivel(info, nivel);
		}
		return nivelMax;
	}

	public boolean isBalanceada() {
		NoArvore<T> filhoAtual = this.filho;
		int hMin = Integer.MAX_VALUE;
		int hMax = Integer.MIN_VALUE;
		if (this.filho == null) {
			return true;
		}
		while (filhoAtual != null) {
			int h = filhoAtual.calcularAltura(filhoAtual.filho);
			hMin = Math.min(hMin, h);
			hMax = Math.max(hMax, h);
			if (!filhoAtual.isBalanceada()) {
				return false;
			}
			filhoAtual = filhoAtual.irmao;
		}
		return hMax - hMin <= 1;
	}

}