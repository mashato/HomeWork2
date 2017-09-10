import java.util.Scanner;

/**
 * Created by MARIA
 */
public class HomeWork2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, укажите Ваше имя.");
        String name = scanner.nextLine();

        System.out.println("Пожалуйста, укажите Ваш город.");
        String city = scanner.nextLine();

        System.out.println("Пожалуйста, укажите Ваш возраст.");
        int age = scanner.nextInt(); scanner.nextLine();

        System.out.println("Пожалуйста, укажите Ваше хобби. Чем Вы занимаетесь? (в творительном падеже).");
        String hobby = scanner.nextLine();


        System.out.println("Имя:\t\t" + name );
        System.out.println("Город:\t\t" + city);
        System.out.println("Возраст:\t" + age);
        System.out.println("Хобби:\t\t" + "занятия " + hobby);
        System.out.println("----------------------------------");

        System.out.println("Человек  по  имени " + name + " живет  в городе " + city + "." );
        System.out.println("Этому  человеку " + age + " лет  и  любит  он заниматься " + hobby + ".");
        System.out.println("----------------------------------");

        System.out.println(name + "\t- имя");
        System.out.println(city + "\t- город");
        System.out.println(age + "\t- возраст");
        System.out.println("занятия " + hobby + "\t- хобби");


    }
}
