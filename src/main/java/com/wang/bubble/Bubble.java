package com.wang.bubble;

/**
 * 冒泡排序
 */
public class Bubble {

    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        //外层for循环控制的是一共需要几轮排序
        //一轮确定一个元素，第一轮确定一个，第二轮确定两个，第六轮确定六个，在第五轮的时候就已经确定了最后两个
        for (int i = a.length - 1; i > 0; i--) {
            //内层for循环控制的是每一轮需要几次比较
            //第一轮比较五次，第二轮比较四次，第五轮比较一次
            for (int j = 0; j < i; j++) {
                //比较索引j和索引j+1处的值
                if (greater(a[j], a[j + 1])) {
                    exchange(a, j, j + 1);
                }
            }
        }
    }

    /**
     * 比较v元素是否大于w元素
     *
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 交换数组i位置和j位置处的元素
     *
     * @param a
     * @param i
     * @param j
     */
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
