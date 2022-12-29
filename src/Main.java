import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int km;
        double toplam, km_ucreti=2.20, acilis=10.0;

        System.out.print("Lütfen Gidilen Mesafeyi Giriniz: " );
        km= input.nextInt(); //kullanicidan km degerini al.

        toplam= km*km_ucreti; //alinan km degeri ile km_ucretini carp.
        toplam += acilis;      //acilis degeri ile toplam degerini toplayıp toplam degiskenine ata.
        toplam= (toplam < 20) ? 20 : toplam ; //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL al.
        System.out.println("Ücret: " + toplam );
    }
}