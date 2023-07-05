package ordenacao;

import java.util.Arrays;

public class QuickSortTest {
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int[] arr = { 10, 7, 8, 9, 1, 5 };
		System.out.println("Array original: " + Arrays.toString(arr));
		qs.ordenar(arr, 0, arr.length - 1);
		System.out.println("Array ordenado: " + Arrays.toString(arr));
	}
}
