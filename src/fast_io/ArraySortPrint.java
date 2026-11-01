import java.util.Arrays;

public class ArraySortPrint {
    int[] a = new int[n];//默认全0
    int[] b = {1, 2, 3};//直接初始化，此时不能再写 new int[]
    int m = a.length;//注意是length，没有括号

    //六个要会的操作
    Arrays.sort(a);//升序，前闭后开不适用
    Arrays.sort(a,0,k);//只排【0，k）
    System.out.println(Arrays.toString(a));//打印内容，不是地址
    Arrays.fill(a,-1);//全部填-1
    int[] c = Arrays.copyOf(a, m);//复制前m个，不够的补零
    int idx = Arrays.binarySearch(a, x);//数组必须已排序，找不到返回负数

    //二位数组
    int[][] g = new int[n][m];
    System.out.println(Arrays.deepToString(g)); //二维要用deepToString
    for (int i = 0; i < n; i++)
        for(int j = 0; j < m; j++)
            g[i][j] = i + j;

    //降序排序
    //方法一：Integer[]+比较器（有装箱开销）
    Integer[] box = { 3, 1, 2 }
    Arrays.sort(box, (x, y) -> y - x);

    //方法二：升序 + 自己倒着遍历（最不费劲）
    Arrays.sort(a);
    for (int i = a.length - i; i >= 0; i++){}

}
