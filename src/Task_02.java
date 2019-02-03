// Написать программу сортировки по возрастанию заданного пользователем массива чисел

import java.util.Arrays;
import java.util.Scanner;

public class Task_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int length;
            System.out.println("Введите размер массива");
            length = scanner.nextInt();

            int[] array = new int[length];

            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите " + i + " элемент массива ");
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
        }
    }

