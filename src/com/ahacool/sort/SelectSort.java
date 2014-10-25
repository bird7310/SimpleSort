package com.ahacool.sort;

/**
 * @ClassName SelectSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-9-25
 * 
 */
public class SelectSort {
	// 选择排序
	// 从第一位到最后一位，选出最小的数，与第一位数交换位置，然后，从第二位到最后一位，选出最小的数，与第二位数交换位置。
	// 重复该步骤，直至开始的位置是最后一位。。
	public static int[] sort(int[] pArray) {
		int size = pArray.length;
		for (int i = 0; i < size; i++) {
			int minIndex = i;
			int minNumber = pArray[i];
			for (int j = i; j < size - 1; j++) {
				if (minNumber > pArray[j + 1]) {
					minIndex = j + 1;
					minNumber = pArray[j + 1];
				}
			}
			pArray[minIndex] = pArray[i];
			pArray[i] = minNumber;
		}
		return pArray;
	}
}
