package cn.cty.zhiJieChaRuPaiXu;

import java.util.Arrays;

/**
 * 
 * 直接插入排序
 * 
 * 时间复杂度： n^2
 * 
 * 说明:
 * 从数组的开头两个值开始循环
 * 不断的把大的（或小的）值往后放
 * 
 * @author hlyton
 *
 * 次数 2
 */
public class ZhiJieChaRu {

	
	/**
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		
		if( array != null && array.length > 0 ) {
			System.out.println("排序过程：" );
			int j = 0;
			int temp = 0;
			
			//	循环，每次遍历j=i-1次，将最大的项移动到i处
			//	注意 i 从 1 开始
			for (int i = 1; i < array.length; i++) {
				
				j = i-1;
				temp = array[i];
				
				//	每次从 j 遍历到数组的开头（>=0）
				//	当 array[j] 大于  array[i] 时，交换
				for (; j>=0 && array[j]>temp ; j--) {
					array[j+1] = array[j];
				}
				array[j+1] = temp;
				
				System.out.println(i + "次：" + Arrays.toString(array));
			}
			
		} 
		
	}//END FUNCTION sort
	
	
	/**
	 * 使用临时变量避免一直交换
	 * 
	 * @param array
	 * @param reverse 为true则从大到小排序
	 */
	public static void sort_V2(int[] array, boolean reverse) {
		
		if( array!=null && array.length>0 ) {
			
			System.out.println("排序过程：" );
			
			int j = 0 , temp = 0;
			
			for (int i = 0; i < array.length-1; i++) {
				
				temp = i;
				
				for (j = i+1; j < array.length; j++) {
					
					if(!reverse && array[j]<array[temp]) temp = j;
					
					if( reverse && array[j]>array[temp]) temp = j;
				}
				
				if(temp != i) {
					swap(array ,i ,temp);
				}
				
				System.out.println(i + "次：" + Arrays.toString(array));
			}//for
			
		}
		
	}//END FUNCTION sort_V2
	
	
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
