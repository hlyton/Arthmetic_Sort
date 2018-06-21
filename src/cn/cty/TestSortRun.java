package cn.cty;

import java.util.Arrays;

import cn.cty.ChaRuPaiXu.Xier;
import cn.cty.ChaRuPaiXu.ZhiJieChaRu;
import cn.cty.jiaoHuanPaiXu.MaoPao;

/**
 * 排序工具类测试
 * 
 * @author hlyton
 *
 */
public class TestSortRun {
	
	/**
	 * 
	 * @param arr
	 */
	private static void sort(int[] arr) {
		if( arr != null && arr.length > 0 ) {
			System.out.println("原始的数组:" + Arrays.toString(arr));
			
			//	插入排序 -- 直接插入
			//ZhiJieChaRu.sort(arr);
			//ZhiJieChaRu.sort_V2(arr, false);
			//	插入排序 -- 希尔排序
			Xier.sort(arr);
			
			//	交换排序 -- 冒泡
			//MaoPao.sort(arr);
			//MaoPao.sort_V2(arr, false);
			
			System.out.println("排序后数组：" + Arrays.toString(arr));
		} else {
			System.out.println("数组为空不进行排序" );
		}
	}
	
	
	public static void main(String[] args) {
		
		//int[] arr = {9,8,7,6,5,4,3,2,1};
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		
		long startTime = System.currentTimeMillis();
		
		sort(arr);
		
		System.out.println("消耗时间：" + (System.currentTimeMillis() - startTime) + "毫秒");
		
	}
	
}
