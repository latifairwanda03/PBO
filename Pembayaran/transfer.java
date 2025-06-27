/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembayaran;

/**
 *
 * @author Lenovo
 */
    public class transfer extends metodepembayaran{
    public String bank;
    
    public transfer(String namaPemilik, String bank) {
        super(namaPemilik);
        this.bank = bank;
    }

    public void prosesPembayaran(double jumlah) {
        System.out.println("Transfer via " + bank + " oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }
    
}

