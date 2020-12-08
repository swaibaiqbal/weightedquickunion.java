Javac weightedquickunionuf
javac weightedquickunionuf<input.txt
public class WeightedQuickUnionUF {
    private int[] parent;   
    private int[] size;     
    private int count; 
public WeightedQuickUnionUF(int n) {
        count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }
public int count() {
        return count;
    }
public int find(int p) {
        validate(p);
        while (p != parent[p])
            p = parent[p];
        return p;
    }
public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
 public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) return;
}
        else {
            parent[rootQ] = rootP;
            size[rootP] += size[rootQ];
        }
        count--;
    }
 public static void main(String[] args) {
        int n = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.find(p) == uf.find(q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }

}