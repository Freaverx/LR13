package example15;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент %d: ", i + 1);
            array[i] = scanner.nextInt();
        }

        int positiveCount = 0;
        int sum = 0;
        for (int element : array) {
            if (element > 0) {
                positiveCount++;
                sum += element;
            }
        }

        if (positiveCount == 0) {
            System.out.println("Положительные элементы отсутствуют.");
        } else {
            double average = (double)sum / positiveCount;
            System.out.printf("Среднее значение положительных элементов: %.2f", average);
        }
    }
}
