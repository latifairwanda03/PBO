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
//Nama : Latifa Irwanda
//Kelas : TK1B
//NIM : 2401082006
public class PersegiPanjangTest {
    public static void main(String[]args){
        System.out.println("Jumlah objek saat ini: "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        //Membuat objek pertama dengan konstruktor default
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        //Menetapkan nilai panjang dan Lebar
        pp1.setPanjang(19);
        pp1.setLebar(8);
        
        //Menampilkan informasi objek pertama
        System.out.println("Objek: "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Panjang: "+pp1.getPanjang());
        System.out.println("lebar: "+pp1.getLebar());
        System.out.println("Luas: "+pp1.getLuas());
        System.out.println("Keliling: "+pp1.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println();
        
        //Membuat objek kedua dengan konstruktor berparameter
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(8, 5);
        
        //Menampilkan informasi objek kedua
        System.out.println("Objek: "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println("Panjang: "+pp1.getPanjang());
        System.out.println("lebar: "+pp1.getLebar());
        System.out.println("Luas: "+pp1.getLuas());
        System.out.println("Keliling: "+pp1.getKeliling());
        System.out.println("Jumlah objek yang telah dibuat: "+PersegiPanjangEnkapsulasi.getJumlahObjek());
        System.out.println();
           
        
    }
}
