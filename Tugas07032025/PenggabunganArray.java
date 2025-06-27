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
import java.util.Random;

public class PenggabunganArray {
    public static void main(String[]args){
       int A[], B[], C[];
       int n,m;
       
       Scanner in = new Scanner(System.in);
       Random rand = new Random();
       
       System.out.println("===Program Array 1 Dimensi===");
       
       System.out.print("Masukkan Array A: ");
       n = in.nextInt();
       A = new int[n];
       
       System.out.print("Masukkan Array B: ");
       m = in.nextInt();
       B = new int[m];
       
       int i;
       
       for(i=0;i<n;i++){
           A[i]=rand.nextInt(100);
       }
       
        for(i=0;i<m;i++){
           B[i]=rand.nextInt(100);
       }
       
       System.out.print("\nUkuran array A: "+n);
        for(i=0;i<n;i++){
            System.out.print(" "+A[i]+" ");
        }
        
        System.out.print("\nUkuran array B: "+m);
        for(i=0;i<m;i++){
            System.out.print(" "+B[i]+" ");
        }
        C = new int[n+m];
        
        System.out.println("/nUkuran array C dan anggotanya: "+(n+m));
            if(n>m){
                for(i=0;i<n;i++)
                    System.out.print(" "+A[i]+" ");
                for(i=0;i<m;i++)
                    System.out.print(" "+B[i]+" ");
            }
            else if(m>n){
                for(i=0;i<m;i++)
                    System.out.print(" "+B[i]+" ");
                for(i=0;i<n;i++)
                    System.out.print(" "+B[i]+" ");
            }
            else {
                for(i=0;i<n;i++)
                    System.out.print(" "+A[i]+" ");
                for(i=0;i<m;i++)
                    System.out.print(" "+A[i]+" ");
                
               System.out.println("\nArray yang pertama kali akan berada lebih awal"
                   +"jika ukuran kedua array sama");
            }
    }
    
    
}
