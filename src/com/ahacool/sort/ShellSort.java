package com.ahacool.sort;

/**
 * @ClassName ShellSort
 * @Description TODO
 * @author Moto
 * @date 2014 2014-10-23
 * 
 */
public class ShellSort {
	// 希尔排序
	// 对序列按某个增量d（d/2）分成若干组，这些组的元素在原序列的位置不变，然后分别对这些组使用插入排序。
	// 减小增量d（d/2），再对序列分组使用插入排序，直至增量为1。
	public static int[] sort(int[] pArray) {
		int size = pArray.length;
		int d = size;
		while (true) {
			d = (int) Math.ceil(d / 2);
			for (int x = 0; x < d; x++) {
				// 插入排序
				for (int i = x + d; i < size; i += d) {
					int j = i - d;
					int keyNumber = pArray[i];
					while (j >= 0 && keyNumber < pArray[j]) {
						pArray[j + d] = pArray[j];
						j = j - d;
					}
					pArray[j + d] = keyNumber;
				}
			}
			if (d == 1) {
				break;
			}
		}
		return pArray;
	}
}
