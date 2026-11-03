import java.util.Arrays;

public class ArraySortPrint {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int x = 2;

        // ---- 数组基础 ----
        int[] a = new int[n];          // 默认全 0
        int[] b = {1, 2, 3};           // 直接初始化，此时不能再写 new int[]
        int m = a.length;              // 注意是 length，没有括号
        System.out.println("a.length = " + m);
        System.out.println("b = " + Arrays.toString(b));

        // ---- 六个必会操作 ----
        Arrays.sort(a);                          // 升序
        Arrays.sort(a, 0, k);                    // 只排 [0, k)
        System.out.println("toString(a) = " + Arrays.toString(a));  // 打印内容
        Arrays.fill(a, -1);                      // 全部填 -1
        System.out.println("fill 后 a = " + Arrays.toString(a));
        int[] c = Arrays.copyOf(a, m);           // 复制前 m 个，不够补 0
        System.out.println("copyOf c = " + Arrays.toString(c));
        int idx = Arrays.binarySearch(a, x);     // 数组必须已排序，找不到返回负数
        System.out.println("binarySearch(" + x + ") = " + idx);

        // ---- 二维数组 ----
        int[][] g = new int[n][m];
        System.out.println("g = " + Arrays.deepToString(g));  // 二维要用 deepToString
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                g[i][j] = i + j;
        System.out.println("g 赋值后 = " + Arrays.deepToString(g));

        // ---- 降序排序 ----
        // 方法一：Integer[] + 比较器（有装箱开销）
        Integer[] box = {3, 1, 2};               // 补分号
        Arrays.sort(box, (x1, y1) -> y1 - x1);   // lambda 参数别和外层 x 重名
        System.out.println("box 降序 = " + Arrays.toString(box));

        // 方法二：升序 + 自己倒着遍历（最省事）
        int[] arr2 = {3, 1, 2};
        Arrays.sort(arr2);
        for (int i = arr2.length - 1; i >= 0; i--) {  // - 1，不是 - i；i--
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
