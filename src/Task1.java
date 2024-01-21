import java.util.Scanner;

/**
 *
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */
public class Task1 {

    /**
     * Метод проверки количества четных элементов в массиве
     */
    public void evenNumbers() {
        while (true) {
            int count = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("Ведите число элементов массива: ");
            int N = in.nextInt();
            if (N > 0)
            {
                try
                {
                    int[] array = new int[N];
                    for (int i = 0; i < N; i++) {
                        System.out.print("Введите " + i + " элемент массива: ");
                        array[i] = in.nextInt();
                    }
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 == 0) {
                            count++;
                        }
                    }
                    System.out.println("Количество четных элементов массива: " + count);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Пожалуйста, введите положительное число");
                }
            }
            else
            {
                System.out.println("Пожалуйста, введите положительное число");
            }
        }
    }
}