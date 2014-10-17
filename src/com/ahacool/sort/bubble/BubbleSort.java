package com.ahacool.sort.bubble;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-9-23
 * 
 */
public class BubbleSort {

	public static int[] sArray = { 1, 8, 6, 7, 4, 2, 3, 0 };

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

	// 冒泡排序
	// 从第一位开始，比较相邻两个数，如果位置与排序要求相反，交换他们之的位置。
	private static int[] sort(int[] pArray) {
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
