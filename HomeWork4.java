import java.util.Scanner;

/**
 * Created by MARIA on 25.09.17.
 */
public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("До какого числа посчитать?");
        int inputNum = scanner.nextInt();
        System.out.println("Посчитали используя рекурсию: " + countUsingRecursion(inputNum));
        System.out.println("Посчитали используя цыкл: " + countUsingCycle(inputNum));
        System.out.println("Задайте ширину для прямоугольника.");
        int width = scanner.nextInt();
        System.out.println("Задайте высоту для прямоугольника.");
        int height = scanner.nextInt();
        String cycle = drawRectangle(width,height);
        System.out.println("Используя цикл:\n" +cycle);
        String cycle2 = drawRectangle(width);
        System.out.println("Используя цикл:\n" +cycle2);
        String recursion = drawRectangleRecursion(width,height);
        System.out.println("Используя рекурсию:\n" +recursion);

    }

    public static String countUsingCycle(int num) {
        String numbers = " ";
       if(num == 0) {
           return "0";
       }
       else {
           for (int i = 0; i <= num; i++) {
               numbers = numbers + i + " ";
           }
       }
       return numbers;
    }

    public static String drawRectangle(int width,int height) {
        String symbol = "+";
        String result = "";
        for(int i = 0; i < height;i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += symbol;
            }
            result += line + "\n";
        }
        return result;
    }

    public static String drawRectangle(int width) {
        String symbol = "+";
        int height = width;
        String result = "";
        for(int i = 0; i < height;i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += symbol;
            }
            result += line + "\n";
        }
        return result;

    }

    public static String countUsingRecursion(int num) {

        if(num == 0) {
            return "0";
        }
         return num + " " + countUsingRecursion(num-1);
    }




//незаконченное задание

    public static String drawRectangleRecursion(int width,int height) {
        String symbol = "+";
        String line = "";
        String result = "";
        if(width == 0) {
            return "";
        }
        line = symbol + drawRectangleRecursion(width-1,height);
        if(height == 0) {
            return "";
        }
        result = line + "\n" + drawRectangleRecursion(width,height-1);
        return result;

//        if(width != 0) {
//            ;
//            System.out.println("line\n" + line);
//        }

    }

}
