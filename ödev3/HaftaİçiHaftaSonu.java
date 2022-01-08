
package haftaiçihaftasonu;

import java.util.Scanner;
public class HaftaİçiHaftaSonu {

   
public static void main(String[] args) {
Scanner giris=new Scanner (System.in);
System.out.println("Gün için sayı giriniz(1-7):");
int gun=giris.nextInt();
switch (gun){
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:System.out.println("Hafta içi:"); break;
    case 6:
    case 7:System.out.println("Hafta sonu:"); break;  
        
}
        
        
    }
    
}
