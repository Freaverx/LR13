package example16;

import java.util.Scanner;

public class example16 {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int matrix = new introws;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Введите элемент [%d, %d]: ", i + 1, j + 1);
                matrixij = scanner.nextInt();
            }
        }

        System.out.print("Введите номер столбца: ");
        int columnNumber = scanner.nextInt();

        if (columnNumber < 1 || columnNumber > columns) {
            System.out.println("Столбца с таким номером не существует.");
        } else {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrixi, columnNumber + " ");
            }
        }
    }
}
