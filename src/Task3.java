import java.util.Scanner;

/**
 *
 * Написать функцию, возвращающую разницу между самым большим и
 * самым маленьким элементами переданного не пустого массива.
 */
public class Task3 {

    /**
     * Метод по поиску двух стоящих рядом элементов массива, равных 0
     */
    public void doubleZeroInArray() {
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
                    for (int i = 1; i < array.length; i++)
                    {
                        if (array[i] == 0 && array[i-1] == 0)
                        {
                            count +=1;

                        }
                    }
                    if (count >=1)
                    {
                        System.out.println(true);
                    }
                    else
                    {
                        System.out.println(false);
                    }

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