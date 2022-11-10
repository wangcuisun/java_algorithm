package com.wang.selection;

/**
 * 选择排序
 */
public class Selection {
    /**
     * 对数组a中的元素进行排序
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        for (int i = 0; i <= a.length - 2; i++) {
            //定义一个变量，记录最小元素所在的索引，默认为参与选择排序的第一个元素的索引
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                //需要比较最小索引minIndex处的值和j索引处的值
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
            }

            //交换最小索引minIndex处的值和i索引处的值
            exchange(a, i, minIndex);
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
