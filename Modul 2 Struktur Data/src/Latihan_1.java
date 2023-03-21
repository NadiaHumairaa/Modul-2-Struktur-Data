import java.util.ArrayList;

public class Latihan_1 {
    public static void main(String[] args) {

        // objek
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Nama hewan yang ditambahakan : ");
        System.out.println(hewan);

        // objek
        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        // objek
        ArrayList<String> deletedData = new ArrayList<>();

        // indeks yg di ibratkan = data dari deleteHewan,
        for (String warna : deleteHewan) {
            hewan.removeIf(h -> h.equals(warna));
            deletedData.add(warna);
        }

        System.out.println("\nHewan yang dihapus : ");
        System.out.println(deletedData);
        System.out.println("\nOutput hewan setelah dihapus : ");
        System.out.println(hewan);
    }
}
