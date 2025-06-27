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
public class Silinder extends Lingkaran{
    private double tinggi;
    
    public Silinder(){
        super();
    }
    public Silinder(double r, double t){
        super(r);
        this.tinggi = t;
    } 
    public void setTinggi(double Tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        double r = getR();
        double h = getTinggi();
        return getLuas() *r*r*h;
    }
    @Override
    public double getLuas(){
        return 2 * Math.PI * super.getR() * super.getLuas()*tinggi;
    }
    @Override
    public String toString(){
        return "Silinder memiliki jari-jari : "+super.getR()+ " dan tinggi : "+tinggi;
    }
}
