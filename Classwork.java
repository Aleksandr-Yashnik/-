
import java.util.Scanner;

public class Classwork {
    public static void main(String[]args){
        double amount = 100;

        String cur = "euro";

        Currency currency = Currency.EUR;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter season name");
        String season = scanner.nextLine();
        Seasons currentSeason = Seasons.AUTUUMN;

                if (season.equalsIgnoreCase("winter")){
                    currentSeason = Seasons.WINTER;
                }


        if(currentSeason == Seasons.AUTUUMN) {
            System.out.println("Сейчас осень, готовим препараты для нормализации сна");
        } else if (currentSeason == Seasons.WINTER) {
            System.out.println("Сейчас зима, готовим препараты для борьбыс простудой");
        } else if (currentSeason == Seasons.SPRING) {
            System.out.println("Сейчас весна готовим витамины");
        } else if (currentSeason.equals(Seasons.SUMMER)) {
            System.out.println("Сейчас лето, готовим препараты, для борьбы с насикомыми ");
        }else {
            System.out.println("Некоректные значения");
        }
        System.out.println(currentSeason);
    }
    enum Seasons {
        WINTER,
        SPRING,
        SUMMER,
        AUTUUMN;


    }
}
