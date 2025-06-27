/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2401082006;

/**
 *
 * @author Lenovo
 */
public class Taksi {
    
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public Taksi(){
        super();
    }
    
    public void setTarifAwal(int tarifAwal){
        this.tarifAwal=tarifAwal;
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKm(int tarifPerKm){
        this.tarifPerKm=tarifPerKm;
    }
    
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    
}

