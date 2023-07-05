package arvores;

public class TesteVeiculo {
	public static void main(String[] args) {
		ArvoreBST<Veiculo> arvore1 = new ArvoreBST<>();
		arvore1.inserir(new Veiculo("MJT-7432", "Fusca", 1912, "Pedro"));
		arvore1.inserir(new Veiculo("MIT-8008", "Celta", 1999, "Douglas"));
		arvore1.inserir(new Veiculo("MEI-4665", "Gol", 2002, "Carlos"));
		arvore1.inserir(new Veiculo("MIO-6668", "Fusca", 1915, "Aline"));
		arvore1.inserir(new Veiculo("DIO-3333", "Celta", 1999, "Fausto"));
		arvore1.inserir(new Veiculo("PAO-6472", "C3", 2007, "Carolina"));
		arvore1.inserir(new Veiculo("CAO-2890", "C4", 2012, "Kelvin"));
		arvore1.inserir(new Veiculo("UVA-3939", "BMW", 2015, "Zé"));
		arvore1.inserir(new Veiculo("OVO-0000", "Gol", 2000, "Joshua"));
		arvore1.inserir(new Veiculo("ABC-1234", "Ferrari", 2015, "Marta"));
		System.out.println("Ordenando por Placa:");
		System.out.println(arvore1.toStringOrdered());
		ArvoreBST<Veiculo> arvore2 = new ArvoreBST<>();
		arvore2.inserir(new ComparaVeiculo("MJT-7432", "Fusca", 1912, "Pedro"));
		arvore2.inserir(new ComparaVeiculo("MIT-8008", "Celta", 1999, "Douglas"));
		arvore2.inserir(new ComparaVeiculo("MEI-4665", "Gol", 2002, "Carlos"));
		arvore2.inserir(new ComparaVeiculo("MIO-6668", "Fusca", 1915, "Aline"));
		arvore2.inserir(new ComparaVeiculo("DIO-3333", "Celta", 1999, "Fausto"));
		arvore2.inserir(new ComparaVeiculo("PAO-6472", "C3", 2007, "Carolina"));
		arvore2.inserir(new ComparaVeiculo("CAO-2890", "C4", 2012, "Kelvin"));
		arvore2.inserir(new ComparaVeiculo("UVA-3939", "BMW", 2015, "Zé"));
		arvore2.inserir(new ComparaVeiculo("OVO-0000", "Gol", 2000, "Joshua"));
		arvore2.inserir(new ComparaVeiculo("ABC-1234", "Ferrari", 2015, "Marta"));
		System.out.println("Ordenando pelo Modelo");
		System.out.println(arvore2.toStringOrdered());
	}

}
