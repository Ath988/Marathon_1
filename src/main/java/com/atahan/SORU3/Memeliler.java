package com.atahan.SORU3;

public class Memeliler extends Hayvan {

    private String cins;

    public Memeliler(String tur, String cins) {
        super(tur);
        this.cins = cins;
    }

    @Override
    public void hareketEt() {
        System.out.println(cins + " " + super.getTur() + " hareket ediyor.");
    }
    void nefesAl() {
        System.out.println("Memeliler nefes alır.");
    }
}
