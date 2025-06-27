/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas07032025;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class Swalayan {
    public static void main(String[]args){
        int menu, x, y, z;
        long totalHarga, totalHargaX=0, totalHargaY=0, totalHargaZ=0;
        int ulangMenu;
        
        Scanner in=new Scanner(System.in);
        System.out.println("=====Program Swalayan=====");
        System.out.println("|   MEREK   |    HARGA   |");   
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("|   1.X     | RP. 40.000 |");  
        System.out.println("|   2.Y     | RP. 50.000 |");  
        System.out.println("|   3.Z     | RP. 60.000 |");  
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxx");
        
        do{
            System.out.println("Pilih yang ingin dibeli: ");
            menu=in.nextInt();
            
            switch(menu){
                case 1:{
                    System.out.print("Berapa?");
                    x=in.nextInt();
                    totalHargaX +=x*40000;
                }break;
                
                case 2:{
                    System.out.print("Berapa?");
                    y=in.nextInt();
                    totalHargaX +=y*50000;
                }break;
                case 3:{
                    System.out.print("Berapa?");
                    z=in.nextInt();
                    totalHargaX +=z*60000;
                }break;
                default:{
                    System.out.print("Tidak ada merek di menu.");
                
                } 
            }  
        
            System.out.print("\nApakah ada tambahan?");
            ulangMenu=in.nextInt();
        }while(ulangMenu == 1);
        
        totalHarga=totalHargaX + totalHargaY + totalHargaZ;
        System.out.println("Total Harga: Rp."+totalHarga+",-");
        
        in.close();
        
    }
    
}
