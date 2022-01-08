
package hesaplama;

 import java.util.Scanner;   

public class Hesaplama {

    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        double mil=100;
        final double KILOMETRE_MIL_SAYISI=1.609;
        double kilometre=(mil*KILOMETRE_MIL_SAYISI);
        System.out.println("Kilometre"+kilometre);
        
        
    }
    
}
