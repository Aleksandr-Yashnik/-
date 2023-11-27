public class Classwork10 {
    public static void main(String[] args) {
        //пример с книгой
       // System.out.println("Я прочел страницу 0");
       // System.out.println("Я прочел страницу 1");
      //  System.out.println("Я прочел страницу 2");
        //...
       // System.out.println("Я прочел страницу 100");
       // System.out.println("Я закончил читать книгу");

      //  int totalPages = 100;
      //  int currentPage = 0;
     //   while (currentPage <= totalPages) {
       //     System.out.printf("Я прочел страницу %d\n", currentPage);
       //     if (currentPage == totalPages) {
       //         System.out.println("Я закончил читать книгу");
      //      }
      //      currentPage++;
       // }
       // for (int i = 0; i <= totalPages; i++) {
            //  System.out.printf("Я прочел страницу %d\n", i );
            //  if (i == totalPages){
            //     System.out.println("Я закончил читать книгу");
            // }
      //  }
        //  for (int i = 100; i >  0 ; i--) {
        //  System.out.println(i + " ");

        // }

        // for (int i = 0; i < 100; i+=3) {
        //   if(i==72){
        //      break;
        //   }
        //   if(i%2 ==0){
        //        continue;
        //    }
        //   System.out.println(i);
        //  }
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.printf("%d x %d   ", i, j);
                for (int k = 0; k < 10; k++){
                    System.out.printf("%d x %d x%d   ", i, j,k);
                    if (j==1){
                        break;
                    }

                }
            }
            System.out.println();
        }
    }
}
