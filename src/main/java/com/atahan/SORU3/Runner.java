package com.atahan.SORU3;

public class Runner {
    public static void main(String[] args) {


        Kopek hayvan1 = new Kopek("", "Golden Retriever");
        Kedi hayvan2 = new Kedi("", "British ShortHair");
        Kanarya hayvan3 = new Kanarya("Muhabbet Kuşu");

        System.out.println("Hayvan sayısı: " + Hayvan.HayvanSayisi.sayi);
        System.out.println("-----------------");
        System.out.println(hayvan1.getTur());
        hayvan1.beslen(); // Çıktı: Memeliler besleniyor.
        hayvan1.hareketEt(); // Çıktı: Memeliler hareket ediyor.
        hayvan1.sesCikar(); // Çıktı: Hav hav!

        System.out.println("-----------------");
        System.out.println(hayvan2.getTur());
        hayvan2.beslen(); // Çıktı: Memeliler besleniyor.
        hayvan2.hareketEt(); // Çıktı: Memeliler hareket ediyor.
        hayvan2.sesCikar(); // Çıktı: Miyav!

        System.out.println("-----------------");
        System.out.println(hayvan3.getTur());
        hayvan3.beslen(); // Çıktı: Memeliler besleniyor.
        hayvan3.hareketEt(); // Çıktı: Memeliler hareket ediyor.
        hayvan3.sesCikar(); // Çıktı: Cik cik!







    }
}
