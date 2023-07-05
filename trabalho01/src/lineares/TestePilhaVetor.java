package lineares;

public class TestePilhaVetor {

	public static void main(String[] args) {
		PilhaVetor<Integer> pilha1 = new PilhaVetor<>(5);
		pilha1.push(50);
		pilha1.push(150);
		pilha1.push(20);
		pilha1.push(30);
		pilha1.push(80);
	
		System.out.println(pilha1.toString());
		System.out.println(pilha1.peek());
		System.out.println("Retornado: " + pilha1.pop());
		System.out.println("Retornado: " +  pilha1.pop());
		System.out.println("topo: " + pilha1.peek());
		System.out.println(pilha1.estaVazia());
		
		pilha1.liberar();
		System.out.println(pilha1.estaVazia());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
