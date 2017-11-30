package cn.cty.zhiJieChaRuPaiXu;

import java.util.Arrays;

/**
 * 
 * 希尔排序
 * 
 * 时间复杂度：
 * 
 * 说明：
 * 
 * @author hlyton
 *
 * 次数 1
 */
public class Xier {

	
	/**
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		
		if( array != null && array.length > 0 ) {
			
			System.out.println("排序过程：" );
			
			int tmp 			= 0; //直接插入排序的临时存放容器
			int count			= 0;
			double arrLength= array.length;
			int shellLength 	= 0; //分片长度
			
			while( array.length>0 ){
				
				//	确定分片大小
				arrLength = Math.ceil( arrLength/2 );
				shellLength = (int)arrLength;
				
				//	按照分片数量排序
				forx:for (int x = 0; x < shellLength; x++) {
					int j = 0;
					fori:for (int i = x+shellLength; i < array.length; i+=shellLength) {
						
						j = i - shellLength;
						tmp = array[i];
						
						forj:for (; j>=0 && tmp<array[j]; j-=shellLength) {
							array[j+shellLength] = array[j];
						}
						
						array[j+shellLength] = tmp;
					}
				}
				
				count++;
				System.out.println("第"+count+"次：" + Arrays.toString(array));
				
				if(shellLength == 1){
					break;
				}
			}
			
		}
		
	}//END FUNCTION sort
	
}
