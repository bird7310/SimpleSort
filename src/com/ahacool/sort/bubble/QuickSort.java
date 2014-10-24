package com.ahacool.sort.bubble;

/**
 * @ClassName QuickSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-10-22
 * 
 */
public class QuickSort {

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

	// 快速排序
	// 选择一个基准元素，第一个或者最后一个。通过一次扫描，将序列分成两个部分，一个比基准元素小，一个大于等于基准元素。再用同样方法对这两个部分分别排序。
	private static int[] sort(int[] pArray) {
		if (pArray.length > 0) {
			doSort(pArray, 0, pArray.length - 1);
		}
		return pArray;
	}

	// 递归
	private static void doSort(int[] pArray, int pFirstIndex, int pLastIndex) {
		if (pFirstIndex < pLastIndex) {
			int middle = geMiddle(pArray, pFirstIndex, pLastIndex);
			doSort(pArray, pFirstIndex, middle - 1);
			doSort(pArray, middle + 1, pLastIndex);
		}
	}

	// 核心算法，将序列分成两个部分。
	private static int geMiddle(int[] pArray, int pFirstIndex, int pLastIndex) {
		int temp = pArray[pFirstIndex];
		while (pFirstIndex < pLastIndex) {
			while (pFirstIndex < pLastIndex && pArray[pLastIndex] >= temp) {
				pLastIndex--;
			}

			pArray[pFirstIndex] = pArray[pLastIndex];
			while (pFirstIndex < pLastIndex && pArray[pFirstIndex] <= temp) {
				pFirstIndex++;
			}
			pArray[pLastIndex] = pArray[pFirstIndex];
		}
		pArray[pFirstIndex] = temp;
		return pFirstIndex;
	}

}
