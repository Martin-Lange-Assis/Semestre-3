package lineares;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora ca = new Calculadora();
		ca.setExpressao("21 2 * 5 +");
		System.out.println(ca.getValores().peek());
		ca.setExpressao("21 3 /");
		System.out.println(ca.getValores().peek());
	}

}
