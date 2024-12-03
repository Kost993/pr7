class main1 {
    public static void main(String[] args) {
        int n = 5;
        int[][] pyramid = new int[n][];

        for (int i = 0; i < n; i++) {
            pyramid[i] = new int[i + 1];
            for (int j = 0; j < pyramid[i].length; j++) {
                pyramid[i][j] = j + 1;
            }
        }

        System.out.println("Піраміда в звичайному порядку:");
        for (int i = 0; i < pyramid.length; i++) {
            printRow(pyramid[i]);
        }

        System.out.println("\nПіраміда в обратному порядку:");
        for (int i = pyramid.length - 1; i >= 0; i--) {
            printRow(pyramid[i]);
        }
    }

    private static void printRow(int[] row) {
        int spaces = 10 - row.length;
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int value : row) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
