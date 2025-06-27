/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis22042025;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class LingkaranDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input lingkaran
        System.out.print("Masukkan jari - jari : ");
        double r = input.nextDouble();
        Lingkaran lingkaran = new Lingkaran(r);
        System.out.print("==Lingkaran==\n");
        System.out.println(lingkaran);
        System.out.println("Luas: " + lingkaran.getLuas());
        System.out.println("Keliling: " + lingkaran.getKeliling());
     
        //input kerucut
        System.out.print("\nMasukkan tinggi kerucut : ");
        double t1 = input.nextDouble();
        Kerucut kerucut = new Kerucut(r, t1);
        System.out.print("==Kerucut==\n");
        System.out.println(kerucut);
        System.out.println("Volume Kerucut: " + kerucut.getVolume());
        System.out.println("Luas Permukaan Kerucut: " + kerucut.getLuas());
        
        System.out.print("\nMasukkan tinggi silinder : ");
        double t2 = input.nextDouble();
        Silinder silinder = new Silinder(r, t2);
        System.out.println("\nSilinder==");
        System.out.println(silinder);
        System.out.printf("Volume    : "+silinder.getVolume());
        System.out.printf("Luas Permukaan : "+ silinder.getLuas());

        input.close();
    }
}
