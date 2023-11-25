public class lesson5 {
    public static void main(String[] args) {
        String s1 = "Java";
        s1.toUpperCase(); // Это не изменит строку s1
        System.out.println(s1); // Выведет "Java"

        s1 = s1.toUpperCase(); // Создает новую строку "JAVA"
        System.out.println(s1); // Выведет "JAVA"
    }
}