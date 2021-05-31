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
public class Bus4 {
    public double penumpang;
    public double maxpenumpang; 
    public double counter;
    public double penumpangbaru;

    public Bus4(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator 
    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            counter++;
        }
    }
    public void getpenumpang(int password) {
        if (password == 24) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }
    public double getAverage() {
        double average;
        return penumpang / counter; 
    }
    public void cetakpenumpang() {
        System.out.println("Penumpang Bus Sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxpenumpang);
    }
}
