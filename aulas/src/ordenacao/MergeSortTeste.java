package ordenacao;

import java.util.Arrays;

public class MergeSortTeste {
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] arr = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Array original: " + Arrays.toString(arr));
		ms.ordenar(arr, 0, arr.length - 1);
		System.out.println("Array ordenado: " + Arrays.toString(arr));
	}
}
