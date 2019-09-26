/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan6kambingstaticdankonstanta;

/**
 *
 * @author 
 * Nama  : Muhammad Rakha Firdaus
 * NIM   : 10118059
 * Kelas : IF-2
 *  
 */
public class PBO210118059Latihan6KambingStaticDanKonstanta {

    //Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;


public class KambingStatic {
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
}   
    public static void main(String[] args) {
        PBO210118059Latihan6KambingStaticDanKonstanta.jumlahKambing = 485000;
        String NAMA_KAMBING = "MIDUN";
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + PBO210118059Latihan6KambingStaticDanKonstanta.jumlahKambing);
    }
} 
