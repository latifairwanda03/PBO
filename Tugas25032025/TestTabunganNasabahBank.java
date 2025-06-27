/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas25032025;

/**
 *
 * @author Lenovo
 */
//Nama: Latifa Irwanda
//Kelas : TK1B
//NIM : 2401082006
public class TestTabunganNasabahBank {
    
   
            
     public static void main(String[]args){
         //Objek Nasabah 1
         nasabah nasabah1 = new nasabah("Latifa", "Cella");
         tabungan tabungan1 = new tabungan(10000);
         nasabah1.setTabungan(tabungan1);
         
         //Objek Nasabah 2
         nasabah nasabah2 = new nasabah("Latifa", "Cella");
         tabungan tabungan2 = new tabungan(8000);
         nasabah2.setTabungan(tabungan2);
         
         //Menampilkan informasi awal
         System.out.println("Informasi nasabah dan saldo");
         System.out.println("============================");
         System.out.println("Nasabah1");
         System.out.println("Nasabah2");
         System.out.println();
         
         System.out.println("Riwayat menabung nasabah");
         //Objek 1 menabung 4000
         tabungan1.simpanUang(4000);
         System.out.println("Setelah Latifa menabung 4000: " + tabungan1.getSaldo());
         
         //Objek 2 menabung 7000
         tabungan2.simpanUang(7000);
         System.out.println("Setelah Cella menabung 7000: " + tabungan2.getSaldo());
         
         System.out.println("\nRiwayat penarikan nasabah");
         //Objek 1 mengambil uang 5000
         tabungan1.ambilUang(5000);
         System.out.println("Setelah Latifa mengambil 5000: " + tabungan1.getSaldo());
         
         //Objek 2 mengambil uang 6000
         tabungan2.ambilUang(6000);
         System.out.println("Setelah cella mengambil 6000: " + tabungan2.getSaldo());
         
        //objek 2 transfer ke objek 1 sebesar 1000
        tabungan2.transfer(tabungan1, 1000);
        System.out.println("/nSetelah Latifa transfer 1000 ke Cella:");
        System.out.println("Saldo Cella: "+tabungan1.getSaldo());
        
     }
}
