package lineares;

public class TestePilhaVetor {

	public static void main(String[] args) {
		PilhaVetor<Object> pilha = new PilhaVetor<>(5);
		PilhaVetor<Object> pilha2 = new PilhaVetor<>(5);
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
		pilha.push(23);
		pilha.push(24);
		pilha.push(48);
		pilha.push(46);
		pilha.push(16);
		System.out.println("Pilha após inserções = " + pilha.toString());
		pilha2.push(1);
		pilha2.push(2);
		pilha2.push(100);
		pilha2.push(200);
		pilha2.push(800);
		System.out.println("Pilha 2 após inserções = " + pilha2.toString());
		int resultado = pilha.compara(pilha2);
		System.out.println("Resultado da comparação: " + resultado);
		pilha.pop();
		System.out.println("Pilha 1 após remoção = " + pilha.toString());
		System.out.println("Pilha 2 após inserções = " + pilha2.toString());
		resultado = pilha.compara(pilha2);
		System.out.println("Resultado da comparação: " + resultado);
		pilha2.pop();
		pilha2.pop();
		pilha2.pop();
		System.out.println("Pilha 1 após remoção = " + pilha.toString());
		System.out.println("Pilha 2 após remoção = " + pilha2.toString());
		resultado = pilha.compara(pilha2);
		System.out.println("Resultado da comparação: " + resultado);

	}

}
