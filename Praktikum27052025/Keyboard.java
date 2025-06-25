/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum27052025;

/**
 *
 * @author Lenovo
 */
  public class Keyboard extends AlatMusik implements BisaDinyalakan{
        private final boolean dayaTersambung;
    
    public Keyboard (String nama,String jenis, boolean dayaTersambung) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println("Keyboard"+ nama+ "dimainkan dengan menekan tuts,");
    }
    @Override
    public void stem() {
        System.out.println("Mengecek dan menyesuaikan suara keyboard " + nama + ".");
    }

    public void nyalakan() {
         if (dayaTersambung) {
            System.out.println(nama + " dinyalakan.");
        }else {
            System.out.println("Tidak bisa menyalakan Keyboard. Daya belum tersambung.");
        }
    }

    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    public boolean cekListrik() {
        return dayaTersambung;
    }
}


