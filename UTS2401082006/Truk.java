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
public class Truk extends Mobil{
    protected int muatanMaks;
    
    public Truk(){
        super();
    }
    
    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks=muatanMaks;
    }
    
    public int getMuatanMaks(){
        return muatanMaks;
    }
}
