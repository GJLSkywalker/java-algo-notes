import java.io.*;
import java.util.*;

public class MostFrequent {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] a = new int[n];

        // 1. 读入（快读骨架）
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            if (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine(), " ");
            a[i] = Integer.parseInt(st.nextToken());
        }

        // ==========================================
        // ↓↓↓ 核心：这 4 行是第 5 节唯一要【从零默写】的 ↓↓↓
        // ==========================================
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : a) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }
        // ==========================================

        // 找出现次数最多的（并列输出最小的）
        int best = -1;
        int bestCnt = -1;
        for (Map.Entry<Integer, Integer> e : cnt.entrySet()) {
            if (e.getValue() > bestCnt || (e.getValue() == bestCnt && e.getKey() < best)) {
                bestCnt = e.getValue();
                best = e.getKey();
            }
        }

        System.out.println(best);
    }
}
