package lineares;

public class TestePilhaLista {
	public static void main(String[] args) {
		Pilha<Object> pilha = new PilhaLista<>();
		System.out.println("Pilha original = " + pilha.toString());
		pilha.push(23);
		pilha.push(24);
		pilha.push(48);
		pilha.push(46);
		pilha.push(16);
		System.out.println("Pilha após inserções = " + pilha.toString());
		pilha.pop();
		pilha.pop();
		System.out.println("Pilha após remoções = " + pilha.toString());
		System.out.println("Elemento do topo = " + pilha.peek());
		System.out.println("A pilha está vazia? " + pilha.estaVazia());
		pilha.liberar();
		System.out.println("Pilha após liberação dos elementos = " + pilha.toString());
	}
}
