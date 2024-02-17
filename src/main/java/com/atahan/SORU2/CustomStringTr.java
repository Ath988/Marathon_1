package com.atahan.SORU2;

public class CustomStringTr {
    private String ifade;

    public CustomStringTr(String ifade) {
        this.ifade = ifade;
    }

    public int uzunluk() {
        return ifade.length();
    }

    public boolean bosMu() {
        return ifade.isEmpty();
    }

    public char karakterAt(int index) {
        return ifade.charAt(index);
    }

    public int indexOf(String str) {
        return ifade.indexOf(str);
    }

    public String altMetin(int baslangic, int bitis) {
        return ifade.substring(baslangic, bitis);
    }

    public String buyukHarf() {
        return ifade.toUpperCase();
    }

    public String kucukHarf() {
        return ifade.toLowerCase();
    }


    public int boslukSayisi() {
        int sayac = 0;
        for (int i = 0; i < ifade.length(); i++) {
            if (ifade.charAt(i) == ' ') {
                sayac++;
            }
        }
        return sayac;
    }
}