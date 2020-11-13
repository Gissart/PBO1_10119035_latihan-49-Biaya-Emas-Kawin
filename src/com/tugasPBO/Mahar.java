package com.tugasPBO;

public class Mahar {
    private int hargaPerGram;
    private double beratBeli;

    public Mahar( int harga, double beli){
        this.hargaPerGram = harga;
        this.beratBeli = beli;
    }

    public int getHargaPerGram(){
        return hargaPerGram;
    }

    public double getBeratBeli(){
        return beratBeli;
    }

    public double hitung(int hargaPerGram, double beratBeli){
        return hargaPerGram * beratBeli;
    }

}
