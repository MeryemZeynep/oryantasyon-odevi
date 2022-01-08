
package kardesyası;

import java.util.Scanner;
public class KardesYası {

   
    public static void main(String[] args) {
        Scanner giris=new Scanner (System.in);
        System.out.println("İki kardeşin yaşlarını giriniz:");
        int kardesyasi1=giris.nextInt();
        int kardesyasi2=giris.nextInt();
        int toplam =(kardesyasi1+kardesyasi2);
        int ortalama=(toplam/2);
        System.out.println("Yaşları toplamı:"+toplam+"Yaşları ortalaması"+ortalama);
        
    }
    
}
