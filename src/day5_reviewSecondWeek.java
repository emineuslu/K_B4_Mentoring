import java.util.Scanner;

public class day5_reviewSecondWeek {
    public static void main(String[] args) {

        //435-->  534 sayı olarak bulunuz

     /*   Scanner sc=new Scanner(System.in);

        System.out.println("3 basamaklı bır sayı gırınız :");
        int sayi =sc.nextInt();


        int birler=sayi%10;      //5
        System.out.println("birler =" +birler);

        int onlar =(sayi/10)%10;     // 3

        System.out.println("onlar = " + onlar);


        int yuzler=sayi/100;    //4
        System.out.println("yuzler = " + yuzler);


        //534  oluatururacagız



        int yenisayi=birler*100+onlar*10+yuzler;

        System.out.println("yenisayi = " + yenisayi);


        String birlerStr =Integer.toString(birler);  // degıskenın tıpıne uygun degısım
        String onlarStr =Integer.toString(birler);
        String yuzlerStr =Integer.toString(birler);

       String result=birlerStr+onlarStr+birlerStr;
        System.out.println("result = " + result);    */




        //        Task 2
//        Kullanıcıdan bir sayı alın
//        sayı cift sayı mı olduğunu bir boolean değişkeni ile kontrol edin


        Scanner sc=new Scanner(System.in);

      //  System.out.println("Lütfen bir sayi giriniz");
        //int sayi=sc.nextInt();

      /*  boolean cifsayidir=   sayi%2==0;
        System.out.println("ciftsayidir "+cifsayidir);?*/


      /*  boolean tekmi=(sayi%2==1);

        System.out.println("tekmi = " + tekmi); */

      //    boolean tekmi1=(sayi%2==1);
      //  boolean tekmi2=!(sayi%==0);

       // booleansayıTek=!(number%2==0);




        //task 4
        //Kullanıcıdan 2 int değeişken  alınız ve
        //sayıların farklarının tek olduğunu
        //kontrol eden bir boolean değiken tanımlayınız.

        Scanner scanner=new Scanner(System.in);

        System.out.println("lutfen iki sayi giriniz");

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int c=a-b;
        boolean tekmi=c%2==1;
        System.out.println("tekmi = " + tekmi);





    }
}
