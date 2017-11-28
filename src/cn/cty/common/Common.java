package cn.cty.common;


/**
 * 
 * 通用工具类
 * 
 * @author hlyton
 *
 */
public class Common {

	/**
     * 交换数组中两个变量的值
     * @param array
     * @param i
     * @param j
     */
    public static void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
	
}
