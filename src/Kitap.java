import java.util.*;

// Kitap sınıfı Comparable arayüzünü implement ediyor
class Kitap implements Comparable<Kitap> {
    private String isim;
    private int sayfaSayisi;
    private String yazar;
    private String yayinTarihi;

    public Kitap(String isim, int sayfaSayisi, String yazar, String yayinTarihi) {
        this.isim = isim;
        this.sayfaSayisi = sayfaSayisi;
        this.yazar = yazar;
        this.yayinTarihi = yayinTarihi;
    }

    public String getIsim() {
        return isim;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public String getYazar() {
        return yazar;
    }

    public String getYayinTarihi() {
        return yayinTarihi;
    }

    // Kitap ismine göre karşılaştırma (A'dan Z'ye)
    @Override
    public int compareTo(Kitap diger) {
        return this.isim.compareTo(diger.isim);
    }

    @Override
    public String toString() {
        return isim + " | " + sayfaSayisi + " sayfa | " + yazar + " | " + yayinTarihi;
    }
}