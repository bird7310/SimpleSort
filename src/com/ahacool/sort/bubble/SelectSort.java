package com.ahacool.sort.bubble;

/**
 * @ClassName SelectSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-9-25
 * 
 */
public class SelectSort {

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

	// 选择排序
	// 从第一位到最后一位，选出最小的数，与第一位数交换位置，然后，从第二位到最后一位，选出最小的数，与第二位数交换位置。
	// 重复该步骤，直至开始的位置是最后一位。。
	private static int[] sort(int[] pArray) {
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
