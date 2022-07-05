import java.util.*;


public class PlanePrice {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        double per_price = 0.10;

        System.out.println("Yaşınızı giriniz :");

        int age = input.nextInt();

        System.out.println("Yolculuk tipini giriniz");

        int yolculuk = input.nextInt();

        System.out.println("Mesafeyi km türünden giriniz :");

        int km = input.nextInt();

        double toplam_fiyat = km * per_price;


            if ((age > 0 && km > 0) && (yolculuk == 1 || yolculuk == 2)) {
            } else {
                System.out.println("Hatalı Veri Girdiniz !");

            }

        if (toplam_fiyat > 0) {

            if (age < 12 && age > 0) {

                toplam_fiyat -= toplam_fiyat / 2;

                if (yolculuk == 2) {
                    toplam_fiyat -= (toplam_fiyat) / 5;
                    toplam_fiyat *= 2;

                    System.out.println(toplam_fiyat);
                } else {
                    System.out.println(toplam_fiyat);
                }


            } else if (age > 12 && age < 24) {

                toplam_fiyat -= toplam_fiyat / 10;

                if (yolculuk == 2) {
                    toplam_fiyat -= (toplam_fiyat) / 5;
                    toplam_fiyat *= 2;
                    System.out.println(toplam_fiyat);
                } else {
                    System.out.println(toplam_fiyat);
                }


            } else if (age > 65 && age > 0) {
                toplam_fiyat -= 3 * (toplam_fiyat) / 10;

                if (yolculuk == 2) {
                    toplam_fiyat -= (toplam_fiyat) / 5;
                    toplam_fiyat *= 2;
                    System.out.println(toplam_fiyat);
                } else {
                    System.out.println(toplam_fiyat);
                }

            } else {
                System.out.println(toplam_fiyat);
            }


        } else {
        }
    }

}