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
public class PermutasiKombinasi {
    public static void main(String[]args){
        int n,r;
        
        Scanner in=new Scanner(System.in);
        
        System.out.println("===Program Permutasi dan Kombinasi ");
        System.out.println("n: Banyak unsur");
        System.out.println("Banyak unsur yang di kombinasi dan permutasikan");
        
        System.out.print("Masukkan nilai n: ");
        n=in.nextInt();
        System.out.print("Masukkan nilai r: ");
        r=in.nextInt();
        
        int i;
        
        int n2=n;
        for(i=r-1;i>0;i--){
            n2=n2*i;
        }
        
        int r2=r;
        for(i=r-1;i>0;i--){
            r2=r2*i;
        }
        
        int nr=n-r;
        int nr2=nr;
            for(i=nr-1;i>0;i--){
            nr2=nr2*i;
            }
          
        System.out.println("");
            
        //Permutasi 
        System.out.println("Rumus permutasi: P(n, r) = n!/(n - r)!");
        System.out.print("P(" + n + ", " + r + ") = ");
        System.out.print(n + "!/(" + n + " - " + r + ")! = ");
        System.out.print(n + "!/" + nr + "! = ");
        System.out.println(n2 + "/" + nr2);
        System.out.println("= " + n2/nr2);
        System.out.println("Maka, hasil permutasi adalah " + n2/nr2);
        
        System.out.println("");
        
        //Kombinasi
        System.out.println("Rumus kombinasi: C(n, r) = n!/r!(n - r)!");
        System.out.print("C(" + n + ", " + r + ") = ");
        System.out.print(n + "!/" + r + "!(" + n + " - " + r + ")! = ");
        System.out.print(n + "!/" + r + "!(" + nr + ")! = ");
        System.out.print(n2 + "/(" + r2 + "x" + nr2 + ") = ");
        System.out.println(n2 + "/" + r2*nr2);
        System.out.println("= " + n2/(r2*nr2));
        System.out.println("Maka, hasil kombinasi adalah " + n2/(r2*nr2));
  
    }
}
