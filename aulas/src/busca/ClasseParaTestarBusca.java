package busca;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

import ordenacao.BubbleSort;
import ordenacao.Sort;

class ClasseParaTestarBusca {

	private static Veiculo[] vetor;
	private static Integer[] vetorInts;
	private static String[] vetorStrings;
	private static int[] tamanhos = { 100, 5000 };

	public static void main(String[] args) {
		initializeClass();

		// a linha abaixo precisa ser alterada para a classe criada pela equipe
		Sort<Veiculo> meuAlgoritmo = new BubbleSort<>();
		Buscador<Veiculo> ab = new Buscador<>();
		long ultimoNanoTime, tempoExecucao;
		for (Integer i : tamanhos) {
			Veiculo[] vetorCopiado = Arrays.copyOf(vetor, i);
			System.out.println("Vetor com " + i + " veiculos");
			// System.out.println(Arrays.toString(vetorCopiado));
			meuAlgoritmo.sort(vetorCopiado);
			System.out.println("Pesquisa COM sucesso:");
			ultimoNanoTime = System.nanoTime();
			int posicao = ab.pesquisaBinaria(vetorCopiado, vetorCopiado[95]);
			tempoExecucao = System.nanoTime() - ultimoNanoTime;
			System.out.println("Posicao = " + posicao + " em " + tempoExecucao + " ns");
			System.out.println("Pesquisa SEM sucesso:");
			ultimoNanoTime = System.nanoTime();
			Veiculo veiculo = new Veiculo("NAO-EXIS", "modelo", 2000, "nome");
			posicao = ab.pesquisaBinaria(vetorCopiado, veiculo);
			tempoExecucao = System.nanoTime() - ultimoNanoTime;
			System.out.println("Posicao = " + posicao + " em " + tempoExecucao + " ns");
		}

		// a linha abaixo precisa ser alterada para a classe criada pela equipe
		Sort<Integer> meuAlgoritmo2 = new BubbleSort<>();
		Buscador<Integer> ab2 = new Buscador<>();
		for (Integer i : tamanhos) {
			Integer[] vetorCopiado = Arrays.copyOf(vetorInts, i);
			System.out.println("Vetor com " + i + " inteiros");
			// System.out.println(Arrays.toString(vetorCopiado));
			meuAlgoritmo2.sort(vetorCopiado);
			ultimoNanoTime = System.nanoTime();
			int posicao = ab2.pesquisaBinaria(vetorCopiado, vetorCopiado[95]);
			tempoExecucao = System.nanoTime() - ultimoNanoTime;
			System.out.println("Posicao = " + posicao + " em " + tempoExecucao + " ns");
			System.out.println("Pesquisa SEM sucesso:");
			ultimoNanoTime = System.nanoTime();
			posicao = ab2.pesquisaBinaria(vetorCopiado, Integer.MIN_VALUE);
			tempoExecucao = System.nanoTime() - ultimoNanoTime;
			System.out.println("Posicao = " + posicao + " em " + tempoExecucao + " ns");
		}

		// a linha abaixo precisa ser alterada para a classe criada pela equipe
		Sort<String> meuAlgoritmo3 = new BubbleSort<>();
		Buscador<String> ab3 = new Buscador<>();
		for (Integer i : tamanhos) {
			String[] vetorCopiado = Arrays.copyOf(vetorStrings, i);
			System.out.println("Vetor com " + i + " Strings");
			// System.out.println(Arrays.toString(vetorCopiado));
			meuAlgoritmo3.sort(vetorCopiado);
			ultimoNanoTime = System.nanoTime();
			int posicao = ab3.pesquisaBinaria(vetorCopiado, vetorCopiado[90]);
			tempoExecucao = System.nanoTime() - ultimoNanoTime;
			System.out.println("Posicao = " + posicao + " em " + tempoExecucao + " ns");
			System.out.println("Pesquisa SEM sucesso:");
			ultimoNanoTime = System.nanoTime();
			posicao = ab3.pesquisaBinaria(vetorCopiado, "NAO existente");
			tempoExecucao = System.nanoTime() - ultimoNanoTime;
			System.out.println("Posicao = " + posicao + " em " + tempoExecucao + " ns");
		}
	}

	public static void initializeClass() {
		vetor = new Veiculo[tamanhos[tamanhos.length - 1]];
		Veiculo veic;
		// geracao dos dados
		String nome, placa, modelo;
		int ano;

		for (int i = 0; i < vetor.length; i++) {
			nome = GeradorAleatorio.geraNome() + " " + i;
			placa = GeradorAleatorio.geraPlaca();
			modelo = GeradorAleatorio.geraModelo();
			ano = GeradorAleatorio.geraAno();
			vetor[i] = new Veiculo(placa, modelo, ano, nome);
		}

		Random r = new Random();
		vetorInts = new Integer[vetor.length];
		for (int i = 0; i < vetorInts.length; i++) {
			vetorInts[i] = r.nextInt(vetorInts.length * 1000);
		}

		vetorStrings = new String[vetor.length];
		for (int i = 0; i < vetorStrings.length; i++) {
			vetorStrings[i] = GeradorAleatorio.geraNome() + " " + GeradorAleatorio.geraModelo() + " "
					+ GeradorAleatorio.geraNome();
		}
	}
}

class GeradorAleatorio {

	private static Random geraNumero = new Random();
	private static String[] nomes = { "Jose", "Maria", "Pedro", "Joao", "Mario", "Paulo", "Paula", "Sandra", "Andre",
			"Carla" };
	private static String[] modelos = { "Gol", "Mobi", "Fox", "F-150", "C3", "Captur", "i30", "Fastback", "HRV",
			"Picanto" };

	private static int anoAtual = (LocalDate.now().getYear());

	public static String geraNome() {
		return nomes[geraNumero.nextInt(10)];
	}

	public static String geraPlaca() {
		String placa = "";
		for (int i = 0; i < 3; i++) {
			placa += (char) (65 + geraNumero.nextInt(26)); // ASCII 65 = A
		}
		placa += "-";
		for (int i = 0; i < 4; i++) {
			placa += (char) (48 + geraNumero.nextInt(10)); // ASCII 48 = 0
		}

		return placa;
	}

	public static String geraModelo() {
		return modelos[geraNumero.nextInt(10)];
	}

	public static int geraAno() {
		int redutor = geraNumero.nextInt(10);
		if (redutor > 8) {
			redutor = geraNumero.nextInt(60);
		} else {
			redutor = geraNumero.nextInt(20);
		}

		return anoAtual - redutor;
	}
}