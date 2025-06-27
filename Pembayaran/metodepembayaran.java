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

    public abstract class metodepembayaran {
    protected String namaPemilik;

    public metodepembayaran(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public abstract void prosesPembayaran(double jumlah);
}

