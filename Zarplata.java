/**
 * Здесь будет описанн расход зарплаты после всех трат.
 */
public class Zarplata {
    public static void main(String[] args) {
      double x = 15_000.00; // X - зарплата
      double y = 233.05; //  Y - Копилка
        double r = 2500.00; // R -  Расходы на нужды
        double p = 850.00; // P - премия
double percentForY = 0.03;// отчисления в % на копилку
        x = x + p;  // Считает нашу зарплату + премия
        System.out.println(x);
        y = y + x * percentForY; // Считает отчисления на копилку
        System.out.println(y);
x = x-percentForY-r; // Показуем остаток на карте
System.out.println(x);

    }
}
