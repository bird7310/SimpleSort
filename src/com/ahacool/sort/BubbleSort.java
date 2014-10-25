package com.ahacool.sort;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-9-23
 * 
 */
public class BubbleSort {
	// 冒泡排序
	// 从第一位开始，比较相邻两个数，如果位置与排序要求相反，交换他们之的位置。
	public static int[] sort(int[] pArray) {
		int size = pArray.length;
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (pArray[j] > pArray[j + 1]) {
					int temp = pArray[j + 1];
					pArray[j + 1] = pArray[j];
					pArray[j] = temp;
				}
			}
		}
		return pArray;
	}
}
