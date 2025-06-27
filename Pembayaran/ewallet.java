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
    public class ewallet extends metodepembayaran{
    
    private String provider;

    public ewallet(String namaPemilik, String provider) {
        super(namaPemilik);
        this.provider = provider;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran E-Wallet (" + provider + ") oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }
    
}
    

