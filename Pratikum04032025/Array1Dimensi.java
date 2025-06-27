/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum04032025;

/**
 *
 * @author Lenovo
 */
    import java.util.Random;
    import java.util.Scanner;
    public class Array1Dimensi {
    public static void main(String[] args){
       
    int A[],n,i,banyak = 0, jumlah = 0;
    Scanner in = new Scanner (System. in);
    Random rand = new Random ();
    System.out.print("Masukkan Banyak Data : ");
    n = in.nextInt();
    A = new int[n];
    System.out.println("===DATA ANDA===");
    for(i = 0; i < n ;i++)
    {
        A[i] = rand.nextInt(100)+1;
        System.out.print(A[i]+"\t");
    }
    System.out.println();
    System.out.println("Data Array yang bernilai genap");
    for(i = 0; i < n; i++)
        {
        if(A[i]%2==0) { 
        System.out.print("|"+A[i]+"|"+"\t");
        banyak = banyak + 1;
        jumlah = jumlah + A[i];
          }
        }
    System.out.println();
    System.out.println("Jumlah Genap : "+jumlah);
    System.out.println("BAnyak Genap : "+banyak);
    } 
}

