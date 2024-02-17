package com.atahan.SORU2;

public class CustomStringTrTest {
    public static void main(String[] args) {


        CustomStringTr ifade = new CustomStringTr("Merhaba Dünya");


        System.out.println("Uzunluk: " + ifade.uzunluk());


        System.out.println("Bos mu: " + ifade.bosMu());


        System.out.println("4. karakter: " + ifade.karakterAt(3));


        System.out.println("Alt metin (2 ve 5. hafr): " + ifade.altMetin(1, 5));


        System.out.println("Büyük harf: " + ifade.buyukHarf());


        System.out.println("Küçük harf: " + ifade.kucukHarf());


        System.out.println("Boşluk sayısı: " + ifade.boslukSayisi());
    }
}
