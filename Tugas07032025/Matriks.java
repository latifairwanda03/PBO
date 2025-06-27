/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas07032025;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Matriks {
    public static void main(String[]args){
        int M[][], N[][];
        int bM, kM, bN, kN;
        int menu;
        
        Scanner in = new Scanner (System.in);
        Random rand = new Random();
        char ulang = ' ' ;
        
        do{
            System.out.println("===Program Matriks===");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Identitas");
            System.out.println("5. Transpose");
            System.out.println("6. Exit");
            System.out.println("Pilih Program yang ingin dijalankan = ");
            menu = in.nextInt();
            
            if(menu > 0 && menu < 6){
                System.out.print("Masukkan jumlah baris array M = ");
                bM = in.nextInt();
                System.out.print("Masukkan jumlah kolom array M = ");
                kM = in.nextInt();
                System.out.print("Masukkan jumlah baris array N = ");
                bN = in.nextInt();
                System.out.print("Masukkan jumlah kolom array N = ");
                kN = in.nextInt();
                
                M = new int[bM][kM];
                N = new int[bN][kN];
                
                int i, j, k;
                System.out.println("===Isi Matriks===");
                System.out.println("Matriks M = ");
                for(i=0;i<bM; i++){
                    for(j=0;j<kM;j++){
                        M[i][j]= rand.nextInt(10) + 1;
                        System.out.print(M[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
                
                System.out.println("Matriks N = ");
                for(i=0;i<bN;i++){
                    for(j=0;j<kN;j++){
                        N[i][j]=rand.nextInt(10)+1;
                        System.out.print(N[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
                
                switch(menu){
                    case 1:{
                        if(bM == bN && kM == kN){
                            int Tambah[][];
                            Tambah = new int [bM][kM];
                            
                            System.out.println("Hasil penjumlahan matriks M dan N = ");
                            for(i=0;i<bM;i++){
                                for(j=0;j<kM;j++){
                                    Tambah[i][j] = M[i][j] + N[i][j];
                                    System.out.print(Tambah[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }else{
                            System.out.println("Input baris/kolom tidak memenuhi untuk melakukan penjumlahan array");
                            System.out.println("Noted : Array harus berordo sama ");
                        }
                    }
                    case 2:{
                        if(bM == bN && kM == kN){
                            int kurang[][];
                            kurang = new int [bM][kM];
                            
                            System.out.println("Hasil pengurangan matriks M dan N = ");
                            for(i=0;i<bM;i++){
                                for(j=0;j<kM;j++){
                                    kurang[i][j]=M[i][j];
                                    System.out.print(kurang[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }else{
                            System.out.println("Input baris/kolom tidak memenuhi untuk melakukan pengurangan array");
                            System.out.println("Noted : Array harus berorde sama");
                        }
                    }
                    case 3:{
                        if(bM == kN){
                            int kali[][];
                            kali = new int [bM][kN];
                            
                            System.out.println("Hasil perkalian matriks M dan N = ");
                            for(i=0;i<bM;i++){
                                for(j=0;j<kM;j++){
                                    for(k=0;k<kN;k++){
                                        kali[i][j] += M[i][k]* N[k][j];
                                    }
                                    System.out.print(kali[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }else{
                            System.out.println("Baris array M harus sama dengan"
                                     +"kolom array N dalam perkalian matriks");
                        }
                    }
                    case 4:{
                            int IdentitasM[][], IdentitasN[][];
                            IdentitasM = new int [bM][kM];
                            IdentitasN = new int [bN][kN];
                            
                            if(bM !=kM){
                                System.out.println("Hasil matriks identitas N = ");
                                for(i=0;i<bN;i++){
                                    for(j=0;j<kN;j++){
                                        if(i==j)
                                            IdentitasN[i][j]= 1;
                                         else
                                            IdentitasN[i][j]= 0;
                                        System.out.print(N[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                            
                                System.out.println("Array M tidak bisa dibuat dalam bentuk" 
                                                +"identitas karena matriks tidak berbentuk"
                                                +"persegi atau baris tidak sama dengan kolom");
                            }else if(bN !=kN){
                                System.out.println("Hasil matriks identitas M = ");
                                for(i=0;i<bM;i++){
                                    for(j=0;j<kM;j++){
                                        if(i==j)
                                            IdentitasM[i][j] = 1;
                                        else
                                            IdentitasM[i][j] = 0;
                                        System.out.print(M[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                                System.out.println("array N tidak bisa dibuat dalam bentuk"
                                    + " identitas karena matriks tidak berbentuk"
                                    + " persegi atau baris tidak sama dengan kolom");
                            }else{
                                System.out.println("Hasil matriks identitas M = ");
                                for(i=0;i<bM;i++){
                                    for(j=0;j<kM;j++){
                                        if(i==j)
                                            IdentitasM[i][j]= 1;
                                        else
                                            IdentitasM[i][j]= 0;
                                        System.out.print(IdentitasM[i][j]+ "\t");
                                    }
                                    System.out.println();
                                }
                                System.out.println();

                                System.out.println("Hasil matriks identitas N = ");
                                for(i=0;i<bN;i++) {
                                    for(j=0;j<kN;j++) {
                                        if(i==j)
                                            IdentitasN[i][j]= 1;
                                        else
                                            IdentitasN[i][j]= 0;
                                        System.out.print(IdentitasN[i][j] + "\t");
                                    }
                                     System.out.println();
                                }
                                System.out.println();
                            }
                    }
                    case 5:{
                        int TransposeM[][], TransposeN[][];
                        TransposeM= new int[kM][bM];
                        TransposeN= new int[kN][bN];

                        System.out.println("Hasil transpose matriks M = ");
                        for(i=0;i<bM;i++){
                            for(j=0;j<kM;j++) {
                                TransposeM[j][i]= M[i][j];
                            }
                        }
                        for(i=0;i<kM;i++) { 
                            for(j=0;j<bM;j++) { 
                                System.out.print(TransposeM[i][j]+ "\t"); 
                            }
                            System.out.println();
                        }
                        System.out.println();
                        
                        System.out.println("Hasil transpose matriks N = ");
                        for(i=0;i<bN;i++) {
                            for(j=0;j<kN;j++) {
                                TransposeN[j][i]= N[i][j];
                            }
                        }
                        for(i=0;i<kN;i++) { 
                            for(j=0;j<bN;j++) { 
                                System.out.print(TransposeN[i][j]+ "\t"); 
                            }
                            System.out.println();
                        }
                        System.out.println();
                    }
                }
            System.out.print("Apakah ingin mengulang ? (y/n)");
            ulang = in.next().charAt(0);
            }else if(menu == 6){
                    ulang = 'n';
                    System.out.print("Anda telah keluar dari program");
            }else{
                    System.out.println("Pilihan tidak ada di menu");
                    System.out.print("Apakah ingin mengulang program ? (y/n)");
                    ulang = in.next().charAt(0);
            }
        }while(ulang == 'y');
    }
}