package fast_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fast_io {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            //读一个读数
            int n = Integer.parseInt(br.readLine().trim());

            //读n个数，可能跨多行
            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine(),"");
            for (int i = 0;i < n; i++){
                if (!st.hasMoreTokens()){//本行读完再读一行

                    st = new StringTokenizer(br.readLine(), "");
                }
                a[i] = Integer.parseInt(st.nextToken());
            }

            //输出
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++){
                sb.append(a[i]).append(i == n - 1 ? '\n' : ' ');
            }
            System.out.print(sb);
        }
    }

