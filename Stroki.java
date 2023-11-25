import java.util.Scanner;
public class Stroki {
    public static void main(String[] args) {
        // Задача 1: Анализатор текста
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для анализа:");
        String text = scanner.nextLine();
        int length = text.length();
        StringBuilder viceversa = new StringBuilder(text);
        viceversa.reverse(); // Меняет порядок символов на обратный
        System.out.println(" Characters :" + length);
        int WithoutSpaces = text.trim().length();
        int lengthWithoutSpaces = text.replaceAll("\\s","").length();
        System.out.println("number of letters :" + WithoutSpaces );
        System.out.println("Removed spaces:" +  lengthWithoutSpaces);
        System.out.println("reverse" +  " " + viceversa);
        // Задача 2: Форматирование даты
        Scanner scannerr = new Scanner(System.in);
        System.out.println("Введите дату в формате гггг-мм-дд:");
        String date = scanner.nextLine();
        String formattedDate = date;
        StringBuilder mydate = new StringBuilder(date);
        mydate.reverse();
        System.out.println("reverse" +  mydate);
        String substr1 = date.substring(8,10);
        String substr2 = date.substring(5,7);
        String substr3 = date.substring(0,4);
        System.out.println("Отформатированная дата: " + substr1+"." +substr2+"."+substr3 );
        String s4 = date.concat(" " ).concat(substr1).concat(substr2).concat(substr3);
        System.out.println("Объединение строк с помощью concat(): " + s4);



    }
}
