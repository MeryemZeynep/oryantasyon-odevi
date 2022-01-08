
package gozcudeger2;

import java.util.Scanner;
public class GozcuDeger2 {

    public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    System.out.print("Bir tam sayı giriniz:"+"(Sıfır girilirse giriş sonlanır:)");
    int veri=giris.nextInt();
    int toplam=0;
    while(veri!=0){
        toplam+=veri;
        System.out.println("Bir tam sayı giriniz:"+"(Sıfır girilirse giriş sonlanır:)");
        veri=giris.nextInt();
    }
        System.out.println("Toplam"+toplam);
        
        
    }
    
}
