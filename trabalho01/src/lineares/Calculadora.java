// Andre Heller E Martin Lange de Assis
package lineares;

public class Calculadora<T> {

	private String expressao;
	private Pilha<T> valores;

	public Calculadora() {
		super();
		this.valores = new PilhaDinamica<>();
	}

	public String getExpressao() {
		return expressao;
	}

	public void setExpressao(String expressao) {
		this.expressao = expressao;
		this.valores = criarPilha();

		calcular(expressao);
	}

	public Pilha<T> getValores() {
		return valores;
	}

	public void setValores(Pilha<T> valores) {
		this.valores = valores;
	}

	@SuppressWarnings("unchecked")
	public String calcular(String expressao) {
		String[] palavra = expressao.split(" ");
		if(palavra.length <= 2) {
			throw new IllegalArgumentException("quantidade errada de operadores");
		}
		double resultado = 0;
		for (int i = 0; i < palavra.length; i++) {
			String v;
			String v2;
			palavra[i] = palavra[i].replace("–", "-");
			switch (palavra[i]) {

			case "+":
				if (valores.estaVazia()) {
					throw new ArithmeticException("Quantidade de operadores errada.");
				} else {
					v2 = valores.pop().toString().replace(",", ".");
					v = valores.pop().toString().replace(",", ".");
					resultado = this.soma(v, v2);
					valores.push((T) String.valueOf(resultado));
					if (palavra.length % 2 == 0) {
						throw new ArithmeticException("Número de operadores incompatível");
					}
				}

				break;
			case "-":
				if (valores.estaVazia()) {
					throw new ArithmeticException("Quantidade de operadores errada.");
				} else {
					v2 = valores.pop().toString().replace(",", ".");
					v = valores.pop().toString().replace(",", ".");
					resultado = this.sub(v, v2);
					valores.push((T) String.valueOf(resultado));
				}
				if (palavra.length % 2 == 0) {
					throw new ArithmeticException("Número de operadores incompatível");
				}
				break;
			case "/":
				if (valores.estaVazia()) {
					throw new ArithmeticException("Quantidade de operadores errada.");
				} else {
					v2 = valores.pop().toString().replace(",", ".");
					v = valores.pop().toString().replace(",", ".");
					resultado = this.div(v, v2);
					valores.push((T) String.valueOf(resultado));
				}
				if (palavra.length % 2 == 0) {
					throw new ArithmeticException("Número de operadores incompatível");
				}
				break;
			case "*":
				if (valores.estaVazia()) {
					throw new ArithmeticException("Quantidade de operadores errada.");
				} else {
					v2 = valores.pop().toString().replace(",", ".");
					v = valores.pop().toString().replace(",", ".");
					resultado = this.mult(v, v2);
					valores.push((T) String.valueOf(resultado));
				}
				if (palavra.length % 2 == 0) {
					throw new ArithmeticException("Número de operadores incompatível");
				}
				break;

			default:
				break;
			}

			if ((palavra[i] != null && palavra[i].matches("[0-9]+(\\.[0-9]+)?"))) {
				valores.push((T) palavra[i].replace(",", "."));
			}

		}
		return (String) valores.pop();
	}

	public double soma(String v, String v2) {

		return Double.parseDouble(v) + Double.parseDouble(v2);

	}

	public double sub(String v, String v2) {
		return Double.parseDouble(v) - Double.parseDouble(v2);

	}

	public double div(String v, String v2) {
		if (Double.parseDouble(v) == 0 || Double.parseDouble(v2) == 0) {
			throw new IllegalArgumentException("Divisao por 0");
		}
		return Double.parseDouble(v) / Double.parseDouble(v2);
	}

	public double mult(String v, String v2) {
		return Double.parseDouble(v) * Double.parseDouble(v2);
	}

	private Pilha<T> criarPilha() {
		if (valores.getClass() == PilhaDinamica.class) {
			return new PilhaDinamica<T>();
		} else if (valores.getClass() == PilhaVetor.class) {
			PilhaVetor<T> pilhaVetor = (PilhaVetor<T>) valores;
			return new PilhaVetor<T>(pilhaVetor.getTamanho());
		} else {
			throw new RuntimeException("Tipo de pilha inválido");
		}
	}

}
