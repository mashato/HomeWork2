import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by MARIA on 19.09.17.
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Пункт 1,2. Определяем массив

        System.out.println("Введите размер массива.");

        int x = scanner.nextInt();
        int[] array = new int[x];

        System.out.println("Заполните этот массив.");
        for(int i = 0; i < array.length;i++) {
            array[i] = scanner.nextInt(); scanner.nextLine();
        }

//Пункт 3,4. Ищем минимальное и максимальное число в массиве

        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }

        int max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }


//Сортируем массив сортировкой BubbleSort
        for(int j = 0; j < array.length;j++) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    //swap
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

//Пункт 5. Ищем количество повторений числа 5 в массиве
        int temp = 0;
        for(int i = 0; i < array.length;i++) {
            if(array[i] == 5) {
                temp = temp + 1;
            }
        }

//Пункт 6. Выводим результаты в консоль и  отсортированный массив.

        System.out.println("Миннимальное число в массиве: " + min);
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Количество повторений числа 5: " + temp);
        System.out.println("Вот Ваш массив в порядке нарастания: " + Arrays.toString(array));


    }

}

