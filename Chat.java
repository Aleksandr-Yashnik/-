public class Chat {
    public static void main(String[] args) {
        // Пример использования метода length()
        String str = "Hello";
        int length = str.length();
        System.out.println("Длина строки: " + length);

        // Пример использования метода charAt()
        char ch = str.charAt(1); // 'e'
        System.out.println("Символ на позиции 1: " + ch);

        // Пример использования метода substring()
        String substr = str.substring(1, 3); // "el"
        System.out.println("Подстрока от 1 до 3: " + substr);

        // Пример использования метода indexOf()
        int index = str.indexOf("l"); // 2
        System.out.println("Индекс первого вхождения 'l': " + index);

        // Пример использования метода toLowerCase()
        String lowerStr = str.toLowerCase(); // "hello"
        System.out.println("Строка в нижнем регистре: " + lowerStr);

        // Пример использования метода toUpperCase()
        String upperStr = str.toUpperCase(); // "HELLO"
        System.out.println("Строка в верхнем регистре: " + upperStr);

        // Пример использования метода trim()
        String trimmedStr = "  Hello World  ".trim(); // "Hello World"
        System.out.println("Строка после удаления пробелов: " + trimmedStr);

        // Примеры объединения строк
        String s1 = "Hello";
        String s2 = "World";

        // Использование оператора +
        String s3 = s1 + " " + s2; // "Hello World"
        System.out.println("Объединение строк с помощью +: " + s3);

        // Использование метода concat()
        String s4 = s1.concat(" ").concat(s2); // "Hello World"
        System.out.println("Объединение строк с помощью concat(): " + s4);
    }
}


