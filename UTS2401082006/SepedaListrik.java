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
public class SepedaListrik extends Sepeda{
    protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public SepedaListrik(){
        super();
    }
    
    public SepedaListrik(int kecepatanMaks, int jarakTempuh){
        this.kecepatanMaks=kecepatanMaks;
        this.jarakTempuh=jarakTempuh;
    }
    
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks=kecepatanMaks;
    }
    
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setJarakTempuh(int jarakTempuh){
        this.jarakTempuh=jarakTempuh;
    }
    
    public int getJarakTempuh(){
        return jarakTempuh;
    }
}


