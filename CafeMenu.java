import java.util.Scanner;
public class CafeMenu {
    public static void main(String[] args) {
        Dishes();
    }
    public static void Dishes() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добро пожаловать в наше кафе! Пожалуйста, выберите категорию:");
            System.out.println("1 - Блюда\n2 - Напитки\n3 - Десерты\n4 - Завершить заказ");
            System.out.print("Введите номер категории: ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println(" Блюда\n1 - Borscht\n2 - Soup\n3 - Buckwheat_with_meat\n4 - Dumplings\n5 - Завершить заказ ");
            } else if (choice == 2) {
                System.out.println("Напитки\n1 - Coffee\n2 - Tea\n3 - Water\n4 - Lemonade\n5 - Завершить заказ");
            } else if (choice == 3) {
                System.out.println("Дисерты\n1 - Pie\n2 - Pancakes\n3 - Donuts\n4 - Cheesecake\n5 - Завершить заказ");
            } else if (choice == 4) {
                System.out.println("Завершить заказ");
                return;
            } else {
                System.out.println("Некоректные значения");
            }
            int choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println("Блюда\n1 - Borscht\n2 - Soup\n3 - Buckwheat_with_meat\n4 - Dumplings\n5 - Завершить заказ");
                    break;
                case 2:
                    System.out.println("Напитки\n1 - Coffee\n2 - Tea\n3 - Water\n4 - Lemonade\n5 - Завершить заказ");
                    break;
                case 3:
                    System.out.println("Дисерты\n1 - Pie\n2 - Pancakes\n3 - Donuts\n4 - Cheesecake\n5 - Завершить заказ");
                    break;
                case 4:
                    System.out.println("Завершить заказ");
                    return;
                default:
                    System.out.println("Error");
                    break;
            }
            System.out.println(" Хотите что-то добавить в заказ");
            System.out.println("Ваш заказ принят. Приятного аппетита!");
            return;

        }

    }

}