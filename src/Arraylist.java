import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> notlar = new ArrayList<>();
        ArrayList<String> ogrenci = new ArrayList<>();

        ogrenci.add("Ece");
        ogrenci.add("Mert");
        ogrenci.add("Uraz");
        notlar.add(50);
        notlar.add(40);
        notlar.add(60);

        System.out.println("ogrenci listesi: " + ogrenci);
        System.out.println("İlk ogrenci: " + ogrenci.get(0));
        System.out.println("Toplam ogrenci: " + ogrenci.size());
        System.out.println("Notlar:" + notlar);
    }
}
