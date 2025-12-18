
package javaprojem;

import java.util.Scanner;

public class JavaProjem {
    
    static double indirimler (double fiyat, int urunAdet){
        
        if (fiyat > 20000 && fiyat >= 25000 && urunAdet >= 2){
            fiyat -= fiyat * 0.2;
        }
        else if (fiyat > 25000 && fiyat <= 30000 && urunAdet >= 2){
            fiyat -= fiyat * 0.3;
        }
        else if(fiyat > 30000 && urunAdet >= 2){
            fiyat -= fiyat * 0.4;
        }
        return fiyat;
    }
    
    public static void main(String[] args) {
        
        int miraKoltukTakim = 30000;
        int heroKoseKoltuk = 25000;
        int elipsYuvarlakAcilirMasaTakim = 10000;
        int elenYemekMasasi = 6000;
        int divaGardrop = 15000;
        int revaMetalKitaplik = 2000;
        int bohemKoseKoltuk = 24000;
        int lenaOrtaSehpa = 1500;
        
        System.out.println("....Hoþgeldiniz.... \nÜrünlerimiz aþaðýdadýr ");
        System.out.println("Ýndirimlerden faydalanabilmeniz için en az 2 adet ürün almýþ olmanýz gerek.");
        System.out.println(" ");
        
        System.out.println("% 20 indirimden faydalanabilmek için sipariþ tutarýnýz 20.000 TL ile"
                + "25.000 TL arasýnda olmalýdýr.");
       System.out.println("% 30 indirimden faydalanabilmek için sipariþ tutarýnýz 25.000 TL ile"
                + "30.000 TL arasýnda olmalýdýr.");
       System.out.println("% 40 indirimden faydalanabilmek için sipariþ tutarýnýz 30.000 TL üzerinde"
               + " olmalýdýr.");
        System.out.println(" ");
       
        System.out.println("1- Mira Koltuk Takýmý");
        System.out.println("2- Hero Köþe Koltuk");
        System.out.println("3- Elips Yuvarlak Açýlýr Masa Takým");
        System.out.println("4- Elen Yemek Masasý");
        System.out.println("5- Diva Gardrop");
        System.out.println("6- Reva Metal Kitaplýk");
        System.out.println("7- Bohem Köþe Koltuk");
        System.out.println("8- Lena Orta Sehpa");
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ýstediðiniz ürünün numarasýný giriniz: ");
        int secim = input.nextInt();
        
        System.out.print("Kaç adet alacaksýnýz: ");
        int urunAdet = input.nextInt();
        
        double urunFiyati = 0;
        double toplamFiyat;
        double indirimliToplam;
        
        switch(secim){
            case 1:
                urunFiyati = miraKoltukTakim; break;
            case 2:
                urunFiyati = heroKoseKoltuk; break;
            case 3:
                urunFiyati = elipsYuvarlakAcilirMasaTakim; break;
            case 4:
                urunFiyati = elenYemekMasasi; break;
            case 5:
                urunFiyati = divaGardrop; break;
            case 6:
                urunFiyati = revaMetalKitaplik; break;
            case 7:
                urunFiyati = bohemKoseKoltuk; break;
            case 8:
                urunFiyati = lenaOrtaSehpa; break;
            default:
                System.out.println("Lütfen geçerli bir sayý giriniz.");
        }
        
         toplamFiyat = urunFiyati * urunAdet;
         indirimliToplam = indirimler(toplamFiyat, urunAdet);
         
         System.out.println("Ýndirimler sonrasý ödenecek fiyat: " + indirimliToplam + " TL");
        
        
        


    }
    
}
