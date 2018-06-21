package cn.cty.ChaRuPaiXu;

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
 * 次数 0
 */
public class Xier {

	
	/**
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		
		if( array != null && array.length > 0 ) {
			
			System.out.println("排序过程：" );
			
			int count			= 0; //单纯计数使用
			int tmp 			= 0; //直接插入排序的临时存放容器
			double arrLength= array.length;
			int shellLength 	= 0; //分片长度
			
			while( array.length>0 ){
				
				//	确定分片大小
				arrLength = Math.ceil( arrLength/2 );
				shellLength = (int)arrLength;
				
				//System.out.println("shell:" + shellLength);
				
				//	按照分片数量排序
				//	x 即分为shellLength组，随着分片减少，分片中的元素增多
				forx:for (int x = 0; x < shellLength; x++) {
					int j = 0;
					fori:for (int i = x+shellLength; i < array.length; i+=shellLength) {
						
						j = i - shellLength;
						tmp = array[i];
						
						forj:for (; j>=0 && tmp<array[j]; j-=shellLength) {
							array[j+shellLength] = array[j];
							System.out.println("j：" + j + Arrays.toString(array));
						}
						
						array[j+shellLength] = tmp; //因为forj最后会j-=shellLength,所以这里的下标是j+shellLength
						System.out.println("i：" + i + Arrays.toString(array));
					}
					
					System.out.println("x：" + x + Arrays.toString(array));
				}
				
				count++;
				System.out.println("第"+count+"次：" + Arrays.toString(array));
				
				if(shellLength == 1){
					break;
				}
			}
			
		}
		
	}//END FUNCTION sort
	
	
	/**
	 * 
	 * @param arr
	 */
	public static void sort_V2(int[] arr) {
		
		
		
	}
	
}
