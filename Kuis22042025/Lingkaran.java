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
public class Lingkaran {
    private double r;
    
    public Lingkaran(double r){
        this.r = r;
    }
    public Lingkaran(){
        
    }
    public double getR(){
        return this.r;
    }
    public double getDiameter(){
        return 2;
    }
    public double getKeliling(){
        return 2 * Math.PI * r;
    }
    public void setR(double r){
        this.r = r;
    }
    public double getLuas(){
        return Math.PI *r *r;
    }
    @Override
    public String toString(){
        return "Lingkaran memiliki jari-jari : "+r;
    }
}
