/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum08042025;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Nasabah 1
        Scanner input = new Scanner(System.in);
        int jumlah, ambil;
        char tanya;

        System.out.print("Masukkan nama depan nasabah pertama : ");
        String namaAwal = input.nextLine();
        System.out.print("Masukkan nama belakang nasabah pertama : ");
        String namaAkhir = input.nextLine();
        nasabah nasabah1 = new nasabah(namaAwal, namaAkhir);
        tabungan tabungan1 = new tabungan(8000);
        nasabah1.setTabungan(tabungan1);
        System.out.println("Informasi nasabah dan saldo");
        System.out.println("===============================");
        System.out.println(nasabah1);
        System.out.println();

        // Membuat objek Nasabah 2
        System.out.print("Masukkan nama depan nasabah kedua : ");
        namaAwal = input.nextLine();
        System.out.print("Masukkan nama belakang nasabah kedua : ");
        namaAkhir = input.nextLine();
        nasabah nasabah2 = new nasabah(namaAwal, namaAkhir);
        tabungan tabungan2 = new tabungan(3000);
        nasabah2.setTabungan(tabungan2);
        System.out.println("Informasi nasabah dan saldo");
        System.out.println("===============================");
        System.out.println(nasabah2);
        System.out.println();

        System.out.print("Apakah nasabah " + nasabah1.getNamaLengkap() + " ingin menabung? (y/n)");
        tanya = input.nextLine().charAt(0);
        if (tanya == 'y' || tanya == 'Y') {
            System.out.print("Masukkan jumlah uang yang akan disetor : ");
            jumlah = input.nextInt();
            input.nextLine();
            tabungan1.simpanUang(jumlah);
            System.out.println("Setelah " + nasabah1.getNamaLengkap() + " menabung " + jumlah);
            System.out.println("Informasi nasabah dan saldo");
            System.out.println("===============================");
            System.out.println(nasabah1);
            System.out.println();
        }

        System.out.println();
        System.out.print("Apakah nasabah " + nasabah2.getNamaLengkap() + " ingin menabung? (y/n)");
        tanya = input.nextLine().charAt(0);
        if (tanya == 'y' || tanya == 'Y') {
            System.out.print("Masukkan jumlah uang yang akan disetor : ");
            jumlah = input.nextInt();
            input.nextLine();
            tabungan2.simpanUang(jumlah);
            System.out.println("Setelah " + nasabah2.getNamaLengkap() + " menabung " + jumlah);
            System.out.println("Informasi nasabah dan saldo");
            System.out.println("===============================");
            System.out.println(nasabah2);
            System.out.println();
        }

        System.out.println();
        System.out.print("Apakah nasabah " + nasabah1.getNamaLengkap() + " ingin melakukan penarikan? (y/n)");
        tanya = input.nextLine().charAt(0);
        if (tanya == 'y' || tanya == 'Y') {
            System.out.print("Masukkan jumlah uang yang akan ditarik : ");
            ambil = input.nextInt();
            input.nextLine();
            tabungan1.ambilUang(ambil);
            System.out.println("Setelah " + nasabah1.getNamaLengkap() + " mengambil " + ambil);
            System.out.println("Informasi nasabah dan saldo");
            System.out.println("===============================");
            System.out.println(nasabah1);
            System.out.println();
        }

        System.out.println();
        System.out.print("Apakah nasabah " + nasabah2.getNamaLengkap() + " ingin melakukan penarikan? (y/n)");
        tanya = input.nextLine().charAt(0);
        if (tanya == 'y' || tanya == 'Y') {
            System.out.print("Masukkan jumlah uang yang akan ditarik : ");
            ambil = input.nextInt();
            input.nextLine();
            tabungan2.ambilUang(ambil);
            System.out.println("Setelah " + nasabah2.getNamaLengkap() + " mengambil " + ambil);
            System.out.println("Informasi nasabah dan saldo");
            System.out.println("===============================");
            System.out.println(nasabah2);
            System.out.println();
        }

        System.out.println();
        System.out.print("Apakah nasabah " + nasabah1.getNamaLengkap() + " ingin melakukan transfer ke " + nasabah2.getNamaLengkap() + "? (y/n)");
        tanya = input.nextLine().charAt(0);
        if (tanya == 'y' || tanya == 'Y') {
            System.out.print("Masukkan jumlah uang yang akan ditransfer : ");
            jumlah = input.nextInt();
            input.nextLine();
            tabungan1.transfer(tabungan2, jumlah);
            System.out.println("Setelah " + nasabah1.getNamaLengkap() + " melakukan transfer sebesar "
                    + jumlah + " kepada " + nasabah2.getNamaLengkap());
            System.out.println("Informasi nasabah dan saldo");
            System.out.println("===============================");
            System.out.println(nasabah1);
            System.out.println();
        }

        System.out.println();
        System.out.print("Apakah nasabah " + nasabah2.getNamaLengkap()
                + " ingin melakukan transfer ke " + nasabah1.getNamaLengkap() + "? (y/n)");
        tanya = input.nextLine().charAt(0);
        if (tanya == 'y' || tanya == 'Y') {
            System.out.print("Masukkan jumlah uang yang akan ditransfer : ");
            jumlah = input.nextInt();
            input.nextLine();
            tabungan2.transfer(tabungan1, jumlah);
            System.out.println("Setelah " + nasabah2.getNamaLengkap() + " melakukan transfer sebesar "
                    + jumlah + " kepada " + nasabah1.getNamaLengkap());
            System.out.println("Informasi nasabah dan saldo");
            System.out.println("===============================");
            System.out.println(nasabah2);
            System.out.println();
        }
        /* // Objek 2 transfer ke objek 1 sebesar 1000
        tabungan2.transfer(tabungan1, 1000);
        System.out.println("\nSetelah Rachel transfer 1000 ke Setiawan:");
        System.out.println(nasabah1);
        System.out.println(nasabah2);

        tabungan1.transfer(tabungan2, 1000);
        System.out.println("\nSetelah Rachel transfer 1000 ke Setiawan:");
        System.out.println(nasabah1);
        System.out.println(nasabah2);*/
    }

}
}
