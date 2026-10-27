import java.util.ArrayList;

public class RentalDemo {
    public static void main(String[] args) {
        //polymorfisme untuk menempatkan subclass yg berbeda pada 1 parent arraylist
        ArrayList<Kendaraan> daftarRental = new ArrayList<>();

        daftarRental.add(new Mobil("B 1234 ABC", 350000, 50000));
        daftarRental.add(new SepedaListrik("SL 999 XY", 50000, 15.5));

        System.out.println("=== DAFTAR RENTAL KENDARAAN ===");
        for (Kendaraan k : daftarRental) {
            System.out.println("No Plat: " + k.getNoPlat());
            System.out.println("Biaya Sewa (2 Hari): Rp " + k.hitungBiayaSewa(2));

            //chech interface dinamis
            if (k instanceof Chargable) {
                Chargable unitListrik = (Chargable) k;
                unitListrik.isiBaterai();
            }
            System.out.println("---------------------------------");
        }
    }
}