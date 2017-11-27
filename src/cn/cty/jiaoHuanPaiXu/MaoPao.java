package cn.cty.jiaoHuanPaiXu;

import java.util.Arrays;

/**
 * 
 * 冒泡排序
 * 
 * 时间复杂度
 * 
 * 说明：
 * 在要排序的一组数中，对当前还未排好序的范围内的全部数，
 * 自上而下对相邻的两个数依次进行比较和调整，
 * 让较大的数往下沉，较小的往上冒。
 * 即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * 
 * @author hlyton
 *
 * 次数：1
 *
 */
public class MaoPao {

	public static void sort(int[] array) {

		if (array != null && array.length > 0) {
			
			boolean flag = true;
			
			fori:
			for( int i=0 ; i<array.length ; i++ ) {
				for( int j=1 ; j<array.length-i ; j++ ) {
					if( array[j-1] > array [j] ) {
						swap( array, j-1, j );
						flag = false;
					}
				}
				
				if(flag) {
					//	当某一趟排序没有发生交换时，则证明排序已经完成
					break fori;
				}
				flag = true;
				System.out.println(i + "次：" + Arrays.toString(array));
			}
			
		}

	}// END FUNCTION sort
	
	
	/**
	 * 
	 * @param array
	 */
	public static void sort_V2(int[] array) {

		if (array != null && array.length > 0) {
			
		}
		
	}

	
	/**
     * 交换数组中两个变量的值
     * @param array
     * @param i
     * @param j
     */
    private static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
