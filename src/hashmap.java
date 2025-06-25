import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> ogrenciler = new HashMap<>();

        ogrenciler.put("Ecenur", 84);
        ogrenciler.put("Arda", 80);
        ogrenciler.put("Zeynep", 72);

        
        System.out.println("Tüm veriler: " + ogrenciler);
    }
}
