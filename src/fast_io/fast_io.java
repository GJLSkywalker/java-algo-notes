import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fast_io {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 读一个整数（单独一行）
        int n = Integer.parseInt(br.readLine().trim());

        // 读 n 个数，可能跨多行
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");  // ← 空格，不是空串
        for (int i = 0; i < n; i++) {
            if (!st.hasMoreTokens()) {                 // 本行读完了就再读一行
                st = new StringTokenizer(br.readLine(), " ");
            }
            a[i] = Integer.parseInt(st.nextToken());
        }

        // 输出
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]).append(i == n - 1 ? '\n' : ' ');
        }
        System.out.print(sb);

        // 不定行数（读到文件结束）
        String line;
        StringTokenizer st2 = null;                    // ← 换个名，别重复声明
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) continue;       // 空行跳过
            st2 = new StringTokenizer(line, " ");
            while (st2.hasMoreTokens()) {
                int x = Integer.parseInt(st2.nextToken());
                // 这里放你的逻辑
            }
        }
    }   // ← main 收尾
}       // ← class 收尾

