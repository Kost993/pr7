import java.util.Scanner;

class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість рядків матриці:");
        int rows = scanner.nextInt();
        System.out.println("Введіть кількість стовпців матриці:");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Початкова матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nВиберіть показник для другорядної матриці:");
        System.out.println("1 - Видалити строку");
        System.out.println("2 - Видалити столбець");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введіть номер рядка для видалення (від 1 до " + rows + "):");
            int rowToRemove = scanner.nextInt() - 1;

            if (rowToRemove >= 0 && rowToRemove < rows) {
                int[][] newMatrix = new int[rows - 1][cols];
                for (int i = 0, newRow = 0; i < rows; i++) {
                    if (i == rowToRemove) continue;
                    for (int j = 0; j < cols; j++) {
                        newMatrix[newRow][j] = matrix[i][j];
                    }
                    newRow++;
                }
                printMatrix(newMatrix);
            } else {
                System.out.println("Невірний номер рядка.");
            }

        } else if (choice == 2) {
            System.out.println("Введіть номер стовпця для видалення (від 1 до " + cols + "):");
            int colToRemove = scanner.nextInt() - 1;

            if (colToRemove >= 0 && colToRemove < cols) {
                int[][] newMatrix = new int[rows][cols - 1];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0, newCol = 0; j < cols; j++) {
                        if (j == colToRemove) continue;
                        newMatrix[i][newCol] = matrix[i][j];
                        newCol++;
                    }
                }
                printMatrix(newMatrix);
            } else {
                System.out.println("Невірний номер стовпця.");
            }

        } else {
            System.out.println("Невірний вибір.");
        }

        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        System.out.println("Результат:");
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
