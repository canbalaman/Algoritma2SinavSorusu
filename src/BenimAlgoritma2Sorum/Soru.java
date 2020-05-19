/*# Algoritma2SinavSorusu
Algoritma2SinavSorusu
Dışarıdan girilen Dünya ve Ülkenin Corono Riskini Hesaplayan Program*/

package BenimAlgoritma2Sorum;

import java.util.Scanner;

class Corona {

     private  String durum;

    private int oran;
    private int dünyaoran;

    public int oran(int vaka, int ölüm) {

        this.oran = (100 * ölüm) / vaka;
        
        return oran;

    }

    public int dünyaoran(int dünvaka, int dünölüm) {

        this.dünyaoran = (100 * dünölüm) / dünvaka;
       
        return dünyaoran;

    }

    public String durum(int oran, int dünyaoran) {

        if (dünyaoran >= oran) {
          this.  durum=" Normal ";
        } else if (oran > dünyaoran) {
          this.  durum = " Çok Tehlikeli Derece ";
        } else if (oran == 0) {
          this.  durum = "0 Risk";

        }
        return durum;
    }

   

    

    public void GirilenÜlke() {
       
        System.out.println("Dünyanı Ölüm oranı = %" +dünyaoran);
        System.out.println("Girdiğin Ülkenin Ölüm Oranı = %" + oran);
    }

    

}
public class Soru extends Corona {
 public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dünya Vaka Sayısı Giriniz : ");
        int dünx = input.nextInt();
        System.out.print("Dünya Ölüm Sayısı Giriniz : ");
        int düny = input.nextInt();
        System.out.print("Vaka Sayısı Giriniz : ");
        int x = input.nextInt();
        System.out.print("Ölüm Sayısı Giriniz : ");
        int y = input.nextInt();
        Corona classCorona = new Corona();
        classCorona.oran(x, y);
        classCorona.dünyaoran(dünx, düny);
       
        
        classCorona.GirilenÜlke();
       
        System.out.println("Dünya Ve Girilen Ülkenin Verilerini Karşılaştırdık Sonuç ==>"+classCorona.durum(classCorona.oran(x, y), classCorona.dünyaoran(dünx, düny)));
        //System.err.println("Can Balaman");
      
       
       
        
    }



}
