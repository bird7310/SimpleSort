package com.ahacool.sort;

/**
 * @ClassName InsertSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-10-17
 * 
 */
public class InsertSort {
	// 插入排序
	// 假设前N(N > 1)个数已经排好序，将后面的数字插入进去。从某一个方向向另一个方向一次比较大小，将他插入在对应的位置。
	public static int[] sort(int[] pArray) {
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
