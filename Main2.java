import java.util.Random;

class main2 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;

        double[][] array = new double[rows][cols];
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 1 + random.nextDouble() * 99;
            }
        }

        System.out.println("Початковий масив:");
        printArray(array);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 != 0 || j % 2 != 0) {
                    array[i][j] = Math.sqrt(array[i][j]);
                }
            }
        }

        System.out.println("\nКорінь з масиву:");
        printArray(array);
    }

    private static void printArray(double[][] array) {
        for (double[] row : array) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }
}
