import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args) {
        // Вызов метода для конвертации температур
        convertTemperature();

        // Вызов метода для вычисления площади круга
        calculateCircleArea();
    }

    /**
     * Метод для конвертации температур.
     * Считывает температуру в градусах Цельсия и конвертирует ее в градусы Фаренгейта.
     * Также считывает температуру в градусах Фаренгейта и конвертирует ее в градусы Цельсия.
     */
    public static void convertTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите градусы в Фаренгейтаx");
        int F = scanner.nextInt();
        F = (F - 32) * 5 / 9;
        System.out.println(F + "C");
        System.out.print("Введите градусы в Цельсиях");
        int C = scanner.nextInt();
        C = C * 9/5 + 32;
        System.out.println(C + "F");
        scanner.nextLine();// очистка буфера сканера
    }

    /**
     * Метод для вычисления площади круга.
     * Считывает радиус круга и вычисляет его площадь.
     */
    public static void calculateCircleArea () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга");
        double R = scanner.nextDouble();
        //double S = 0;
        double S = R * R * Math.PI;
        System.out.println(S + "S");
    }
}





