public class Lesson02Part3 {
    public static void main(String[] args) {
        double x = 10.0;
        int y = 10;

        x  = x / 3;
        x = y / 3;

        System.out.println(x);
        System.out.println(y);


        //примитивние типи данных
        //целочислинние
        byte myByte = 10; // 8 bit  01010101 2^8 комбинаций 256 различних чисел. -128 до 128
        short myShort = 10; // 16 бит  2^16  комбинаций 65536 различних чисел. -32768 до 32767
        int myInt = 10; // 32 бит 2^32 комбинаций 4,294,967,296 милиарда различних чисел. -2,147,483,648 до  2,147,483,647
        long myLong = 10L; // 64 бит 2^64  комбинаций  -9,223,372,036,854,775,808 до 9,223,372,836,854,775,887

        myLong = 2_147_483_647L + 1;
        //myLong = myLong + 1;
        System.out.println(myLong);
        //с дробной частью
        float myFloat = 1.0F; // 32 bit
        double myDouble = 1.0; // 64 bit

        System.out.println(23.3F);

        System.out.println(myFloat / 3);
        System.out.println(myDouble / 3);



        // логический тип данных
        boolean myBoolean = true; // 1 bit 16 bit
        myBoolean = false;


        // символьний тип данных
        char myChar = 's'; // 


    }
}
