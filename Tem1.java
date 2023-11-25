public class Tem1 {
    public static void main(String[]args){
        byte myByte = 127;
        int myInt = myByte + 2000;
        myByte = (byte) (myByte + 2000);
        System.out.println(myByte);
        System.out.println(myInt);
    }

}
