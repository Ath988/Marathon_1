package com.atahan.SORU1;

public class RunnerEsnek {

    public static void main(String[] args) {

        EsnekDizi dizi = new EsnekDizi(5);
        dizi.add("Eleman 1");
        dizi.add("Eleman 2");
        dizi.add("Eleman 3");

        System.out.println("Dizi Boyutu: " + dizi.liste().length); //boyut

        System.out.println("Dizi Elemanları:");
        for (Object eleman : dizi.liste()) {
            System.out.println(eleman);  //elemanları yazdrma

        }

        dizi.remove(3); // eleman silmek
        System.out.println("Dizi Boyutu (Eleman Silindi): " + dizi.liste().length);

        System.out.println("Dizi Elemanları (Indeksten Sonra Eleman Silindi):");
        for (Object eleman : dizi.liste()) {
            System.out.println(eleman);
        }


        dizi.add(2, "Yeni Eleman"); // eleman ekleme
        System.out.println("Dizi Boyutu (Indekse Yeni Eleman Eklendi): " + dizi.liste().length);

        System.out.println("Dizi Elemanları (Yeni Eleman Eklendi):");
        for (Object eleman : dizi.liste()) {
            System.out.println(eleman);


        }
    }
}