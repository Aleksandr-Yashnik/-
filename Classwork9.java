import java.util.Scanner;

public class Classwork9 {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);
        //изначальная сумма покупки
        int amount = 0;

        do{
            System.out.println("Введите стоимость отдельного товара(целое число) или  -1, если вызакончили");
           int price = Integer.parseInt(scanner.nextLine());// приобразуетстроку в числу, в данном примере к числу 123

            System.out.println("Желаете ли вы положитьв корзину? yes/no");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Хорошо, сумма данного товара не прибавленна к общей корзине");
                continue;
            }

            if(price ==-1) {
                break;
            }
               amount += price;

        } while (true);
        System.out.println("Стоимость всех вещей в вашей корзине равняется" + amount);
    }
}
