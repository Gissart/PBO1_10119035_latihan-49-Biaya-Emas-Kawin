package com.tugasPBO;
/*Nama      : Argya Aulia Fauzandika
  NIM       : 10119035
  Kelas     : PBO1/ IF1
  Deskripsi : menghitung biaya yang dibutuhkan untuk membeli emas
* */

public class Main {
    public static void main(String[] args){
        Mahar mahar = new Mahar(570000,15.7);
        System.out.println("Harga 1gram emas per oktober        : Rp"+mahar.getHargaPerGram());
        System.out.println("berat emas yang dibutuhkan          : "+mahar.getBeratBeli()+"g");
        System.out.println("Total biaya yang harus dikeluarkan  : Rp "+mahar.hitung(
                mahar.getHargaPerGram(), mahar.getBeratBeli())
        );
    }
}
