public class WeakVertices {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        while (n != -1) {
            int[][] vertice = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    vertice[i][j] = io.getInt();
                }
            }

            for (int i = 0; i < n; i++) {
                boolean weakVertice = true;
                int v1 = 0, v2 = 0;
                for (int j = 0; j < n; j++) {
                    if (vertice[i][j] == 1) {
                        v1 = j;
                        for (int k = j; k < n; k++) {
                            if (vertice[i][k] == 1) {
                                v2 = k;
                                if (vertice[v1][v2] == 1) {
                                    weakVertice = false;
                                    j = 21;
                                }
                            }
                        }
                    }
                }
                if (weakVertice) System.out.print(i + " ");
            }
            System.out.println();
            n = io.getInt();
        }
    }
}