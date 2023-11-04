package org.object_code.object;

public class 선택정렬 {
	private static void selectionSort(int[]arr) {
		selectionSort(arr,0);
	}
	private static void selectionSort(int[]arr, int start) {
		if(start<arr.length-1) {
			int min = start;
			for(int i=start;i<arr.length;i++) {
				if(arr[i]<arr[min]) min=i;
			}
			swap(arr,start,min);
			selectionSort(arr,start+1);
		}
	}
	private static void swap(int[]arr,int index1,int index2) {
		int tmp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=tmp;
	}
	public static void main(String[] args) {
		int[]arr= {5,3,8,1,2,7};
		selectionSort(arr);
		for(int data : arr) {
			System.out.print(data+" ");
		}

	}

}
