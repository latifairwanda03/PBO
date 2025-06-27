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
public class nasabah {
    private String namaAwal;
    private String namaAkhir;
    private tabungan tabungan;
    
    public nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
    public void setTabungan(tabungan tabungan){
        this.tabungan = tabungan;
    }
    public tabungan getTabungan(){
        return tabungan;
    }
    @Override
    public String toString(){
        //Return namaAwal + " " + namaAkhir + " - " (Tabungan !=null ? tabungan.to String():"Tidak ada tabungan");
        
        if(tabungan !=null){
            return namaAwal + " " + namaAkhir + " - " + tabungan.toString();
        }else{
            return namaAwal+ " " + namaAkhir + " - Tidak ada tabungan";
        }
    }
}


