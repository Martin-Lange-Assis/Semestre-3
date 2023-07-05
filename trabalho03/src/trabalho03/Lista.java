// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis
package trabalho03;
public interface Lista<T> {

	void inserir(T valor);

	int buscar(T valor);

	void retirar(T valor);

	String exibir();

	Lista<T> copiar();

	int getTamanho();

	T pegar(int pos);

	void concatenar(Lista<T> outra);

	boolean estaVazia();

	Lista<T> dividir();

}