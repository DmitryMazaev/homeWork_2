import java.sql.SQLOutput;
import java.util.Scanner;

/**
 *
 * Написать функцию, возвращающую разницу между самым большим и
 * самым маленьким элементами переданного не пустого массива.
 */
public class Task2 {

    /**
     * Метод вычисления разницы между самым большим и самым маленьким элементов массива
     */
    public void difference() {
        while (true) {
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
                    int max = array[0];
                    int min = array[0];

                    for(int i = 1; i < array.length; i++)
                    {
                        if (array[i] > max)
                        {
                            max = array[i];
                        }
                    }
                    for(int i = 1; i < array.length; i++)
                    {
                        if (array[i] < min)
                        {
                            min = array[i];
                        }
                    }

                    int dif = max - min;
                    System.out.println("Разница между максимальным и минимальным элементами = " + dif);
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