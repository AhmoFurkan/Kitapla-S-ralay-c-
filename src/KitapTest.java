import java.util.*;
public class KitapTest {
    public static void main(String[] args) {
        // 5 kitap nesnesi oluşturuluyor
        Kitap kitap1 = new Kitap("Zamanın Kısa Tarihi", 256, "Stephen Hawking", "1988");
        Kitap kitap2 = new Kitap("Hayvan Çiftliği", 112, "George Orwell", "1945");
        Kitap kitap3 = new Kitap("1984", 328, "George Orwell", "1949");
        Kitap kitap4 = new Kitap("Sefiller", 1232, "Victor Hugo", "1862");
        Kitap kitap5 = new Kitap("Kürk Mantolu Madonna", 160, "Sabahattin Ali", "1943");

        // Kitaplar isme göre sıralanacak şekilde TreeSet'e ekleniyor
        Set<Kitap> kitapSetiIsmeGore = new TreeSet<>();
        kitapSetiIsmeGore.add(kitap1);
        kitapSetiIsmeGore.add(kitap2);
        kitapSetiIsmeGore.add(kitap3);
        kitapSetiIsmeGore.add(kitap4);
        kitapSetiIsmeGore.add(kitap5);

        System.out.println("📚 Kitaplar isme göre (A'dan Z'ye) sıralı:");
        for (Kitap kitap : kitapSetiIsmeGore) {
            System.out.println(kitap);
        }

        // Sayfa sayısına göre sıralama için Comparator tanımlanıyor
        Set<Kitap> kitapSetiSayfaSayisinaGore = new TreeSet<>(Comparator.comparingInt(Kitap::getSayfaSayisi));
        kitapSetiSayfaSayisinaGore.addAll(kitapSetiIsmeGore);

        System.out.println("\n📖 Kitaplar sayfa sayısına göre sıralı:");
        for (Kitap kitap : kitapSetiSayfaSayisinaGore) {
            System.out.println(kitap);
        }
    }
}