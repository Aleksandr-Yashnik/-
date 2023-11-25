import java.util.Scanner;
public class Home7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Сегодня хорошая погода? true/false");
        boolean Sunny = scanner.nextBoolean();

        System.out.println("Хотите ли вы провести время на природе? true/false");
        boolean Nature = scanner.nextBoolean();

        System.out.println("Интересуетесь ли вы спортом? true/false");
        boolean Sport = scanner.nextBoolean();

        if (Sunny && Nature) {
            System.out.println("На основе ваших ответов мы рекомендуем вам устроить пикник!");
        } else if (Sport) {
            System.out.println("Посетить спортивный зал");
        } else {
            System.out.println("Сходите в кино");
        }
        existenceOfTheTriangle();
    }
    public static void existenceOfTheTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите сторону A триугольника");
        double A = scanner.nextDouble();
        System.out.println(" Введите сторону B триугольника");
        double B = scanner.nextDouble();
        System.out.println(" Введите сторону C триугольника");
        double C = scanner.nextDouble();

        if (A == B && B == C) {
            System.out.println("Равносторонний");
        } else if (A == 50  || B == 50 || C == 50 ) {
            System.out.println("Разносторонний ");
        } else  {
            System.out.println("Треугольник с введенными зданиями не может существовать");
        }
    }

}
