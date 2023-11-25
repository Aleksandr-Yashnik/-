import java.util.Scanner;
public class Homework2 {
    public static void main(String[] args) {
        // создайте сканнер, который будет просить пользователя ввести число типа int,
        // запишите это число в переменную num
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        numberToHexString(num);
        numberToOctaString(num);
        numberToBinaryString(num);
    }
    // в данном задании вы должны получить число и распечать строку, которая представляет его шестнадцатиричное представление:
    private static void numberToHexString(int num) {
        String hex = Integer.toHexString(num);
        System.out.println("шестнадцатиричное представление");
        System.out.println(hex);
    }
    // в данном задании вы должны получить число и распечать строку, которая представляет его восьмеричное представление:
    private static void numberToOctaString(int num) {
        String octal = Integer.toOctalString(num);
        System.out.println("восьмеричное представление");
        System.out.println(octal);
    }
    // в данном задании вы должны получить число и распечать строку, которая представляет его двоичное представление:
    private static void numberToBinaryString(int num) {
        String binari = Integer.toBinaryString(num);
        System.out.println("двоичное представление");
        System.out.println(binari);
    }
}
