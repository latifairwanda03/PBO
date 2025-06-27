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
    public class kartukredit extends metodepembayaran {

    private String nomorKartu;

    public kartukredit(String namaPemilik, String nomorKartu) {
        super(namaPemilik);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran dengan kartu kredit (" + nomorKartu + ") oleh " + namaPemilik + " sebesar Rp. " + jumlah);
    }

}

