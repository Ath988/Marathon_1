package com.atahan.SORU3;

public class Hayvan {
    private String tur;

    public Hayvan(String tur) {
        this.tur = tur;
    }
    public void beslen() {
        System.out.println(tur + " besleniyor.");
    }

    public void hareketEt() {
        System.out.println(tur + " hareket ediyor.");
    }

    class HayvanSayisi {
        static int sayi = 100;
    }

    // Encapsulation
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}
