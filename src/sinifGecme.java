import java.util.Scanner;

public class sinifGecme {

    public static void main(String[] args) {

        int mat,fizik,turkce,kimya,muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz :");
        mat=input.nextInt();

        System.out.print("Fizik notunuz :");
        fizik=input.nextInt();

        System.out.print("Türkçe notunuz :");
        turkce=input.nextInt();

        System.out.print("Kimya notunuz :");
        kimya=input.nextInt();

        System.out.print("Müzik notunuz :");
        muzik=input.nextInt();

       if(
                  ((mat<=0) || (mat>=100))
               || ((fizik<=0) || (fizik>=100))
               || ((turkce<=0) || (turkce>=100))
               || ((kimya<=0) || (kimya>=100))
               || ((muzik<=0) || (muzik>=100)
       )){
           System.out.println("Girilen değer 0-100 arasında olmalıdır lütfen tekrar giriniz");
       }else {
           double average = ((mat+fizik+kimya+turkce+muzik)/5) ;
           System.out.println("Ortalamanız ="+average);

           if (average>55){
               System.out.println("Tebrikler Sınıfı Geçtiniz!");
           }else {
               System.out.println("Sınıfta Kaldınız seneye tekrar görüşmek üzere!");
           }
       }
    }
}
