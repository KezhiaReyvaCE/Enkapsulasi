/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;

/**
 *
 * @author MOKLET-2
 */
public class UjiBus4 {
         public static void main(String[] args) {
        Bus4 Bus = new Bus4(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.addpenumpang(1);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        System.out.println();
        //penambahan penumpang
        Bus.addpenumpang(2);
        Bus.cetakpenumpang();
        
        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+Bus.getAverage());
    }
}
