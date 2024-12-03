import java.util.Scanner;

class main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть розмір квадратної матриці:");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Початкова матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transposedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        System.out.println("Результат:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposedMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}