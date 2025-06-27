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
    public class Array2Dimensi {
    public static void main(String[] args){
    int M[][], MM[][], H[][];
    int i, j, b, k, bb, kk;
    
    Scanner in = new Scanner(System.in);
    Random random = new Random ();
    
    System.out.println("===MENU PERHITUNGAN MATRIX===");
    System.out.println("1.PENJUMLAHAN");
    System.out.println("2.PERKALIAN");
    System.out.println("3.INVERS");
    System.out.println("===============================");
    System.out.print("Pillih Hitungan Yang Anda Inginkan: ");
    
    System.out.print("Masukkan Jumlah Baris : ");
    b=in.nextInt ();
    System.out.print("Masukkan Jumlah Kolom : ");
    k=in.nextInt ();
    
    System.out.print("Masukkan Jumlah Baris Matrix 2 : ");
    bb=in.nextInt ();
    System.out.print("Masukkan Jumlah Kolom Matrix 2 : ");
    kk=in.nextInt ();
    System.out.println("=======================================");
    
    if(b == bb & k == kk){
    M = new int[b][k];
    for(i = 0; i < b; i++){
        for(j = 0; j < k; j++){
            M[i][j] = random.nextInt(100) + 1;
            System.out.print(M[i][j] + "\t");
             }
        System.out.println();
        }
    System.out.println();
    
    MM = new int[bb][kk];
    for(i = 0; i < bb; i++){
        for(j = 0; j < kk; j++){
            MM[i][j] = random.nextInt(100) + 1;
            System.out.print(MM[i][j] + "\t");
             }
        System.out.println();
        }
    
    System.out.println("Hasil : ");
    H = new int[b][k];
    for(i = 0; i < b; i++){
        for(j = 0; j < k; j++){
           H[i][j]= M[i][j] + MM[i][j];
            System.out.print(H[i][j] + "\t");
             }
        System.out.println();
        }
    System.out.println();
    }
    
    else{
        System.out.println("GAGAL BREE");
      }
    }
}

