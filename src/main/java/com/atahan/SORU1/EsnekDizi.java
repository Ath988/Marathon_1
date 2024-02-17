package com.atahan.SORU1;

public class EsnekDizi {
    private Object[] dizi;
    private int boyut;
    private int kapasite;

    public EsnekDizi(int kapasite) {
        this.kapasite = kapasite;
        this.boyut = 0;
        this.dizi = new Object[kapasite];
    }
    public void add(Object eleman) {
        if (boyut == kapasite) {
            kapasite *= 2; // Kapasiteyi iki katına çıkarma
            Object[] yeniDizi = new Object[kapasite];
            System.arraycopy(dizi, 0, yeniDizi, 0, boyut);
            dizi = yeniDizi;
        }
        dizi[boyut++] = eleman;
    }

    public void remove(int index) {
        if (index < 0 || index >= boyut) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }
        System.arraycopy(dizi, index + 1, dizi, index, boyut - index - 1);
        dizi[--boyut] = null;
    }

    public void add(int index, Object eleman) {
        if (index < 0 || index > boyut) {
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
        }
        if (boyut == kapasite) {
            kapasite *= 2; // Kapasiteyi iki katına çıkarma
            Object[] yeniDizi = new Object[kapasite];
            System.arraycopy(dizi, 0, yeniDizi, 0, index);
            System.arraycopy(dizi, index, yeniDizi, index + 1, boyut - index);
            dizi = yeniDizi;
        } else {
            System.arraycopy(dizi, index, dizi, index + 1, boyut - index);
        }
        dizi[index] = eleman;
        boyut++;
    }

    public Object[] liste() {
        Object[] sonuc = new Object[boyut];
        System.arraycopy(dizi, 0, sonuc, 0, boyut);
        return sonuc;
    }

}
