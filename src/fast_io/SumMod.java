//大数求和取模
import java.io.*;
import java.util.*;

public class SumMod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        final long MOD = 1_000_000_007L;
        long sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            if (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine(), " ");
            long x = Long.parseLong(st.nextToken());   // 用 long 读，防累加溢出
            sum = (sum + x) % MOD;
        }

        long ans = (sum % MOD + MOD) % MOD;            // 非负取模
        System.out.println(ans);
    }
}
