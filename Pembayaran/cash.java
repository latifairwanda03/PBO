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
    public class cash extends metodepembayaran{
    public cash(String namaPemilik){
        super(namaPemilik);
    }
    
    @Override
    public void prosesPembayaran(double jumlah){
        System.out.println("Pembayaran tunai oleh "+namaPemilik+ " sebesar Rp. "+jumlah);
    }
}

