package com.ahacool.sort.bubble;

/**
 * @ClassName InsertSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-10-17
 * 
 */
public class InsertSort {

	public static int[] sArray = {
			1, 8, 6, 7, 4, 2, 3, 0 };

	public static void main(String[] args) {
		System.out.println("排序前：");
		int size = sArray.length;
		for (int i = 0; i < size; i++) {
			System.out.print(sArray[i] + " ");
		}

		int[] newArray = sort(sArray);

		System.out.println("\n排序后：");
		for (int i = 0; i < size; i++) {
			System.out.print(newArray[i] + " ");
		}
	}

	// 插入排序 
	// 假设前N(N > 1)个数已经排好序，将后面的数字插入进去。从某一个方向向另一个方向一次比较大小，将他插入在对应的位置。
	private static int[] sort(int[] pArray) {
		int size = pArray.length;
		for (int i = 1; i < size; i++) {
			int keyNumber = pArray[i];
			int j = i;
			while (j > 0 && keyNumber < pArray[j - 1]) {
				pArray[j] = pArray[j - 1];
				j--;
			}
			pArray[j] = keyNumber;
		}
		return pArray;
	}

}
