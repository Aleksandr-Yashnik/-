import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        convertTemperature();
        calculateCircleArea();
    }
        public static void convertTemperature () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите градусы в Фаренгейтаx");
            int F = scanner.nextInt();
            F = (F - 32) * 5 / 9;
            System.out.println(F + "C");
            System.out.print("Введите градусы в Цельсиях");
            int C = scanner.nextInt();
            C = C * 9/5 + 32;
            System.out.println(C + "F");

        }
        public static void calculateCircleArea (){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите радиус круга");



        }
    }
