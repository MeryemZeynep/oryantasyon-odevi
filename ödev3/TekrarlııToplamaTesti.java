
package tekrarlııtoplamatesti;

import java.util.Scanner;
public class TekrarlııToplamaTesti {

   
    public static void main(String[] args) {
    int sayi1=(int)(Math.random()*10);
    int sayi2=(int)(Math.random()*10);
    Scanner giris=new Scanner(System.in);
    System.out.println(sayi1+"+"+sayi2+"işleminin sonucu nedir?");
    int cevap=giris.nextInt();
    while(sayi1+sayi2!=cevap){
        System.out.print("Yanlış cevap girdiniz.Tekrar deneyiniz"+ sayi1 + "+"+sayi2+"işleminin sonucu nedir?");
        cevap=giris.nextInt();
        
        
    }
    System.out.print("Doğru cevap girdiniz.Tebrikler!");
   
    }
    
}
