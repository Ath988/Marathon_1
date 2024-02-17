package com.atahan.SORU3;

class Baliklar extends Hayvan implements Yuzme {
    public Baliklar(String tur) {
        super(tur);
    }

    @Override
    public void yuz() {
        System.out.println("Balıklar yüzer.");
    }
    void solungacli() {
        System.out.println("Balıklar solungaçlıdır.");
    }
}
