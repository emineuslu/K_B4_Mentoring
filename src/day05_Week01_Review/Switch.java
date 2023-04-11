package day05_Week01_Review;



import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        // Girilen 1vize(%20), 2vize(%20)ve final(%60) notunu okuyarak ortalamayı bulunuz
        // Soru : Kullanıcıdan  Fizik: 90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
      /*  Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = oku.nextInt();

        int onlar=(sayı/10)%10;   //127      12      2
                                  //355      35      5

        switch (onlar){
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            default:
                System.out.println("hatalı bır sayı gırdınız");  */



    // Girilen 1vize(%20), 2vize(%20)ve final(%60) notunu okuyarak ortalamayı bulunuz
    // ort;
    // >= 90 için A
    // >= 80 için B
    // >= 70 için C
    // >= 60 için D
    // >= 40 için E
    // < 40 için F yazdırınız.

    Scanner scan = new Scanner(System.in);
    System.out.println("Lütfen sınav sonuclarınızı giriniz");
    double vize1 = scan.nextDouble();
        System.out.println("vize1 = " + vize1);
        double vize2 = scan.nextDouble();
        System.out.println("vize2 = " + vize2);
        double _final = scan.nextDouble();
        System.out.println("_final = " + _final);
        double ort = (vize1 * 0.20 + vize2 * 0.20 + _final * 0.60);
        System.out.println("ort = " + ort);
        if(ort>=90) {
        System.out.println("A");
        }else if(ort>=80) {
        System.out.println("B");
        }else if(ort>=70) {
        System.out.println("C");
        }else if(ort>=60) {
        System.out.println("D");
        }else if(ort>=40) {
        System.out.println("E");
        }else if(ort>40) {
        System.out.println("F");
    }



    }
}
