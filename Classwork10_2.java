import java.util.Scanner;

public class Classwork10_2 {
    public static void main(String[] args) {
        // Получить от пользователя строку и символ, узнать сколько раз встречается символ в строке?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста строку");
        String input = scanner.nextLine();
        System.out.println("Введите отдельный символ");
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (ch == input.charAt(i)) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
