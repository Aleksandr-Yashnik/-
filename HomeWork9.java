import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите символ (или «виход» для выхода):");
            String simvol = scanner.nextLine();

            if (simvol.equalsIgnoreCase("пропустить")) {
                continue;

            } else if (simvol.equalsIgnoreCase("Выход")) {
                System.out.println("программа\n" + "выхода\n" + "завершена");
                break;
            }
            System.out.println("Вы ввели:" + simvol);

        }
    }
}