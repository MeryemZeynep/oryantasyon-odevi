
package alanhesaplama;
import java.util.Scanner;
public class AlanHesaplama {

public static void main(String[] args) {
Scanner giris=new Scanner (System.in);
System.out.println("Çap değerini giriniz:");
int cap=giris.nextInt();
if (cap<0){
    System.out.println("Yanlış değer girdiniz:");
   
}
else{
double alan=cap*cap*3.14159;
System.out.println("Alan"+alan);
}
    
    }
    
}
