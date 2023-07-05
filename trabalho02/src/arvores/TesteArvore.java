package arvores;

public class TesteArvore {

	public static void main(String[] args) {
		/*NoArvore<Integer> n1 = new NoArvore<Integer>(1);
		NoArvore<Integer> n2 = new NoArvore<Integer>(2);
		NoArvore<Integer> n3 = new NoArvore<Integer>(3);
		NoArvore<Integer> n4 = new NoArvore<Integer>(4);
		NoArvore<Integer> n5 = new NoArvore<Integer>(5);
		NoArvore<Integer> n6 = new NoArvore<Integer>(6);
		NoArvore<Integer> n7 = new NoArvore<Integer>(7);
		NoArvore<Integer> n8 = new NoArvore<Integer>(8);
		NoArvore<Integer> n9 = new NoArvore<Integer>(9);
		NoArvore<Integer> n10 = new NoArvore<Integer>(10);
		NoArvore<Integer> n11 = new NoArvore<Integer>(11);
		NoArvore<Integer> n12 = new NoArvore<Integer>(8);
		NoArvore<Integer> n13 = new NoArvore<Integer>(9);
		NoArvore<Integer> n14 = new NoArvore<Integer>(10);
		Arvore<Integer> a = new Arvore<>();
		a.setRaiz(n1);
		n1.inserirFilho(n2);
		n2.inserirFilho(n3);
		n3.inserirFilho(n5);
		n5.inserirFilho(n6);
		
		n1.inserirFilho(n4);
		
		
		n1.inserirFilho(n7);
		n7.inserirFilho(n8);
		n8.inserirFilho(n9);
		n9.inserirFilho(n10);
		
		
		System.out.println(a.toString());
		System.out.println(a.getAltura());
		System.out.println("Testando o método getNivel(T info)");
		System.out.println("deve imprimir 0:  " + a.getNivel(1)); 
		System.out.println("deve imprimir 1:  " +a.getNivel(2)); 
		System.out.println("deve imprimir 2:  " +a.getNivel(3)); 
		System.out.println("deve imprimir 1:  " +a.getNivel(4)); 
		System.out.println("deve imprimir 3:  " +a.getNivel(5)); 
		System.out.println("deve imprimir 4:  " +a.getNivel(6)); 
		System.out.println("deve imprimir -1:  " +a.getNivel(7)); 
		System.out.println("deve imprimir -1:  " +a.getNivel(8)); 
		System.out.println("deve imprimir -1:  " +a.getNivel(9));
		System.out.println("deve imprimir -1:  " +a.getNivel(10)); 
		System.out.println("deve imprimir -1:  " +a.getNivel(11)); 
		System.out.println("deve imprimir 1:   " + a.getNivel(7));
		System.out.println("deve imprimir 2:   " + a.getNivel(8));
		System.out.println("deve imprimir 3:   " + a.getNivel(9));
		System.out.println("deve imprimir 4:   " + a.getNivel(10));
		
		System.out.println("Testando o método isBalanceada()");
		System.out.println(a.isBalanceada());*/
		
		Arvore<Integer> arvore = new Arvore<>();
        NoArvore<Integer> raiz = new NoArvore<>(1);
        NoArvore<Integer> no2 = new NoArvore<>(2);
        NoArvore<Integer> no3 = new NoArvore<>(3);
        NoArvore<Integer> no4 = new NoArvore<>(4);
        NoArvore<Integer> no5 = new NoArvore<>(5);
        NoArvore<Integer> no6 = new NoArvore<>(6);
        NoArvore<Integer> no7 = new NoArvore<>(7);
        NoArvore<Integer> no8 = new NoArvore<>(8);
        NoArvore<Integer> no9 = new NoArvore<>(9);
        NoArvore<Integer> no10 = new NoArvore<>(10);
        
        arvore.setRaiz(raiz);
        raiz.inserirFilho(no2);
        raiz.inserirFilho(no6);
        raiz.inserirFilho(no7);
        no2.inserirFilho(no3);
        no2.inserirFilho(no5);
        no3.inserirFilho(no4);
        no7.inserirFilho(no8);
        no7.inserirFilho(no9);
        no9.inserirFilho(no10);
        
        System.out.println(arvore.toString());
        // Testando o método getAltura
        System.out.println("Altura da árvore: " + arvore.getAltura());
        // Resultado esperado: 3
        
        // Testando o método getNivel para todos os elementos da árvore
        
            
            System.out.println("Nível do elemento: " +  arvore.getNivel(1));
            System.out.println("Nível do elemento: " +  arvore.getNivel(2));
            System.out.println("Nível do elemento: " +  arvore.getNivel(3));
            System.out.println("Nível do elemento: " +  arvore.getNivel(4));
            System.out.println("Nível do elemento: " +  arvore.getNivel(5));
            System.out.println("Nível do elemento: " +  arvore.getNivel(6));
            System.out.println("Nível do elemento: " +  arvore.getNivel(7));
            System.out.println("Nível do elemento: " +  arvore.getNivel(8));
            System.out.println("Nível do elemento: " +  arvore.getNivel(9));
            System.out.println("Nível do elemento: " +  arvore.getNivel(10));
        
        // Resultado esperado:
        // Nível do elemento 1: 0
        // Nível do elemento 2: 1
        // Nível do elemento 3: 2
        // Nível do elemento 4: 3
        // Nível do elemento 5: 2
        // Nível do elemento 6: 1
        // Nível do elemento 7: 1
        // Nível do elemento 8: 2
        // Nível do elemento 9: 2
        // Nível do elemento 10: 3
        
        // Testando o método isBalanceada
        System.out.println("A árvore é balanceada? " + arvore.isBalanceada());
        // Resultado esperado: false
	}
}
