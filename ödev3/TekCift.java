
package tekcift;

import java.util.Scanner;
public class TekCift {

   
    public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    System.out.println("Sayıyı giriniz:");
    int sayi=giris.nextInt();
    if(sayi%2==0){
        System.out.println(sayi + "Çifttir");
    }
    else{
        System.out.println(sayi + "Tektir");
    }
    }
    
}
