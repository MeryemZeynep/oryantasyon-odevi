
package taskagıtmakas2;

import java.util.Scanner;
public class TasKagıtMakas2 {

    
    public static void main(String[] args) {
         int bilgisayar =(int)Math.floor(Math.random()*3+1);
        System.out.println("Taş seçmek için 1");
        System.out.println("Kağıt seçmek için 2");
        System.out.println("Makas seçmek için 3");
        Scanner giris=new Scanner (System.in);
        int deger=giris.nextInt();
        while(bilgisayar==1){
            if(deger==1){
            System.out.println("Bilgisayar:"+"Taş");
            System.out.println("Oyuncu:"+"Taş");
            System.out.println("Berabere");
            break;
        }
        
            if(deger==2){
            System.out.println("Bilgisayar:"+"Taş");
            System.out.println("Oyuncu:"+"Kağıt");
            System.out.println("Oyuncu kazandı"); 
            break;
            
            }
            if(deger==3){
                System.out.println("Bilgisayar:"+"Taş");    
                System.out.println("Oyuncu:"+"Makas");
                System.out.println("Bilgisayar kazandı");
                break;
                
            }
    }
        while(bilgisayar==2){
            if(deger==1){
                System.out.println("Bilgisayar:"+"Kağıt");
                System.out.println("Oyuncu:"+"Taş");
                System.out.println("Bilgisayar kazandı");
                break;
                
               
            }
            if(deger==2){
                System.out.println("Bilgisayar:"+"Kağıt");
                System.out.println("Oyuncu:"+"Kağıt");
                System.out.println("Berabere");
                break;
            }
            if(deger==3){
                System.out.println("Bilgisayar:"+"Kağıt");
                System.out.println("Oyuncu:"+"Makas");
                System.out.println("Oyuncu kazandı");
                break;
            }
        }
        while(bilgisayar==3){
            if(deger==1){
                System.out.println("Bilgisayar:"+"Makas");
                System.out.println("Oyuncu:"+"Taş");
                System.out.println("Oyuncu kazandı");
                break;
                       
            }
            if(deger==2){
                System.out.println("Bilgisayar:"+"Makas");
                System.out.println("Oyuncu:"+"Taş");
                System.out.println("Bilgisayar kazandı");
                break;
            }
            if(deger==3){
                System.out.println("Bilgisayar:"+"Makas");
                System.out.println("Oyuncu:"+"Makas");
                System.out.println("Berabere");
                break;
            }
        }
}
}
