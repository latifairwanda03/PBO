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

public abstract class AlatMusik {
       protected String nama;
       protected String jenis;
    
    public AlatMusik (String nama, String jenis){
        this.nama  = nama;
        this.jenis = jenis;
    }
    
    public void info (){
        System.out.println("Nama : "+ nama + ", Jenis : " + jenis );
    }
    
    public abstract void mainkan ();
    public abstract void stem ();
}



