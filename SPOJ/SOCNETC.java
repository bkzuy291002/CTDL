package CTDL.SPOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class SOCNETC {
    static int parent[] = new int[1000000];
    static int r[] = new int[1000000];
    static int sz[] = new int[1000000];

    static int find_set(int x) {
        if (parent[x] != x)
            parent[x] = find_set(parent[x]);

        return parent[x];
    }

    static void union_set(int x, int y) {
        int px = find_set(x);
        int py = find_set(y);
        if (px != py) {
            if (sz[px] < sz[py]) {
                parent[px] = parent[py];
                sz[py] += sz[px];
            } else {
                parent[py] = parent[px];
                sz[px] += sz[py];
            }

        }
    }

    static void make_set(long n) {
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            r[i] = 0;
            sz[i] = 1;
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(br.readLine());
        char c;
        String input;
        make_set(n);
        while (q-- > 0) {
            input = br.readLine();
            c = input.charAt(0);
            if (c == 'A') {
                int x = Integer.parseInt(input.substring(input.indexOf(" ") + 1, input.lastIndexOf(" ")));
                int y = Integer.parseInt(input.substring(input.lastIndexOf(" ") + 1));
                int pi = find_set(x);
                int pj = find_set(y);
                if (pi != pj) {
                    if (sz[pi] + sz[pj] <= m)
                        union_set(x, y);
                }
            } else if (c == 'E') {
                int x = Integer.parseInt(input.substring(input.indexOf(" ") + 1, input.lastIndexOf(" ")));
                int y = Integer.parseInt(input.substring(input.lastIndexOf(" ") + 1));
                if (find_set(x) == find_set(y))
                    System.out.println("Yes");
                else
                    System.out.println("No");
            } else {
                int x = Integer.parseInt(input.substring(input.lastIndexOf(" ") + 1));
                System.out.println(sz[find_set(x)]);
            }
        }
    }
}
