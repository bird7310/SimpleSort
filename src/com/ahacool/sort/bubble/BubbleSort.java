package com.ahacool.sort.bubble;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-9-23
 * 
 */
public class BubbleSort {

	public static int[] sArray = {
			1, 8, 6, 7, 4, 2, 3, 0 };

	public static void main(String[] args) {
		sort(sArray);
	}

	private static void sort(int[] pArray) {
		int[] array = pArray.clone();
		int size = array.length;
		
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("排序前：");
		for (int i = 0; i < size; i++) {
			System.out.print(pArray[i] + " ");
		}
		System.out.println("\n排序后：");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
