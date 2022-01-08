
package ehliyetyassorgulama;

import java.util.Scanner;
public class EhliyetYasSorgulama {

   
    public static void main(String[] args) {
    Scanner giris=new Scanner(System.in);
    System.out.println("Yaşınızı griniz:");
    int yas=giris.nextInt();
    if(yas<16){
    System.out.println("Ehliyet alamaz:");
        
    }
    else {
    System.out.println("Ehliyet alabilir");
    }
    
    
        
    }
    
}
