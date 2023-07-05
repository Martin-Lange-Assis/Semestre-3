// Andre Heller,Gabriel de Souza Klauck e Martin Lange de Assis
package ordenacao;

public interface Sort<T extends Comparable<T>> {
	void sort(T[] vetor);
}