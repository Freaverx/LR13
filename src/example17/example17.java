package example17;

import java.util.Scanner;

public class example17 {
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        byte array = new byte;
        for (int i = 0; i < size; i++) {
            System.out.printf("Введите элемент %d: ", i + 1);
            arrayi = scanner.nextByte();
        }

        int sum = 0;
        for (byte element : array) {
            sum += element;
        }

        if (sum > Byte.MAX_VALUE || sum < Byte.MIN_VALUE) {
            System.out.println("Значение выходит за границы диапазона типа byte.");
        } else {
            System.out.printf("Сумма элементов массива: %d", sum);
        }
    }
}
