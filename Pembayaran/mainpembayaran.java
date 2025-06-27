/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pembayaran;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

    public class mainpembayaran {
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        int menu, tagihan, tagihan1, tagihan2;
        int total = 0;
        System.out.println("Tagihan biaya rumah sakit");
        System.out.println("1. Kontrol");
        System.out.println("2. Berobat");
        System.out.println("3. Rawat Inap");
        boolean[] sudahDipilih = new boolean[4];
        do {
            System.out.print("Pilih pelayanan anda (0 untuk selesai): ");
            tagihan = input.nextInt();

            if (tagihan == 0) {
                break;
            }

            if (tagihan < 1 || tagihan > 3) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            if (sudahDipilih[tagihan]) {
                System.out.println("Tagihan ini sudah dipilih sebelumnya.");
            } else {
                switch (tagihan) {
                    case 1:
                        System.out.println("Kontrol : Rp. 150000 ditambahkan.");
                        total += 150000;
                        break;
                    case 2:
                        System.out.println("Berobat : Rp. 50000ditambahkan.");
                        total += 50000;
                        break;
                    case 3:
                        System.out.println("Rawat Inap : Rp. 200000 ditambahkan.");
                        total += 200000;
                        break;
                }
                sudahDipilih[tagihan] = true;
            }
        } while (true);

        System.out.println("Total Tagihan Anda: Rp." + total);
        input.nextLine(); // bersihkan newline dari input sebelumnya
        System.out.println();
        System.out.print("Masukkan nama pelanggan: ");
        String nama = input.nextLine();

        System.out.println("Menu Pembayaran");
        System.out.println("1. Transfer");
        System.out.println("2. E-Wallet");
        System.out.println("3. Kartu Kredit");
        System.out.println("4. Cash");
        System.out.print("Pilih metode pembayaran: ");
        menu = input.nextInt();
        System.out.println();
        input.nextLine();
        switch (menu) {
            case 1: {
                System.out.println("Transfer");
                System.out.print("Masukkan nama bank: ");
                String bank = input.nextLine();
                transfer t1 = new transfer(nama, bank);
                t1.prosesPembayaran(total);
                break;
            }
            case 2: {
                System.out.println("E-Wallet");
                System.out.print("Masukkan nama E-Wallet: ");
                String provider = input.nextLine();
                ewallet e1 = new ewallet(nama, provider);
                e1.prosesPembayaran(total);
            }
            case 3: {
                System.out.println("Kartu Kredit");
                System.out.print("Masukkan nomor kartu: ");
                String nomorKartu = input.nextLine();
                kartukredit k1 = new kartukredit(nama, nomorKartu);
                k1.prosesPembayaran(total);
                break;
            }
            case 4: {
                System.out.println("Cash");
                cash c1 = new cash(nama);
                c1.prosesPembayaran(total);
                break;
            }
            default: {
                System.out.println("Pilihan tidak valid!");
                break;
            }
        }

    }

}
