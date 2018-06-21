package cn.cty.jiaoHuanPaiXu;

import java.util.Arrays;

import cn.cty.common.Common;

/**
 * 
 * 冒泡排序
 * 
 * 时间复杂度
 * 
 * 说明： 在要排序的一组数中，对当前还未排好序的范围内的全部数， 自上而下对相邻的两个数依次进行比较和调整， 让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * 
 * @author hlyton
 *
 *         次数：1
 *
 */
public class MaoPao {

	public static void sort(int[] array) {

		if (array != null && array.length > 0) {

			boolean flag = true;

			fori: for (int i = 0; i < array.length; i++) {
				for (int j = 1; j < array.length - i; j++) {
					if (array[j - 1] > array[j]) {
						Common.swap(array, j - 1, j);
						flag = false;
					}
				}

				if (flag) {
					// 当某一趟排序没有发生交换时，则证明排序已经完成
					break fori;
				}
				flag = true;
				System.out.println(i + "次：" + Arrays.toString(array));
			}
		}
	}// END FUNCTION sort

	/**
	 * 
	 * 
	 * @param arr
	 * @param reverse
	 *            是否从大到小排序
	 */
	public static void sort_V2(int[] arr, boolean reverse) {

		if (arr != null && arr.length > 0) {

			boolean flag = true;

			forx: for (int x = arr.length - 1; x > 0; x--) {
				for (int y = 0; y < x; y++) {
					//	这样改反而增加了排序时间，以后分开写吧
					if (!reverse) {
						flag = sort_V2_MinToMax(arr, y, flag);
					}else {
						flag = sort_V2_MaxToMin(arr, y, flag);
					}
				}

				if (flag) {
					break forx;
				}
				flag = true;

				System.out.println(arr.length - x + "次：" + Arrays.toString(arr));
			}
		}
	}// END FUNCTION sort_V2

	
	/**
	 * 
	 * @param arr
	 * @param y
	 * @param flag
	 * @return
	 */
	private static boolean sort_V2_MinToMax(int[] arr, int y, boolean flag) {
		if(arr[y] > arr[y + 1]) {
			Common.swap(arr, y, y + 1);
			flag = false;
		}
		return flag;
	}

	
	/**
	 * 
	 * @param arr
	 * @param y
	 * @param flag
	 * @return
	 */
	private static boolean sort_V2_MaxToMin(int[] arr, int y, boolean flag) {
		if(arr[y] < arr[y + 1]) {
			Common.swap(arr, y, y + 1);
			flag = false;
		}
		return flag;
	}

}
