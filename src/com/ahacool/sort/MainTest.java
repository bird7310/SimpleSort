package com.ahacool.sort;

/**
 * @ClassName MainTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-10-24
 * 
 */
public class MainTest {

	public static int[] sArray = {
			1, 8, 6, 7, 4, 2, 3, 0 };

	public static void main(String[] args) {
		testForSort();
	}
	
	private static void testForSort(){
		System.out.println("排序前：");
		int size = sArray.length;
		for (int i = 0; i < size; i++) {
			System.out.print(sArray[i] + " ");
		}

//		int[] newArray = BubbleSort.sort(sArray);
//		int[] newArray = InsertSort.sort(sArray);
//		int[] newArray = QuickSort.sort(sArray);
//		int[] newArray = SelectSort.sort(sArray);
		int[] newArray = ShellSort.sort(sArray);

		System.out.println("\n排序后：");
		for (int i = 0; i < size; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
	
	private static void testForTime(){
		
	}

}
