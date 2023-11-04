package org.object_code.object;

public class 버블정렬 {
	private static void BubbleSort(int[] arr) {
		BubbleSort(arr, arr.length - 1);
	}

	private static void BubbleSort(int[] arr, int last) {
		if (last > 0) {
			for (int i = 1; i <= last; i++) {
				if (arr[i - 1] > arr[i]) {
					swap(arr, i - 1, i);
				}
			}
			BubbleSort(arr,last-1);
		}
	}

	private static void swap(int[] arr, int source, int target) {
		int tmp = arr[source];
		arr[source] = arr[target];
		arr[target] = tmp;
	}

	private static void printArr(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 8, 2, 4 };
		printArr(arr);
		BubbleSort(arr);
		printArr(arr);

	}

}
